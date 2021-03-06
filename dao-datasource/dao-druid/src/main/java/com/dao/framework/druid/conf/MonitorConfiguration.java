package com.dao.framework.druid.conf;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.spring.stat.DruidStatInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.JdkRegexpMethodPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * 监控配置
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2018年09月11日 11:11:00
 */
public class MonitorConfiguration {

    /**
     * 配置自动注入
     */
    @Autowired
    private DaoDruidProperties daoDruidProperties;


    @Bean
    public DruidStatInterceptor druidStatInterceptor() {
        return new DruidStatInterceptor();
    }

    /**
     * 监控路径
     *
     * @param
     * @return
     * @author 阿导
     * @time 2018/9/11 11:40
     * @CopyRight 万物皆导
     */
    @Bean
    public JdkRegexpMethodPointcut druidStatPointcut() throws IllegalAccessException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        // 获取监控配置
        List<String> patterns = daoDruidProperties.getMonitor().getPatterns();
        List<String> excludedPatterns = daoDruidProperties.getMonitor().getExcludedPatterns();

        // 拦截配置
        JdkRegexpMethodPointcut druidStatPointcut = new JdkRegexpMethodPointcut();
        Class<?> clazz = druidStatPointcut.getClass();
        // 规则设置
        setPatterns(patterns, "patterns", "initPatternRepresentation", clazz, druidStatPointcut);
        setPatterns(excludedPatterns, "excludedPatterns", "initExcludedPatternRepresentation", clazz, druidStatPointcut);
        // 返回
        return druidStatPointcut;
    }

    /**
     * 设置拦截属性
     *
     * @param patterns
     * @param filedName
     * @param methodName
     * @param clazz
     * @param druidStatPointcut
     * @return
     * @author 阿导
     * @time 2018/9/11 13:26
     * @CopyRight 万物皆导
     */
    private void setPatterns(List<String> patterns, String filedName, String methodName, Class clazz, JdkRegexpMethodPointcut druidStatPointcut) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (!CollectionUtils.isEmpty(patterns)) {
            String[] array = new String[patterns.size()];
            patterns.toArray(array);
            Field field = clazz.getSuperclass().getDeclaredField(filedName);
            field.setAccessible(true);
            field.set(druidStatPointcut, array);
            Method method = clazz.getDeclaredMethod(methodName, String[].class);
            method.setAccessible(true);
            method.invoke(druidStatPointcut, new Object[]{array});
        }
    }

    /**
     * druid
     *
     * @param
     * @return
     * @author 阿导
     * @time 2018/9/11 11:38
     * @CopyRight 万物皆导
     */
    @Bean
    public Advisor druidStatAdvisor() throws InvocationTargetException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
        return new DefaultPointcutAdvisor(druidStatPointcut(), druidStatInterceptor());
    }


    /**
     * 声明一个 Servlet
     *
     * @param
     * @return
     * @author 阿导
     * @time 2018/9/11 11:36
     * @CopyRight 万物皆导
     */

    @Bean
    public ServletRegistrationBean druidStatViewServlet() {

        // 获取监控配置
        DaoDruidProperties.Monitor monitor = daoDruidProperties.getMonitor();

        //org.springframework.boot.context.embedded.ServletRegistrationBean提供类的进行注册.
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new StatViewServlet(), monitor.getServlet());
        //添加初始化参数：initParams


        //白名单：
        if (!CollectionUtils.isEmpty(monitor.getAllowList())) {
            monitor.getAllowList().forEach(allow -> servletRegistrationBean.addInitParameter("allow", allow));
        }

        //IP黑名单 (存在共同时，deny优先于allow) : 如果满足deny的话提示:Sorry, you are not permitted to view this page.
        if (!CollectionUtils.isEmpty(monitor.getDenyList())) {
            monitor.getDenyList().forEach(deny -> servletRegistrationBean.addInitParameter("deny", deny));
        }

        //登录查看信息的账号密码.
        servletRegistrationBean.addInitParameter("loginUsername", monitor.getLoginUsername());
        servletRegistrationBean.addInitParameter("loginPassword", monitor.getLoginPassword());

        //是否能够重置数据.
        servletRegistrationBean.addInitParameter("resetEnable", monitor.getResetEnable());

        return servletRegistrationBean;
    }


    /**
     * 注册一个：filterRegistrationBean
     *
     * @param
     * @return
     * @author 阿导
     * @time 2018/9/11 11:37
     * @CopyRight 万物皆导
     */
    @Bean
    public FilterRegistrationBean druidStatFilter() {
        // 获取监控配置
        DaoDruidProperties.Monitor monitor = daoDruidProperties.getMonitor();

        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new WebStatFilter());
        //添加过滤规则.
        filterRegistrationBean.addUrlPatterns(monitor.getLoginFilter());
        //添加不需要忽略的格式信息.
        filterRegistrationBean.addInitParameter("exclusions", monitor.getLoginPass());
        return filterRegistrationBean;

    }
}
