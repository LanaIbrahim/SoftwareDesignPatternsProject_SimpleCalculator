
package Calc;

/**
 *
 * @author RAGHAD
 */
public class CalculatorMemento {
    private final String currentOperand;
    private final String previousOperand;
    private final String operation;

    public CalculatorMemento(String currentOperand, String previousOperand, String operation) {
        this.currentOperand = currentOperand;
        this.previousOperand = previousOperand;
        this.operation = operation;
    }

    public String getCurrentOperand() {
        return currentOperand;
    }

    public String getPreviousOperand() {
        return previousOperand;
    }

    public String getOperation() {
        return operation;
    }
}

