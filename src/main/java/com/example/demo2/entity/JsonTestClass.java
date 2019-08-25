package com.example.demo2.entity;

import java.util.List;

public class JsonTestClass {
    private String reason;
    private String action;
    private String msg;

    public static  class MsgResult{
        private String posType;
        private String detail;
        private String policyNo;

        public String getPosType() {
            return posType;
        }

        public void setPosType(String posType) {
            this.posType = posType;
        }

        public String getDetail() {
            return detail;
        }

        public void setDetail(String detail) {
            this.detail = detail;
        }

        public String getPolicyNo() {
            return policyNo;
        }

        public void setPolicyNo(String policyNo) {
            this.policyNo = policyNo;
        }
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
