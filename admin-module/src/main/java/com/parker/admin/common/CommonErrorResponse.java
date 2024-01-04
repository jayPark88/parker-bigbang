package com.parker.admin.common;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * com.parker.admin.common
 * ㄴ CommonErrorResponse
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
@Setter
@AllArgsConstructor
public class CommonErrorResponse {
    private final boolean result = false;
    private String errorCode;
    private String errorMessage;
}