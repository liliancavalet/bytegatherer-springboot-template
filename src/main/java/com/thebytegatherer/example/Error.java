package com.thebytegatherer.example;

import java.time.Instant;

public class Error {

    private String code;
    private String title;
    private String detail;
    private Instant timestamp;

    public Error(String code, String title, String detail, Instant timestamp){
        this.code = code;
        this.title = title;
        this.detail = detail;
        this.timestamp = timestamp;
    }
}
