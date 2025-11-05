
package Calc;

/**
 *
 * @author RAGHAD
 */

import javax.swing.*;

public abstract class HistoryDecorator implements HistoryComponent {
    protected HistoryComponent component;

    public HistoryDecorator(HistoryComponent component) {
        this.component = component;
    }

    @Override
    public JPanel getPanel() {
        return component.getPanel();
    }
}

