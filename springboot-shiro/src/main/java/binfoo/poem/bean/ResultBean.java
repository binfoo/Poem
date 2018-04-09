package binfoo.poem.bean;

import java.io.Serializable;

/**
 * Created by QueenLi on 2018/4/9.
 */
public class ResultBean<T> implements Serializable{

    public ResultBean(){

    }

    public ResultBean(int code,String msg,T data){
        this.code=code;
        this.msg = msg;
        this.data = data;
    }

    private int code;

    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private T data;





}
