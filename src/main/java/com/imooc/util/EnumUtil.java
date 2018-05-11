package com.imooc.util;

import com.imooc.enums.CodeEnum;

/**
 * @author: Administrator
 * @date: 2018/5/3/003
 * @description:
 */
public class EnumUtil {
    public static <T extends CodeEnum> T getByCode(Integer code, Class<T> enumClass){
        for (T each :enumClass.getEnumConstants()) {
            if(code.equals(each.getCode())){
                return each;
            }
        }
        return null;
    }
}
