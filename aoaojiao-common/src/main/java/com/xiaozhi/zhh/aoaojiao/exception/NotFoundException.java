package com.xiaozhi.zhh.aoaojiao.exception;

import com.xiaozhi.zhh.aoaojiao.constant.ErrorMsg;
import com.xiaozhi.zhh.aoaojiao.enums.GeneralErrorCode;

/**
 * 数据库查找不到指定对象异常
 * @author DD
 * date    2024/06/04 13:33
 */
public class NotFoundException extends BaseException {

    public NotFoundException() {
        super(GeneralErrorCode.INVALID_PARAMS.getCode(), ErrorMsg.NOT_FOUND);
    }
}
