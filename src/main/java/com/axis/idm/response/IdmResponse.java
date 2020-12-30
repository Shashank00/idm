package com.axis.idm.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdmResponse {
    @JsonProperty("status")
    private String status;
    @JsonProperty("idmValueFirst")
    private String idmValueFirst;
    @JsonProperty("idmValueSecond")
    private String idmValueSecond;


    public IdmResponse(String status, String idmValueFirst, String idmValueSecond) {
        this.status = status;
        this.idmValueFirst = idmValueFirst;
        this.idmValueSecond = idmValueSecond;
    }
}
