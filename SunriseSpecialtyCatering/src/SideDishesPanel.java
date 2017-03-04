import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;

public class SideDishesPanel extends JPanel{
    //Named constants for sideDishes rate
    private final double SALAD = 6.50;
    private final double MIXED_VEGETABLES = 9.50;
    private final double POTATOES = 5.50;
    private final double RICE_DISHES = 7.75;
    private final double BEANS = 6.75;
    private final double BREAD = 4.00;
    
    //CheckBoxes
    private JCheckBox salad;
    private JCheckBox mixedVeg;
    private JCheckBox potatoes;
    private JCheckBox rice;
    private JCheckBox beans;
    private JCheckBox bread;
    
    //NO group for CheckBoxes here
      /**
     * Constructor
     */
    
    public SideDishesPanel(){
        //Create a DecimalFormat object
        DecimalFormat dollar = new DecimalFormat("#,##0.00");
        
        setBackground(Color.WHITE);
        
        //Create the CheckBoxes
        salad = new JCheckBox("Salad $" + dollar.format(SALAD));
        mixedVeg = new JCheckBox("Mixed Vegetables $"+ dollar.format(MIXED_VEGETABLES));
        potatoes = new JCheckBox("Potatoes $" + dollar.format(POTATOES));
        rice = new JCheckBox("Rice Dishes $" + dollar.format(RICE_DISHES));
        beans = new JCheckBox("Beans $" + dollar.format(BEANS));
        bread = new JCheckBox("Bread $" + dollar.format(BREAD));
        
       //Create a GridLayout manager
        setLayout(new GridLayout(6,1));
        
        //Create a border
        setBorder(BorderFactory.createTitledBorder("Side Dishes"));
        
        //add CheckBoxes to this Panel
        add(salad);
        add(mixedVeg);
        add(potatoes);
        add(rice);
        add(beans);
        add(bread);
        
   }
    /**
     * getSideRate method
     */
    
    public double getSideRate(){
        
        double sRate = 0.00;
        if (salad.isSelected())
                sRate += SALAD;
        if (mixedVeg.isSelected())
                sRate += MIXED_VEGETABLES;
        if (potatoes.isSelected())
                sRate += POTATOES;
        if (rice.isSelected())
                sRate += RICE_DISHES;
        if (beans.isSelected())
                sRate += BEANS;
        if (bread.isSelected())
                sRate += BREAD;
        
        return sRate;
    }
}

