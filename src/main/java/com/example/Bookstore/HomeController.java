package com.example.Bookstore;

import com.example.Bookstore.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
    @Autowired
    private HomeService homeService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/books")
    public String books(Model model){
        model.addAttribute("books", homeService.getBooks());
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
