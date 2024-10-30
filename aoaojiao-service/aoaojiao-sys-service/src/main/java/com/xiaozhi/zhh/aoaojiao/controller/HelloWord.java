package com.xiaozhi.zhh.aoaojiao.controller;

import com.xiaozhi.zhh.aoaojiao.entity.R;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * @author DiZhiXu
 * date    2024/10/21 23:26
 */
@RestController
@RequiredArgsConstructor
public class HelloWord {

    @GetMapping
    public LocalDateTime hello() {
        return LocalDateTime.now();
    }

    @GetMapping("test")
    public R<LocalDateTime> testLocalDateTime(@RequestParam String date) {
        return R.success(LocalDateTime.now());
    }
}
