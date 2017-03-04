import java.awt.*;
import javax.swing.*;


 
 // Long Distance Calls
 

public class MinutesPanel extends JPanel
{
   private JTextField minutes;   
   
   
   
   public MinutesPanel()
   {
      
      JLabel minutesMsg = new JLabel("Minutes:");
      minutes = new JTextField(10);
      
      
      setLayout(new GridLayout(1, 2));
      
      
      setBorder(BorderFactory.createTitledBorder("Time of Call"));
      
      
      add(minutesMsg);
      add(minutes);
   }
   
   
   public double getCharges(double rate)
   {
      double charges = Double.parseDouble(minutes.getText()) * rate;
      return charges;
   }
}