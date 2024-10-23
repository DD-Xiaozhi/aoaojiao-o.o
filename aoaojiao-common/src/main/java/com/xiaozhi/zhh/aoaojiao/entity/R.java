package com.xiaozhi.zhh.aoaojiao.entity;

import com.xiaozhi.zhh.aoaojiao.toolkit.MDCUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

/**
 * @author DD
 * date    2024/10/21 11:19
 */
@Data
@AllArgsConstructor
public class R<T> {

    public static final String SUCCESS_CODE = "00000";

    private String code;

    private String message;

    private String traceId;

    private T data;

    public boolean isSuccess() {
        return SUCCESS_CODE.equals(code);
    }

    public static <T> R<T> success(T data) {
        return new R<>(SUCCESS_CODE, StringUtils.EMPTY, MDCUtil.getTraceId(), data);
    }

    public static <T> R<T> success() {
        return new R<>(SUCCESS_CODE, StringUtils.EMPTY, MDCUtil.getTraceId(), null);
    }

    public static <T> R<T> error(String code, String message) {
        return new R<>(code, message, MDCUtil.getTraceId(), null);
    }

    public static <T> R<T> error(ErrorCode errorCode) {
        return new R<>(errorCode.getCode(), errorCode.getMessage(), MDCUtil.getTraceId(), null);
    }

}
