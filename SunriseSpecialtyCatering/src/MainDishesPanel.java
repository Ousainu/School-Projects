import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class MainDishesPanel extends JPanel{
    //Name constantsrate for mainDishes
        
        private final double BEEF_MEAT_LOAF =  70.00;
        private final double BBQ_CHICKEN_PIECES = 60.00;
        private final double GRILLED_SALMON =  20.00;
        private final double PASTA_PRIMA_VERA = 40.00;
        
        //RadioButtons
        private JRadioButton beef; //RadioButton for beef price
        private JRadioButton bbqChicken; //RadioButton for  BBQ chicken price
        private JRadioButton salmon; //RadioButton for grilled Salmon price
        private JRadioButton pasta; //RadioButton for Pasta price
        
        //create a button group
        private ButtonGroup bg;
    /**
     * Constructor
     */
    
    public MainDishesPanel() {
        
        //Create a DEcimalFormat object
        DecimalFormat dollar = new DecimalFormat("#,##0.00)");
        //Create the RadioButtons
        setBackground(Color.RED);
        beef = new JRadioButton("Beef Meat Loaf $" + dollar.format(BEEF_MEAT_LOAF));
        bbqChicken = new JRadioButton("BBQ Chicken $" + dollar.format(BBQ_CHICKEN_PIECES));
        salmon = new JRadioButton("Grilled Salmon $" + dollar.format(GRILLED_SALMON));
        pasta = new JRadioButton("Pasta Prima Vera $" + dollar.format(PASTA_PRIMA_VERA));
        
        //Group the radioButtons
        bg = new ButtonGroup();
        bg.add(beef);
        bg.add(bbqChicken);
        bg.add(salmon);
        bg.add(pasta);
        
        //Create a GridLayout manager
        setLayout(new GridLayout(4,1));
        
        //Create a border
        setBorder(BorderFactory.createTitledBorder("Main Dishes"));
        
        //Add the RadioButtons to this Panel
        add(beef);
        add(bbqChicken);
        add(salmon);
        add(pasta);
  
   }
     /**
      * getMainRate method
      */
    
    public double getMainRate(){
        double mRate = 0.00;
        
        if (beef.isSelected())
            mRate = BEEF_MEAT_LOAF;
        else if (bbqChicken.isSelected())
                mRate = BBQ_CHICKEN_PIECES;
        else if (salmon.isSelected())
                mRate = GRILLED_SALMON;
        else if (pasta.isSelected())
                mRate = PASTA_PRIMA_VERA;
        
       return mRate;
    }
}
