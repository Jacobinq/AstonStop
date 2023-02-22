package com.demo.template.api.advice;

import com.demo.template.common.exception.TemplateException;
import com.demo.template.common.response.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(TemplateException.class)
    public Result<?> handleAppException(TemplateException e) {
        return Result.fail(e);
    }
}
