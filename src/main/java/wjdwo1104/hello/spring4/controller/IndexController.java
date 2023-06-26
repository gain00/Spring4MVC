package wjdwo1104.hello.spring4.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
     // @RequestMapping("/")은 http://localhost:8080/ 마지막 슬래시랑 매칭
    @RequestMapping("/")
    public String index(Model m){
        //addAttribute(변수명, 대상객체)
        m.addAttribute("sayHello","Hello world from Controller");
        return "index";
    }

}
