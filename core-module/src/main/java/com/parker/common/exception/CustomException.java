package com.parker.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * com.parker.admin.exception
 * ㄴ CustomException
 *
 * <pre>
 * description :
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 *  parker, 1.0, 12/29/23  초기작성
 * </pre>
 *
 * @author parker
 * @version 1.0
 */
@Getter
public class CustomException extends RuntimeException{
    private final String errorCode;
    private final String message;
    private final HttpStatus httpStatus;

    public CustomException(String errorCode, String message, HttpStatus httpStatus) {
        this.errorCode = errorCode;
        this.message = message;
        this.httpStatus = httpStatus;
    }
}