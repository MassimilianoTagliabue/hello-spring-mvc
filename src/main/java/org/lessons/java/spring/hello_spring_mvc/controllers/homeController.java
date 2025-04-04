package org.lessons.java.spring.hello_spring_mvc.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/")
public class homeController {
    
    @GetMapping("/")
    public String home() {
        return "home";
    }
    
    
    @GetMapping("/${id}/prove")
    public String prendiDati(@RequestParam(name = "name") String name,
        @RequestParam String surname,
        @RequestParam String email,
        @RequestParam String tel,
        @PathVariable String id,
         Model model) {

        model.addAttribute("name", name);
        model.addAttribute("surname", surname);
        model.addAttribute("email", email);
        model.addAttribute("tel", tel);
        model.addAttribute("curDate", LocalDate.now());
        model.addAttribute("id", id);

        return "prove";
    }

    

   
    
}
