
package Calc;

/**
 *
 * @author RAGHAD
 */

public class OperationFactory {

    private static final Addition ADD = new Addition();
    private static final Subtraction SUB = new Subtraction();
    private static final Multiplication MUL = new Multiplication();
    private static final Division DIV = new Division();

    public static Operation getOperation(String symbol) {
        return switch (symbol) {
            case "+" -> ADD;
            case "-" -> SUB;
            case "×" -> MUL;
            case "÷" -> DIV;
            default -> throw new IllegalArgumentException("Invalid operation: " + symbol);
        };
    }
}

