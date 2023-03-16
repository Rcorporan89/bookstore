package com.example.Bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/books")
    public String books(){
        return "books";
    }

    @GetMapping("/about")
    public String about(){
        return "about";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/library")
    public String library(){
        return "library";
    }

}
