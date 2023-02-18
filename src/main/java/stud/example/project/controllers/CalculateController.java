package stud.example.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import stud.example.project.calculatorModel.Calculator;


@Controller
@RequestMapping("/mathematics")
public class CalculateController {
   // @RequestParam(value = "action", required = false) String act
    @GetMapping("/result")
    public String calculate(@RequestParam( required = false) double x, @RequestParam( required = false) double y,
                            @RequestParam(required = false) String act, Model model){

        Calculator calculator = new Calculator();

        model.addAttribute("x", x);
        model.addAttribute("y", y);
        model.addAttribute("result", calculator.calculate(x,y,act));
        model.addAttribute("sign", calculator.getSign());
        model.addAttribute("equalSign", "=");
        return "calculations_views/input_view";
    }

    @GetMapping("/inputNumbers")
    public String calculatorView(){
        return "calculations_views/input_view";
    }


}
