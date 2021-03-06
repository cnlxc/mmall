package com.mmall.common;

/**
 * Created by 82138 on 2018/8/11.
 */
public enum ResponseCode {
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGALARGUMENT(2,"ILLEGALARGEMENT");

    private final int code;
    private final String desc;

     ResponseCode(int code,String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {return code;}
    public String getDesc() {return desc;}
}
