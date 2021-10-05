package com.example.Thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("helloWorld") // helloWorldへのアクセスを制御する
    public String hello(Model model) {
        model.addAttribute("message", "にゃー"); // 変数messageに値をセットする．この値をThymeleafで表示できる
        return "hello"; // hello.htmlをクライアントに返す
    }
}