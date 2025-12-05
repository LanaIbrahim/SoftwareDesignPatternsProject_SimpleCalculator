/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author NOORN
 */
public class StartState implements CalculatorState {
    @Override
    public void onNumber(Calculator calc, String digit) {
        calc.currentOperand = digit;
        calc.setState(new EnteringNumberState());
        calc.updateDisplay();
    }

    @Override
    public void onOperator(Calculator calc, String op) { }

    @Override
    public void onEquals(Calculator calc) { }

    @Override
    public void onClear(Calculator calc) {
        calc.clear();
    }
}