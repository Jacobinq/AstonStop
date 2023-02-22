package com.demo.template.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
@Getter
public enum ErrorCode {
    SUCCESS(0, "success"),
    FAILED(1, "failed" );

    private int code;
    private String msg;
}
