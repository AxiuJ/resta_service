package com.axiuj.springcloud.Api;


import lombok.Data;
import org.springframework.scheduling.support.SimpleTriggerContext;


/**
 * @创建人 axiuj
 * @创建时间 2019/1/23
 * @描述
 */
@Data
public class APIResponse<T> {
    private static final int SUCCESS_CODE = 200;
    private static final String SUCCESS_MSG = "操作成功";

    private static final int FAIL_CODE = 500;

    private static final String FAIL_MSG = "操作失败";

    private int code;

    private String msg;

    private T result;

    APIResponse(){
        this(SUCCESS_CODE,SUCCESS_MSG);
    }
    APIResponse(int code, String msg){
        this(code,msg,null);
    }
    APIResponse(int code, String msg,T result){
        this.code = code;
        this.msg = msg;
        this.result = result;
    }
    public static APIResponse fail(){
        return new APIResponse(FAIL_CODE,FAIL_MSG);
    }
    public static APIResponse other(int code, String msg,Object result){
        return new APIResponse(code,msg,result);
    }
    public static APIResponse success(){
        return new APIResponse();
    }
    public static APIResponse success(Object result){
        return new APIResponse(SUCCESS_CODE,SUCCESS_MSG,result);
    }

}
