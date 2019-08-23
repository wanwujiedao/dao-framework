package com.wwjd.framework.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.lang.reflect.*;

/**
 * 反射工具类.
 * <p>
 * 提供访问私有变量,获取泛型类型Class, 提取集合中元素的属性, 转换字符串到对象等Util函数.
 *
 * @author 阿导
 * @CopyRight 杭州弧途科技有限公司(青团社)
 * @created 2018/5/10 19:48
 * @Modified_By 阿导 2018/5/10 19:48
 */
public class DaoReflectionUtil {

    /**
     * 日志记录
     */
    private static Logger logger = LoggerFactory.getLogger(DaoReflectionUtil.class);

    /**
     * 调用Getter方法.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:48
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类
     * @Param propertyName 属性名称
     */
    public static Object invokeGetterMethod(Object obj, String propertyName) {
        String getterMethodName = "get" + DaoStringUtils.capitalize(propertyName);
        return invokeMethod(obj, getterMethodName, new Class[]{}, new Object[]{});
    }

    /**
     * 调用 Setter 方法.使用 value 的 Class 来查找 Setter 方法.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:49
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类
     * @Param propertyName 属性名称
     * @Param value 值
     */
    public static void invokeSetterMethod(Object obj, String propertyName, Object value) {
        invokeSetterMethod(obj, propertyName, value, null);
    }

    /**
     * 调用Setter方法.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:50
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类名称
     * @Param propertyName 属性名称
     * @Param value 值
     * @Param propertyType 用于查找 Setter 方法,为空时使用 value 的 Class 替代
     */
    public static void invokeSetterMethod(Object obj, String propertyName, Object value, Class<?> propertyType) {
        try {
            if(value==null||"null".equalsIgnoreCase(value.toString())){
                return;
            }
            Class<?> type = propertyType != null ? propertyType : value.getClass();
            String setterMethodName = "set" + DaoStringUtils.capitalize(propertyName);
            if (value == null || DaoStringUtils.isEmpty(value.toString())) {
                return;
            }
            if (type.getName().endsWith("Long")) {
                invokeMethod(obj, setterMethodName, new Class[]{type}, new Object[]{Long.valueOf(value.toString())});
            } else if (type.getName().endsWith("Integer")) {
                invokeMethod(obj, setterMethodName, new Class[]{type}, new Object[]{Integer.valueOf(value.toString())});
            } else if (type.getName().endsWith("Double")) {
                invokeMethod(obj, setterMethodName, new Class[]{type}, new Object[]{Double.valueOf(value.toString())});
            } else {
                invokeMethod(obj, setterMethodName, new Class[]{type}, new Object[]{value});
        
            }
        }catch (Exception e){
            logger.error(e.getMessage(),e);
        }
       
    }

    /**
     * 直接读取对象属性值, 无视 private/protected 修饰符, 不经过 getter 函数.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:52
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类
     * @Param fieldName 属性名称
     */
    public static Object getFieldValue(final Object obj, final String fieldName) {
        Field field = getAccessibleField(obj, fieldName);

        if (field == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + obj + "]");
        }

        Object result = null;
        try {
            result = field.get(obj);
        } catch (IllegalAccessException e) {
            logger.error("不可能抛出的异常{}", e.getMessage());
        }
        return result;
    }

    /**
     * 直接设置对象属性值, 无视private/protected修饰符, 不经过setter函数.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:53
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类
     * @Param fieldName 属性名称
     * @Param value 值
     */
    public static void setFieldValue(final Object obj, final String fieldName, final Object value) {
        Field field = getAccessibleField(obj, fieldName);

        if (field == null) {
            throw new IllegalArgumentException("Could not find field [" + fieldName + "] on target [" + obj + "]");
        }

        try {
            field.set(obj, value);
        } catch (IllegalAccessException e) {
            logger.error("不可能抛出的异常:{}", e.getMessage());
        }
    }

    /**
     * 循环向上转型, 获取对象的 DeclaredField,   并强制设置为可访问.
     * <p>
     * 如向上转型到 Object 仍无法找到, 返回 null.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 20:01
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj
     * @Param fieldName
     */
    public static Field getAccessibleField(final Object obj, final String fieldName) {
        Assert.notNull(obj, "object不能为空");
        Assert.hasText(fieldName, "fieldName");
        for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
            try {
                Field field = superClass.getDeclaredField(fieldName);
                field.setAccessible(true);
                return field;
            } catch (NoSuchFieldException e) {//NOSONAR  
                // Field不在当前类定义,继续向上转型  
            }
        }
        return null;
    }

    /**
     * 直接调用对象方法, 无视 private/protected 修饰符.
     * 用于一次性调用的情况.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 20:02
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类
     * @Param methodName 方法名
     * @Param parameterTypes 参数类型
     * @Param args 参数
     */
    public static Object invokeMethod(final Object obj, final String methodName, final Class<?>[] parameterTypes,
                                      final Object[] args) {
        Method method = getAccessibleMethod(obj, methodName, parameterTypes);
        if (method == null) {
            throw new IllegalArgumentException("Could not find method [" + methodName + "] on target [" + obj + "]");
        }

        try {
            return method.invoke(obj, args);
        } catch (Exception e) {
            throw convertReflectionExceptionToUnchecked(e);
        }
    }

    /**
     * 循环向上转型, 获取对象的 DeclaredMethod,并强制设置为可访问.
     * 如向上转型到 Object 仍无法找到, 返回 null.
     * <p>
     * 用于方法需要被多次调用的情况. 先使用本函数先取得 Method,然后调用 Method.invoke(Object obj, Object... args)
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 20:02
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param obj 实体类
     * @Param methodName 方法名称
     * @Param parameterTypes 参数类型
     */
    public static Method getAccessibleMethod(final Object obj, final String methodName,
                                             final Class<?>... parameterTypes) {
        Assert.notNull(obj, "object不能为空");

        for (Class<?> superClass = obj.getClass(); superClass != Object.class; superClass = superClass.getSuperclass()) {
            try {
                Method method = superClass.getDeclaredMethod(methodName, parameterTypes);

                method.setAccessible(true);

                return method;

            } catch (NoSuchMethodException e) {//NOSONAR  
                // Method不在当前类定义,继续向上转型  
            }
        }
        return null;
    }


    /**
     * 通过反射, 获得 Class 定义中声明的父类的泛型参数的类型.
     * 如无法找到, 返回 Object.class.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:59
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param clazz 类
     */
    @SuppressWarnings({"unchecked", "rawtypes"})
    public static <T> Class<T> getSuperClassGenricType(final Class clazz) {
        return getSuperClassGenricType(clazz, 0);
    }

    /**
     * 通过反射, 获得 Class 定义中声明的父类的泛型参数的类型.
     * <p>
     * 如无法找到, 返回 Object.class.
     * <p>
     * 如 public UserDao extends HibernateDao<User,Long>
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:54
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param clazz 类
     * @Param index 泛型索引，从 0 开始
     */
    @SuppressWarnings("rawtypes")
    public static Class getSuperClassGenricType(final Class clazz, final int index) {

        Type genType = clazz.getGenericSuperclass();

        if (!(genType instanceof ParameterizedType)) {
            logger.warn(clazz.getSimpleName() + "'s superclass not ParameterizedType");
            return Object.class;
        }

        Type[] params = ((ParameterizedType) genType).getActualTypeArguments();

        if (index >= params.length || index < 0) {
            logger.warn("Index: " + index + ", Size of " + clazz.getSimpleName() + "'s Parameterized Type: "
                    + params.length);
            return Object.class;
        }
        if (!(params[index] instanceof Class)) {
            logger.warn(clazz.getSimpleName() + " not set the actual class on superclass generic parameter");
            return Object.class;
        }

        return (Class) params[index];
    }

    /**
     * 将反射时的 checked exception 转换为 unchecked exception.
     *
     * @return
     * @author 阿导
     * @time 2018/5/10 19:54
     * @CopyRight 杭州弧途科技有限公司（青团社）
     * @Param e
     */
    public static RuntimeException convertReflectionExceptionToUnchecked(Exception e) {
        if (e instanceof IllegalAccessException || e instanceof IllegalArgumentException
                || e instanceof NoSuchMethodException) {
            return new IllegalArgumentException("Reflection Exception.", e);
        } else if (e instanceof InvocationTargetException) {
            return new RuntimeException("Reflection Exception.", ((InvocationTargetException) e).getTargetException());
        } else if (e instanceof RuntimeException) {
            return (RuntimeException) e;
        }
        return new RuntimeException("Unexpected Checked Exception.", e);
    }
}  
