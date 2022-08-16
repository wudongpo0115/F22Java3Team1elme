package com.neusoft.utils;

import java.util.HashMap;
import java.util.Map;

public class MessageAndData {
    private Integer statusCode;//200  400
    private String message;
    private Map<String,Object> dataZone=new HashMap<>();
    public Integer getStatusCode(){
        return statusCode;
    }
    public void setStatusCode(Integer statusCode){
        this.statusCode=statusCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public static MessageAndData success(){
        MessageAndData mad = new MessageAndData();
        mad.setStatusCode(200);
        mad.setMessage("成功");
        return mad;
    }
    public static MessageAndData success(String msg){
        MessageAndData mad = MessageAndData.success();
        mad.setMessage(msg);
        return mad;
    }
    public static MessageAndData error(String msg){
        MessageAndData mad = new MessageAndData();
        mad.setStatusCode(404);
        mad.setMessage(msg);
        return mad;
    }
    public MessageAndData add(String key,Object value){
        this.dataZone.put(key, value);
        return  this;

    }
}
