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

    @GetMapping("/result")
    public String calculate(@RequestParam(value = "x", required = false) int x, @RequestParam(value = "y", required = false) int y,
                            @RequestParam(value = "action", required = false) String act, Model model){

        Calculator calculator = new Calculator();

        model.addAttribute("result", calculator.calculate(x, y, act));

        return "calculations_views/result_view";
    }

    @GetMapping("/inputNumbers")
    public String calculatorView(){
        return "calculations_views/input_view";
    }


}
