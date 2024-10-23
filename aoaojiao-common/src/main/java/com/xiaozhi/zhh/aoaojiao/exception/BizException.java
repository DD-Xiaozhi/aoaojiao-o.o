package com.xiaozhi.zhh.aoaojiao.exception;

import com.xiaozhi.zhh.aoaojiao.entity.ErrorCode;

/**
 * @author DD
 * date    2024/06/19 17:26
 */
public class BizException extends BaseException {

    public BizException(String code, String message) {
        super(code, message);
    }

    public BizException(ErrorCode errorCode) {
        super(errorCode.getCode(), errorCode.getMessage());
    }
}
