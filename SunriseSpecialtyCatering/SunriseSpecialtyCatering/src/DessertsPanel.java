import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;


public class DessertsPanel extends JPanel {
    
//Name constantsrate for mainDishes
        
        private final double NO_DESSERT = 0.00;
        private final double APPLE_PIE = 1.50;
        private final double CHOCOLATE_CAKE = 2.25;
        private final double BUTTERSCOTCH = 2.50;
        
        //RadioButtons
        private JRadioButton non; //RadioButton for beef price
        private JRadioButton applePie; //RadioButton for  BBQ chicken price
        private JRadioButton chocolateCake; //RadioButton for grilled Salmon price
        private JRadioButton butterscotch; //RadioButton for Pasta price
        
        //create a button group
        private ButtonGroup bg;
    /**
     * Constructor
     */
    
    public DessertsPanel() {
        
        //Create a DEcimalFormat object
        DecimalFormat dollar = new DecimalFormat("#,##0.00)");
        //Create the RadioButtons
        
       non = new JRadioButton("No Dessert $" + dollar.format(NO_DESSERT));
       applePie = new JRadioButton("Apple Pie $" + dollar.format(APPLE_PIE));
       chocolateCake = new JRadioButton("Chocolate Cake $" + dollar.format(CHOCOLATE_CAKE));
       butterscotch = new JRadioButton("Butterscotch Pudding $" + dollar.format(BUTTERSCOTCH));
        
        //Group the radioButtons
        bg = new ButtonGroup();
        bg.add(non);
        bg.add(applePie);
        bg.add(chocolateCake);
        bg.add(butterscotch);
        
        //Create a GridLayout manager
        setLayout(new GridLayout(4,1));
        
        //Create a border
        setBorder(BorderFactory.createTitledBorder("Main Dishes"));
        
        //Add the RadioButtons to this Panel
        add(non);
        add(applePie);
        add(chocolateCake);
        add(butterscotch);
  
   }
    
    public double getDessertRate(){
        double dRate = 0.00;
        
        if (non.isSelected())
            dRate = NO_DESSERT;
        else if (applePie.isSelected())
                dRate = APPLE_PIE;
        else if (chocolateCake.isSelected())
                dRate = CHOCOLATE_CAKE;
        else if (butterscotch.isSelected())
                dRate = BUTTERSCOTCH;
        
       return dRate;
    }
}