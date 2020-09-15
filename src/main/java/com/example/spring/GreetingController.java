package com.example.spring;

import com.example.spring.domen.Users;
import com.example.spring.repos.UsersRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class GreetingController {

    private final UsersRep usersRep;

    public GreetingController(UsersRep usersRep) {
        this.usersRep = usersRep;
    }

//    @GetMapping("/greeting")
//    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
//        model.addAttribute("name", name);
//        return "Greeting";
//    }
    @GetMapping("/list")
    public String main(Map<String,Object> model){
        Iterable<Users> users = usersRep.findAll();

        model.put("User",users);
        return "Greeting";
    }
}
