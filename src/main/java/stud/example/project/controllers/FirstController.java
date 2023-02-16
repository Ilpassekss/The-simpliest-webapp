package stud.example.project.controllers;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/firstController")
public class FirstController {

    @GetMapping("/helloPage")
    public String startPage(HttpServletRequest request){

        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        System.out.println("name: " + name + "surname: " + surname);

        return "first/hello_page";
    }

    @GetMapping("/secondPage")
    public String secondPage(@RequestParam(value = "age", required = false) String age,
                             @RequestParam(value = "job", required = false) String job, Model model){

        model.addAttribute("age", age);
        model.addAttribute("job", job);
        return "first/info";
    }

}
