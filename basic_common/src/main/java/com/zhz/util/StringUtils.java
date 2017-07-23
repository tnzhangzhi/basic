package com.zhz.util;

import java.util.Random;

/**
 * @author jared
 * @Description: String工具类
 * @date Nov 5, 2014 3:36:54 PM
 */
public class StringUtils {

    private static Random RANDOM = new Random(System.currentTimeMillis());

    /**
     * 字符串截取
     *
     * @param source 源字符串
     * @param size   截取长度
     * @return
     */
    public static String substring(String source, int size) {
        return substring(source, 0, size);
    }

    /**
     * 字符串截取
     *
     * @param source 源字符串
     * @param offset 字符截取位子
     * @param size   截取长度
     * @return
     */
    public static String substring(String source, int offset, int size) {
        if (source == null || size < 1 || offset < 0) {
            return "";
        }

        if (source.length() <= (offset + size)) {
            return source;
        }

        return source.substring(offset, size);
    }

    /**
     * 字符串是否不为空
     *
     * @param str
     * @return
     */
    public static boolean isNotEmpty(String str) {
        return !StringUtils.isEmpty(str);
    }

    /**
     * 字符串是否为空
     *
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        int strLen;
        if (str == null || (strLen = str.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if ((Character.isWhitespace(str.charAt(i)) == false)) {
                return false;
            }
        }
        return true;
    }

    /**
     * 判断字符串不为空
     *
     * @param values 多字符串
     * @return
     */
    public static boolean isNotEmpty(String... values) {
        if (values != null && values.length > 0) {
            for (String value : values) {
                if (value == null || value.length() == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    /**
     * 字符串为空时赋默认值，不为空则返回本身
     *
     * @param value 字符串
     * @param def   默认值
     * @return
     */
    public static String emptyToDefault(String value, String def) {
        return (value == null || value.length() == 0) ? def : value;
    }

    /**
     * 过滤表情等特殊符号
     *
     * @param source
     * @return
     */
    public static String escapeEmoji(String source) {
        if (StringUtils.isNotEmpty(source)) {
            StringBuilder buff = new StringBuilder(source.length());
            for (char codePoint : source.toCharArray()) {
                if (((codePoint == 0x0) || (codePoint == 0x9) || (codePoint == 0xA) || (codePoint == 0xD)
                        || ((codePoint >= 0x20) && (codePoint <= 0xD7FF))
                        || ((codePoint >= 0xE000) && (codePoint <= 0xFFFD)) || ((codePoint >= 0x10000) && (codePoint <= 0x10FFFF)))) {
                    buff.append(codePoint);
                }
            }
            return buff.toString();
        }
        return source;
    }




    /**
     * 判断字符串中第几位开始包含指定字符串
     *
     * @param source
     * @param sub
     * @param offset 第几位开始
     * @return
     */
    public static boolean contains(String source, String sub, int offset) {
        return isNotEmpty(source) && source.indexOf(sub, offset) >= offset;
    }


    public static final char UNDERLINE = '_';

    /**
     * 驼峰转下划线写法
     * @param param
     * @return
     */
    public static String camelToUnderline(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /**
     * 下划线转驼峰写法
     * @param param
     * @return
     */
    public static String underlineToCamel(String param) {
        if (param == null || "".equals(param.trim())) {
            return "";
        }
        int len = param.length();
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            char c = param.charAt(i);
            if (c == UNDERLINE) {
                if (++i < len) {
                    sb.append(Character.toUpperCase(param.charAt(i)));
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
