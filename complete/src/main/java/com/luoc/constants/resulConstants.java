package com.luoc.constants;

/**
 * @author luoc
 * @date 2018/11/12 0012
 * @Time 11:24
 */
public enum resulConstants{

    /**
     *  成功状态码
     */
    SUCCESS("success",200),
    //FAIL("fail",500);

    FAIL("fail",200);


    private  String value;
    private Integer code;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    resulConstants(String value, Integer code) {
        this.value = value;
        this.code = code;
    }
}
