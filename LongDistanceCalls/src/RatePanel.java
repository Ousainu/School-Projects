import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;


public class RatePanel extends JPanel
{
   
   private final double DAYTIME_RATE = 0.07;
   private final double EVENING_RATE = 0.12;
   private final double OFF_PEAK_RATE = 0.05;

   private JRadioButton daytime; 
   private JRadioButton evening; 
   private JRadioButton offPeak; 
                        
   private ButtonGroup bg;       
   
   
   public RatePanel()
   {
      
      DecimalFormat dollar = new DecimalFormat("#,##0.00");

      
      daytime = new JRadioButton("Daytime ($" +
                        dollar.format(DAYTIME_RATE) + " per minute)");
      evening = new JRadioButton("Evening ($" +
                        dollar.format(EVENING_RATE) + " per minute)");
      offPeak = new JRadioButton("Off-Peak ($" + 
                        dollar.format(OFF_PEAK_RATE) + " per minute)");
      
      
      bg = new ButtonGroup();
      bg.add(daytime);
      bg.add(evening);
      bg.add(offPeak);

      
      setLayout(new GridLayout(3, 1));
      
      
      setBorder(
         BorderFactory.createTitledBorder("Select a Rate Category"));
      
      
      add(daytime);
      add(evening);
      add(offPeak);
   }
   
   
   
   public double getRate()
   {
      double rate = 0.0;
      
      if (daytime.isSelected())
         rate = DAYTIME_RATE;
      else if (evening.isSelected())
         rate = EVENING_RATE;
      else if (offPeak.isSelected())
         rate = OFF_PEAK_RATE;
         
      return rate;
   }

    
}
