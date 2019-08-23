package com.wwjd.framework.utils;

import java.util.Map;

/**
 * 集合工具类
 *
 * @author 阿导
 * @CopyRight 萬物皆導
 * @Created 2019-08-21 10:39:00
 */
public class DaoCollectionUtils {


    /**
     * 判断 map 是否为空
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @param map
     * @return boolean
     */
    public static boolean isEmpty(Map map){
        return map==null||map.isEmpty();
    }

    /**
     * 判断 map 是否不为空
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @param map
     * @return boolean
     */
    public static boolean isNotEmpty(Map map){
        return !isEmpty(map);
    }
}
