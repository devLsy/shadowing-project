package com.lsy.commonmodules.common.exception;

import com.lsy.commonmodules.common.enums.ApiReturnCode;

public class BusinessException extends RuntimeException {

    private ApiReturnCode apiReturnCode;
    private String message;

    public BusinessException(ApiReturnCode apiReturnCode) {
        this.apiReturnCode = apiReturnCode;
    }
}
