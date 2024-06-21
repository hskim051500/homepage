package com.mysite.homepage;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @GetMapping("/homepage")
    @ResponseBody
    public String index(){
        return "안녕하세요 sbb에 오신것을 환영합니다. \n \t" +
                "sbb는 스프링부트에 대해 학습합니다.";
    }
    @GetMapping("/")
    public String root(){
        return "redirect:/question/list";
    }
}
