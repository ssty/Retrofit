package com.example.acer.majorproject;

/**
 * Created by acer on 6/30/2018.
 */

public class RegisterResponse {

    private boolean success = false;

    private String message = "";

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
