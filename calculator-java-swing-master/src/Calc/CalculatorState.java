/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Calc;

/**
 *
 * @author NOORN
 */
public interface CalculatorState {
    void onNumber(Calculator calc, String digit);
    void onOperator(Calculator calc, String op);
    void onEquals(Calculator calc);
    void onClear(Calculator calc);
}
