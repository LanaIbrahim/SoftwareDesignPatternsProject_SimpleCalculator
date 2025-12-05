/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calc;

import javax.swing.*;

/**
 *
 * @author RAGHAD
 */
public class HistoryPanel implements HistoryComponent {
    private JPanel panel;

    public HistoryPanel() {
        panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    }

    @Override
    public JPanel getPanel() {
        return panel;
    }

    public void addEntry(String entry) {
        panel.add(new JLabel(entry));
        panel.revalidate();  
        panel.repaint();
    }
}
