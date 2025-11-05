/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author RAGHAD
 */
public class Division implements Operation {
    @Override
    public float apply(float curr, float prev) {
        if (prev == 0) throw new ArithmeticException("Division by zero");
        return curr / prev;
    }
}