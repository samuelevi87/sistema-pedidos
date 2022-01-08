package com.slevi.sdp.resources.exception;

import java.io.Serializable;

public class FieldMessage implements Serializable {
    private static final long serialVersionUID = 1L;

    private String fieldName;
    private String msg;

    public FieldMessage() {
    }

    public FieldMessage(String fieldName, String msg) {
        this.fieldName = fieldName;
        this.msg = msg;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
