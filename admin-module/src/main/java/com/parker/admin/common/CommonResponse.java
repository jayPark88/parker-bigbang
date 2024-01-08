package com.parker.admin.common;

import lombok.Getter;
import lombok.Setter;

/**
 * com.parker.admin.common
 * ㄴ CommonResponse
 *
 * <pre>
 * description :
 * </pre>
 *
 * <pre>
 * <b>History:</b>
 *  parker, 1.0, 12/30/23  초기작성
 * </pre>
 *
 * @author parker
 * @version 1.0
 */
@Getter
@Setter
public class CommonResponse<T> {
    private boolean result;
    private T data;
    private String errorCode;
    private String errorMessage;

    public CommonResponse(T data) {
        this.result = true;
        this.data = data;
    }

    public CommonResponse(String errorCode, String errorMessage) {
        this.result = false;
        this.errorCode= errorCode;
        this.errorMessage= errorMessage;
    }
}