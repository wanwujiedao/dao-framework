package com.wwjd.framework.utils;
/**
 * 字符串工具类
 *
 * @author 阿导
 * @CopyRight 萬物皆導
 * @Created 2019/4/29 21:03:00
 */
public class DaoStringUtils {


    /**
     * 字符串是否为空
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @param cs
     * @return boolean
     */
    public static boolean isEmpty(CharSequence cs) {
        return cs == null || cs.length() == 0;
    }

    /**
     * 字符串是否不为空
     *
     * @author 阿导
     * @time 2019/8/21 :00
     * @param cs
     * @return boolean
     */
    public static boolean isNotEmpty(CharSequence cs) {
        return !isEmpty(cs);
    }


    /**
     * 判断是否相等
     *
     * @author 阿导
     * @time 2019/8/22 :00
     * @param a
     * @param b
     * @return boolean
     */
    public static boolean equals(Object a,Object b){
        if(a == null&&b==null){
            return true;
        }

        if(a!=null&&a.equals(b)){
            return true;
        }
        return false;
    }

    public static String capitalize(String str) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            int firstCodepoint = str.codePointAt(0);
            int newCodePoint = Character.toTitleCase(firstCodepoint);
            if (firstCodepoint == newCodePoint) {
                return str;
            } else {
                int[] newCodePoints = new int[strLen];
                int outOffset = 0;
                outOffset = outOffset + 1;
                newCodePoints[outOffset] = newCodePoint;

                int codepoint;
                for(int inOffset = Character.charCount(firstCodepoint); inOffset < strLen; inOffset += Character.charCount(codepoint)) {
                    codepoint = str.codePointAt(inOffset);
                    newCodePoints[outOffset++] = codepoint;
                }

                return new String(newCodePoints, 0, outOffset);
            }
        } else {
            return str;
        }
    }

    public static String uncapitalize(String str) {
        int strLen;
        if (str != null && (strLen = str.length()) != 0) {
            int firstCodepoint = str.codePointAt(0);
            int newCodePoint = Character.toLowerCase(firstCodepoint);
            if (firstCodepoint == newCodePoint) {
                return str;
            } else {
                int[] newCodePoints = new int[strLen];
                int outOffset = 0;
                outOffset = outOffset + 1;
                newCodePoints[outOffset] = newCodePoint;

                int codepoint;
                for(int inOffset = Character.charCount(firstCodepoint); inOffset < strLen; inOffset += Character.charCount(codepoint)) {
                    codepoint = str.codePointAt(inOffset);
                    newCodePoints[outOffset++] = codepoint;
                }

                return new String(newCodePoints, 0, outOffset);
            }
        } else {
            return str;
        }
    }
}
