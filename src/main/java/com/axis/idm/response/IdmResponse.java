package com.axis.idm.response;

public class IdmResponse {
    private String status;
    private String idmValueFirst;
    private String idmValueSecond;


    public IdmResponse(String status, String idmValueFirst, String idmValueSecond) {
        this.status = status;
        this.idmValueFirst = idmValueFirst;
        this.idmValueSecond = idmValueSecond;
    }
}
