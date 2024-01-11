package com.parker.common.exception.enums;

import org.springframework.http.HttpStatus;

/**
 * com.parker.admin.exception.enums
 * ㄴ ResponseErrorCode
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

public enum ResponseErrorCode {
    /**
     * HTTP 상태 코드
     */
    FAIL_400("FAIL_400", HttpStatus.BAD_REQUEST),
    FAIL_401("FAIL_401", HttpStatus.UNAUTHORIZED),
    FAIL_403("FAIL_403", HttpStatus.FORBIDDEN),
    FAIL_404("FAIL_404", HttpStatus.NOT_FOUND),
    FAIL_405("FAIL_405", HttpStatus.METHOD_NOT_ALLOWED),
    FAIL_500("FAIL_500", HttpStatus.INTERNAL_SERVER_ERROR),

    /**
     * CustomException 상태 코드
     */
    FAIL_2000("FAIL_2000", HttpStatus.INTERNAL_SERVER_ERROR);


    ResponseErrorCode(String code, HttpStatus status) {
        this.code = code;
        this.status = status;
    }

    private final String code;
    private final HttpStatus status;

    public String code() {
        return code;
    }
    public HttpStatus status() {
        return status;
    }
}