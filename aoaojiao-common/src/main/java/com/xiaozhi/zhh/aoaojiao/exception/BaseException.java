package com.xiaozhi.zhh.aoaojiao.exception;


import com.xiaozhi.zhh.aoaojiao.entity.ErrorCode;
import com.xiaozhi.zhh.aoaojiao.enums.GeneralErrorCode;
import lombok.Getter;

import java.io.Serial;

/**
 * @author DD
 * date    2024/05/31 11:13
 */
@Getter
public class BaseException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 6065851934584473359L;

    private final String code;

    public BaseException(String message) {
        this(GeneralErrorCode.INVALID_REQUEST.getCode(), message);
    }

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
    }

    public BaseException(String code, String message, Exception ex) {
        super(message, ex);
        this.code = code;
    }

    public BaseException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }
}