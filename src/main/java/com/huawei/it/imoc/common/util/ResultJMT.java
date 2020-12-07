package com.huawei.it.imoc.common.util;
import java.util.ArrayList;
public class ResultJMT {



    /**
     * 返回信息
     */
    private int status;

    private String message;

    private String total; //总条数

    private Object data;



    public ResultJMT() {
    }

    /**
     * 查询数据返回成功
     *
     * @param data
     * @return
     */
    public static ResultJMT successQueryResultModel(String total,Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultJMT(1000,total, "返回成功",data);
    }

    public ResultJMT(int isstatus, String Ttotal,String ismessage, Object isresultValue) {
        this.status = isstatus;
        this.message = ismessage;
        this.total = Ttotal;
        this.data = isresultValue;

    }

    public ResultJMT(int isstatus, String ismessage,String  total) {
        this.status = isstatus;
        this.message = ismessage;
        this.total = total;
        this.data = new ArrayList<>();
    }


    public int getStatus() {
        return status;
    }
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }


}

