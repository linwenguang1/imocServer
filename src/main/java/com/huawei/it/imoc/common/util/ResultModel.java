package com.huawei.it.imoc.common.util;
import java.util.ArrayList;

/**
 * 返回信息
 *
 * @author cll
 */
public class ResultModel {
    public static ResultModel successQueryResultModel;
    private int status;

    private String message;

    private Object data;

    private String total; //总条数

    public ResultModel() {
    }

    /**
     * 查询数据返回成功
     *
     * @param data
     * @return
     */
    public static ResultModel successQueryResultModel(Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(1000, "返回成功", data);
    }

    public static ResultModel successQueryResultModel(Object data, String msg) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(1000, msg, data);
    }

    public static ResultModel successQueryResultModel(String msg) {
        if (msg == null) {
            msg = "返回成功";
        }
        return new ResultModel(1000, msg, new ArrayList<>());
    }

    /**
     * 查询数据返回失败
     *
     * @param data
     * @return
     */
    public static ResultModel failedQueryResultModel(Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(-1000, "返回失败", data);
    }

    public static ResultModel failedQueryResultModel(Object data, String msg) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(-1000, msg, data);
    }

    public static ResultModel failedQueryResultModel(String msg) {
        return new ResultModel(-1000, msg, new ArrayList<>());
    }

    /**
     * 数据处理成功
     *
     * @param data
     * @return
     */
    public static ResultModel successHandleResultModel(Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(1001, "数据处理成功");
    }

    public static ResultModel successHandleResultModel(Object data, String msg) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(1001, msg, data);
    }

    public static ResultModel successHandleResultModel(String msg) {
        if (msg == null) {
            msg = "数据处理成功";
        }
        return new ResultModel(1001, msg);
    }

    /**
     * 数据处理失败
     *
     * @param data
     * @return
     */
    public static ResultModel failedHandleResultModel(Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(-1001, "数据处理失败");
    }

    public static ResultModel failedHandleResultModel(Object data, String msg) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(-1001, msg);
    }

    public static ResultModel failedHandleResultModel(String msg) {
        return new ResultModel(-1001, msg);
    }

    /**
     * 上传文件成功
     *
     * @param data
     * @return
     */
    public static ResultModel successUploadResultModel(Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(1002, "上传文件成功", data);
    }

    public static ResultModel successUploadResultModel(Object data, String msg) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(1002, msg, data);
    }

    public static ResultModel successUploadResultModel(String msg) {
        return new ResultModel(1002, msg, new ArrayList<>());
    }

    /**
     * 上传文件失败
     *
     * @param data
     * @return
     */
    public static ResultModel failedUploadResultModel(Object data) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(-1002, "上传文件失败", data);
    }

    public static ResultModel failedUploadResultModel(Object data, String msg) {
        if (data == null) {
            data = new ArrayList<>();
        }
        return new ResultModel(-1002, msg, data);
    }

    public static ResultModel failedUploadResultModel(String msg) {
        return new ResultModel(-1002, msg, new ArrayList<>());
    }


    public ResultModel(int isstatus, String ismessage, Object isresultValue) {
        this.status = isstatus;
        this.message = ismessage;
        this.data = isresultValue;
    }

    public ResultModel(int isstatus, String ismessage) {
        this.status = isstatus;
        this.message = ismessage;
        this.data = new ArrayList<>();
    }


    public int getStatus() {
        return status;
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
