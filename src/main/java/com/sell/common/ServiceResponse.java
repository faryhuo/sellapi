package com.sell.common;

import com.sun.org.apache.regexp.internal.RE;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.omg.CORBA.ServerRequest;

import java.io.Serializable;

//保证序列化json的时候,如果是null的对象,key也会消失
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServiceResponse<T> implements Serializable{
    private int status;
    private String msg;
    private T data;

    private ServiceResponse(int status){
        this.status=status;
    }

    private ServiceResponse(int status,T data){
        this.status=status;
        this.data=data;
    }

    private ServiceResponse(int status,T data,String msg){
        this.status=status;
        this.data=data;
        this.msg=msg;
    }

    private ServiceResponse(int status,String msg){
        this.status=status;
        this.msg=msg;
    }

    @JsonIgnore
    //使之不在json序列化结果当中
    public  boolean isSuccess(){
        return this.status== ResponseCode.SUCCESS.getCode();
    }

    public int getStatus(){
        return status;
    }

    public String getMsg() {
        return msg;
    }

    public T getData() {
        return data;
    }


    public  static <T>  ServiceResponse<T> createBySuccess(){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode());
    }

    public  static <T>  ServiceResponse<T> createBySuccessMessage(String msg){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    public  static <T>  ServiceResponse<T> createBySuccess(T data){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }

    public  static <T>  ServiceResponse<T> createBySuccess(String msg,T data){
        return new ServiceResponse<T>(ResponseCode.SUCCESS.getCode(),data,msg);
    }

    public  static <T>  ServiceResponse<T> createByError(){
        return new ServiceResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }

    public  static <T>  ServiceResponse<T> createByErrorMessage(String msg){
        return new ServiceResponse<T>(ResponseCode.ERROR.getCode(),msg);
    }

    public  static <T>  ServiceResponse<T> createByError(T data){
        return new ServiceResponse<T>(ResponseCode.ERROR.getCode(),data);
    }

    public  static <T>  ServiceResponse<T> createByErrorCodeMessage(int errorCode,String errorMessage){
        return new ServiceResponse<T>(errorCode,errorMessage);
    }

}
