package stud.example.project.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/secondController")
public class SecondController {

    @GetMapping("/lastPage")
    public String getLastPage(){
        return "second/last_page";
    }
}
