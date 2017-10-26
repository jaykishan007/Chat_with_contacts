package com.example.jaykishan.niki;

import java.util.Date;

/**
 * Created by jaykishan on 13/10/17.
 */

public class ChatModel {

    private String message;

    public ChatModel(String message, String receiver, String sender) {
        this.message = message;
        this.receiver = receiver;
        this.sender = sender;
    }

    private String receiver;
    private String sender;
    private Date time;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
