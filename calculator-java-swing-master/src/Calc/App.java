package Calc;

/**
 *
 * @author youcefhmd
 */

public class App {

    public static void main(String[] args) {
        Calculator calc = Calculator.getInstance();
    
    UIControlsFacade.attach(calc.getContentPane(), calc);
    calc.setVisible(true);}
}
