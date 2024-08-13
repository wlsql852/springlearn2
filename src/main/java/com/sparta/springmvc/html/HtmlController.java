package com.sparta.springmvc.html;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HtmlController {
    private static long visitCount = 0;

    @GetMapping("/static-hello")     //static에 들어간 페이지는 controller를 거치지 않고 직접 들어가기 때문에 소용이 없음
    public String hello() {
        return "hello.html";
    }

    //한번 돌아서 접근
    @GetMapping("/html/redirect")
    public String htmlStatic() {
        return "redirect:/hello.html";
    }

    //templates 페이지
    @GetMapping("/html/templates")
    public String htmlTemplates() {
        return "hello";  //html 이름 문자열만 넣으면 됨
    }

    @GetMapping("/html/dynamic")
    public String htmlDynamic(Model model) {
        visitCount++;
        model.addAttribute("visits", visitCount);  //데이터 명칭, 넣는 데이터
        return "hello-visit";
    }

}
