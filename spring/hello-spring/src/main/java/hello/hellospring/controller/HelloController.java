package hello.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello"); //모델에 data:hello를 넘겨주고,
        return "hello"; //뷰페이지 반환 resources>template>hello.html를 찾음
    }

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return  "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //응답바디에 이 내용을 직접 넣어주겠다? 잘 쓸일 없음
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; //"hello spring"
        //뷰 없이 String 문자 그대로를 보내줌 (이런식으로 잘 안보냄. 객체를 반환해서 json으로)
    }

    @GetMapping("hello-api") //api방식
    @ResponseBody
    public Hello helloApi(@RequestParam("name")String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello; //객체를 넘김 , 문자가 아님(html이 아님)
        //json으로 반환하게 됨 {name : ~}
    }
    static class Hello{
        private String name;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }
}
