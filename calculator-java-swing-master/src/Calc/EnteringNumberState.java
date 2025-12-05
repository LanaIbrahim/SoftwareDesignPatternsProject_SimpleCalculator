/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author NOORN
 */
public class EnteringNumberState implements CalculatorState {
    @Override
    public void onNumber(Calculator calc, String digit) {
        calc.appendDigitLogic(digit);
    }

    @Override
    public void onOperator(Calculator calc, String op) {
        calc.chooseOperation(op);
        calc.setState(new OperationSelectedState());
    }

    @Override
    public void onEquals(Calculator calc) {
        calc.compute();
        calc.setState(new ResultState());
    }

    @Override
    public void onClear(Calculator calc) {
        calc.clear();
        calc.setState(new StartState());
    }
}