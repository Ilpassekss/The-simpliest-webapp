package stud.example.project.calculatorModel;

public class Calculator {

    public double calculate(int x, int y, String action){
        double result;

        switch (action){
            case "plus":
                result = x+y;
                break;
            case "minus":
                result = x-y;
                break;
            case "multiplication":
                result = x*y;
                break;
            case "division":
                result = (double)x/(double)y ;
                break;
            default:
                result = 0;
        }
        return result;
    }
}
