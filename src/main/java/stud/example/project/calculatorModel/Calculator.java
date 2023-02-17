package stud.example.project.calculatorModel;

public class Calculator {
    private String sign;
    public double calculate(double x, double y, String action){
        double result;

        switch (action){
            case "plus":
                result = x+y;
                sign="+";
                break;
            case "minus":
                result = x-y;
                sign="-";
                break;
            case "multiplication":
                result = x*y;
                sign="x";
                break;
            case "division":
                result = x/y;
                sign=":";
                break;
            default:
                result = 0;
        }
        return result;
    }

    public String getSign() {
        return sign;
    }
}
