package com.wwjd.framework.utils;

/**
 * 其它工具类
 *
 * @author 阿导
 * @CopyRight 万物皆导
 * @Created 2019-08-21 10:48:00
 */
public class DaoOtherUtils {

    /**
     * 返回本身，若为空则返回 null
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @param t
     * @return T
     */
    public static <T> T getSelfOrNull(T t){
        return t==null?null:(DaoStringUtils.isEmpty(t.toString())?null:t);
    }
}
