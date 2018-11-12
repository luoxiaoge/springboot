package com.luoc.utils;

import com.luoc.constants.resulConstants;

/**
 *
 * the Unified (统一) response entity, include status, msg,data
 * @author luoc
 * @date 2018/11/12 0012
 * @Time 11:17
 */
public class Result {


     private Integer   status;

     private String    msg;

     private Object  data;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


    /**
     *
     * @return 成功无数据返回结果
     */
    public static Result ok(){  return Result.newResult(resulConstants.SUCCESS.getCode(),resulConstants.SUCCESS.getValue(),null); }

    /**
     *
     * @return 失败返回结果
     */
    public  static  Result fail(){ return Result.newResult(resulConstants.FAIL.getCode(),resulConstants.FAIL.getValue(),null); }

    public  static  Result newResult(Integer status, String msg, Object data) {
         Result result = new Result();
         result.setStatus(status);
         result.setData(data);
         result.setMsg(msg);
         return result;
    }
}
