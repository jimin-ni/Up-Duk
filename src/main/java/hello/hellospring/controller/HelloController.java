package hello.hellospring.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "portfolio";
    }
//    @GetMapping("hello-mvc")
//    public String helloMvc(@RequestParam(value = "name") String name2, Model model){
//        model.addAttribute("name", name2);
//        return "hello-template";
//    }
//
//    //api 방식(view 없이 그냥 문자 그대로 출력)
//    @GetMapping("hello-string")
//    @ResponseBody
//    public String helloString(@RequestParam(value = "name") String name){
//        return "hello " + name;
//    }
//
//    //json방식 {key:value}
//    @GetMapping("hello-api")
//    @ResponseBody
//    public Hello helloApi(@RequestParam(value = "name") String name){
//        Hello hello = new Hello();
//        hello.setName(name);
//        return hello;
//    }
//    static class Hello{
//        private String name;
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//    }
}
