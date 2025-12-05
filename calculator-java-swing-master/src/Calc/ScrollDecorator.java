/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

/**
 *
 * @author RAGHAD
 */

import javax.swing.*;
import java.awt.*;



//concerete decorator

public class ScrollDecorator extends HistoryDecorator {

    public ScrollDecorator(HistoryComponent component) {
        super(component);
    }

    @Override
    public JPanel getPanel() {
        JPanel original = component.getPanel();
        JScrollPane scrollPane = new JScrollPane(original);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        JPanel wrapper = new JPanel(new BorderLayout());
        wrapper.add(scrollPane, BorderLayout.CENTER);
        wrapper.setPreferredSize(new Dimension(250, 400));
        return wrapper;
    }
}
