package az.edu.ada.librarySystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @GetMapping("/")
    public String home(){
        return "homepage";
    }

    @GetMapping("/add")
    public String bookRegister(){
        return "add";
    }

    @GetMapping("/books")
    public String listBooks(){
        return "books";
    }

    @GetMapping("/mybooks")
    public String listmyBooks(){
        return "mybooks";
    }
}
