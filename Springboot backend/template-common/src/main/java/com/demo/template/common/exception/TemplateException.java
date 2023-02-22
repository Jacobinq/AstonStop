package com.demo.template.common.exception;

import com.demo.template.common.enums.ErrorCode;
import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class TemplateException extends RuntimeException {
    private ErrorCode errorCode;
}
