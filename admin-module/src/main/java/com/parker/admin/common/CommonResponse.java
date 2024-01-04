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
    private final boolean result = true;
    private String message;
    private T data;

    public CommonResponse(T data) {
        this.data = data;
        this.message = "SUCCESS";
    }
}