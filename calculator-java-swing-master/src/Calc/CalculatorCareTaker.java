
package Calc;

/**
 *
 * @author RAGHAD
 */
import java.util.ArrayList;


public class CalculatorCareTaker {
    private ArrayList<CalculatorMemento> savedStates = new ArrayList<>();

    public void addMemento(CalculatorMemento m) {
        savedStates.add(m);
    }

    public CalculatorMemento getLastMemento() {
        if (savedStates.size() > 0) {
            return savedStates.remove(savedStates.size() - 1);
        }
        return null;
    }
}
