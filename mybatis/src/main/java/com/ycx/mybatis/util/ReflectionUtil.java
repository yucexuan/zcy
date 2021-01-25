package com.ycx.mybatis.util;

import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * 反射工具类
 *
 * @author fanxiaochun <fan.xiaochun@chinaott.net>
 * @create 2019-05-03
 */
public class ReflectionUtil {

    /**
     * 递归getDeclaredFields查询字段属性、包括父类
     *
     * @param tclass
     * @param fieldName
     * @return
     */
    public static Field getField(Class<?> tclass, String fieldName) throws NoSuchFieldException {
        Field field = getFieldFromSuperClass(tclass, fieldName);
        if (field == null) {
            throw new NoSuchFieldException(fieldName);
        }
        return field;
    }

    private static Field getFieldFromSuperClass(Class<?> tclass, String fieldName) {
        Field field = getFieldFromClass(tclass, fieldName);
        if (field == null && (tclass = tclass.getSuperclass()) != null) {
            return getFieldFromSuperClass(tclass, fieldName);
        }
        return field;
    }

    private static Field getFieldFromClass(Class<?> tclass, String fieldName) {
        Field[] fields = tclass.getDeclaredFields();
        return Arrays.stream(fields).filter(f ->
                f.getName().equals(fieldName)
        ).findFirst().orElse(null);
    }
}
