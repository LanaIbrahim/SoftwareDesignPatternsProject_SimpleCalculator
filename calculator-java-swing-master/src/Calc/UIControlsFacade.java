package Calc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.Objects;

/**
 *
 * @author lanai
 */


public final class UIControlsFacade {
    private UIControlsFacade() {}

    public static void attach(Container root, Calculator calc) {
        for (Component c : root.getComponents()) {
            if (c instanceof Container) attach((Container) c, calc); 
            if (c instanceof JButton) wireButton((JButton) c, calc);
        }
    }

    private static void wireButton(JButton b, Calculator calc) {
        String t = Objects.toString(b.getText(), "").trim();
        if (t.matches("\\d")) {                         
            b.addActionListener(e -> calc.appendNumber(t));
            return;
        }
        switch (t) {
            case "." -> b.addActionListener(e -> calc.appendNumber("."));   
            case "+" -> b.addActionListener(e -> calc.chooseOperation("+"));
            case "-" -> b.addActionListener(e -> calc.chooseOperation("-"));
            case "×", "x", "X", "*" -> b.addActionListener(e -> calc.chooseOperation("×"));
            case "÷", "/" -> b.addActionListener(e -> calc.chooseOperation("÷"));
            case "=" -> b.addActionListener(e -> calc.equalsAndRefresh());
            case "DEL" -> b.addActionListener(e -> calc.deleteOne());
            case "C", "AC", "Clear" -> b.addActionListener(e -> calc.clear());
            default -> { /* ignore other buttons (e.g., window controls) */ }
        }
    }
}
