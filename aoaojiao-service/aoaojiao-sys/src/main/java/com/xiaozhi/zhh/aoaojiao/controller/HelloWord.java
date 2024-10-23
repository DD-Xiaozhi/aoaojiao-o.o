package com.xiaozhi.zhh.aoaojiao.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author DiZhiXu
 * date    2024/10/21 23:26
 */
@RestController
@RequiredArgsConstructor
public class HelloWord {

    @GetMapping
    public String hello() {
        return "hello world";
    }
}
