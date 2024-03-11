package az.edu.ada.librarySystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import az.edu.ada.librarySystem.service.myBookService;

@Controller
public class myBookController {

    @Autowired
    private myBookService service;
    @RequestMapping("/deletemyBook/{id}")
    public String deletemyBook(@PathVariable("id") int id){
        service.deleteBook(id);
        return "redirect:/mybooks";
    }
}
