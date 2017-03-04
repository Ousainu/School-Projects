/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dormandmealplancalculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author class
 */


public class DormAndMealPlanCalculator extends JFrame {

    private double[] dormPrice = {1500, 1600, 1200, 1800};

    private double[] mealPrice = {650, 1095, 1500};

    private String[] dorms = {"Allen Hall: $1500 per semester", "Pike Hall: $1600 per semester",
                              "Farthing Hall: $1200 per semester", "University Suites: $1800 per semester"};
    private String[] meals = {"7 meals per week: $560", "14 meals per week: $1,095",
                              "Unlimited meals: $1,500"};

    private JComboBox mealList;
    private JComboBox dormList;
    private JLabel total;
    private JLabel totalField;
    private JPanel buttonPanel;
    private JButton calcButton;
    private JButton exitButton;

    public DormAndMealPlanCalculator() {
        super("Dorm and Meal Plan Calculator");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridLayout(3, 1));

        dormList = new JComboBox(dorms);
        mealList = new JComboBox(meals);

        total = new JLabel("Total: ");
        totalField = new JLabel();

        buildButtonPanel();

        add(dormList, BorderLayout.NORTH);
        add(mealList, BorderLayout.CENTER);
        add(total, BorderLayout.SOUTH);
        add(totalField);
        add(buttonPanel);

        pack();
        setVisible(true);

    }

    private void buildButtonPanel() {
        calcButton = new JButton("Calculate charges");

        calcButton.addActionListener(new CalcButtonListener());

        exitButton = new JButton("Exit");

        exitButton.addActionListener(new ExitButtonListener());

        buttonPanel = new JPanel();
        buttonPanel.add(calcButton);
        buttonPanel.add(exitButton);

    }

    private class CalcButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            double dorm_price = 0, meal_price = 0, total_price = 0;

            String selectedDorm = (String) dormList.getSelectedItem();
            String selectedMeal = (String) mealList.getSelectedItem();

            for (int i = 0; i < dorms.length; i++) {
                if (selectedDorm.equalsIgnoreCase(dorms[i])) {
                    dorm_price = dormPrice[i];
                }
            }
            for (int i = 0; i < meals.length; i++) {
                if (selectedMeal.equalsIgnoreCase(meals[i])) {
                    meal_price = mealPrice[i];
                }
            }
            total_price = dorm_price + meal_price;

            totalField.setText(Double.toString(total_price));
        }

    }

    private class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            System.exit(0);
        }
    }

    public static void main(String[] args) {
        DormAndMealPlanCalculator dmpc = new DormAndMealPlanCalculator();
    }

}
