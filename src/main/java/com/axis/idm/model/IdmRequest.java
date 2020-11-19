package com.axis.idm.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdmRequest {
    public String idmRequestID = null;

    IdmRequest() { }

    IdmRequest(String value){
        this.idmRequestID = value;
    }
}
