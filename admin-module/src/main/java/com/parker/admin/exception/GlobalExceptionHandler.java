package com.parker.admin.exception;

import com.parker.admin.common.CommonErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * com.parker.admin.exception
 * ㄴ GlobalExceptionHandler
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
@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler({CustomException.class})
    public ResponseEntity<CommonErrorResponse> handleCustomException(CustomException exception) {
        CommonErrorResponse commonErrorResponse = new CommonErrorResponse(exception.getErrorCode(), exception.getMessage());
        return ResponseEntity.status(exception.getHttpStatus()).body(commonErrorResponse);
    }
}