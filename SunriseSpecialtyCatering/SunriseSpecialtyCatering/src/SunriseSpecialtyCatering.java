import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
import javax.swing.*;


public class SunriseSpecialtyCatering extends JFrame{
  
   private GreetingsPanel greetingsPanel;        // A panel for greetings
   private MainDishesPanel mainDishesPanel;  // A panel for mainDishes
   private SideDishesPanel sideDishesPanel; //A Panel for SideDishes
   private DessertsPanel dessertsPanel;        //A Panel for  Desserts
   
   private JPanel buttonPanel;         // A panel for the buttons
   private JButton calcButton;         // Calculates everything
   private JButton exitButton; 
   
 /** 
  * Constructor
  */
    
 public SunriseSpecialtyCatering()	
   {
		// Set the title bar text.
		super("Sunrise Specialty Catering");
                
            // Specify what happens when the close button is clicked.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               
              
                 greetingsPanel = new GreetingsPanel();
                  mainDishesPanel = new MainDishesPanel();
                  sideDishesPanel = new SideDishesPanel();
                  dessertsPanel = new DessertsPanel();
                
               //create a panel that contains buttons
                buildButtonPanel();
                
                //add 3 panels to the content pane.
                add(greetingsPanel,BorderLayout.NORTH);
                add(mainDishesPanel,BorderLayout.WEST);
                add(sideDishesPanel,BorderLayout.CENTER);
                add(dessertsPanel,BorderLayout.EAST);
                add(buttonPanel,BorderLayout.SOUTH);
                
                //pack and display the window
                pack();
                setVisible(true);
		
	}
 
 
 /**
    * buildButtonPanel method
    */
   
   private void buildButtonPanel()
   {
      // Create a button to calculate the charges.
      calcButton = new JButton("Calculate Charges");
      
      // Add an action listener to the button.
      calcButton.addActionListener(new CalcButtonListener());
      
      // Create a button to exit the application.
      exitButton = new JButton("Exit");
      
      // Add an action listener to the button.
      exitButton.addActionListener(new ExitButtonListener());

      // Put the buttons in their own panel.
      buttonPanel = new JPanel();
      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
   }

   /**
    * CalcButtonListener is an action listener class for the
    * calcbutton component.
    */
   
   private class CalcButtonListener implements ActionListener
   {
      /**
       * actionPerformed method
       */
      
      public void actionPerformed(ActionEvent e)
      {
         double rate1, rate2, rate3;    //rate for mainDishes, sideDishes, desserts
         double subTotal, salesTax, total ; // Total charges
         final double taxRate= 0.06;
        
         // Create a DecimalFormat object to format output.
         DecimalFormat dollar = new DecimalFormat("#,##0.00");
         
         // Get the applicable rate.
         rate1 = mainDishesPanel.getMainRate();
         rate2 = sideDishesPanel.getSideRate();
         rate3 = dessertsPanel.getDessertRate();
         
         // Get the total charges
        subTotal = rate1 + rate2 + rate3;
        salesTax= taxRate*subTotal;
         
        total = subTotal+salesTax;
         
         // Display the message.
         JOptionPane.showMessageDialog(null, "SubTotal: $ " + dollar.format(subTotal) + ".\n Sales Tax: $ " +dollar.format(salesTax) + 
                            ".\n Total Charges: $ " +  dollar.format(total) + ".");
      }
   } 

   
   private class ExitButtonListener implements ActionListener
   {
      /**
       * actionPerformed method
       */
      
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   } 

	public static void main(String[] args)
	{
            SunriseSpecialtyCatering oc = new SunriseSpecialtyCatering();
    

        }
}



