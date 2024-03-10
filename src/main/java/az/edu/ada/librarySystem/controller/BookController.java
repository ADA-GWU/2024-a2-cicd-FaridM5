package az.edu.ada.librarySystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BookController {
    @GetMapping("/")
    public String home(){
        return "homepage";
    }

}
