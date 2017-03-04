import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat;


 



public class LongDistanceCalls extends JFrame
{
   private RatePanel ratePanel;        
   private MinutesPanel minutesPanel;  
   private JPanel buttonPanel;         
   private JButton calcButton;         
   private JButton exitButton;         
   
   
   
   public LongDistanceCalls()
   {
      
      super("Long Distance Charges");
      
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      
       ratePanel = new RatePanel();

      
      minutesPanel = new MinutesPanel();

      
      buildButtonPanel();
      
      
      add(ratePanel, BorderLayout.NORTH);
      add(minutesPanel, BorderLayout.CENTER);
      add(buttonPanel, BorderLayout.SOUTH);
      
     
      pack();
      setVisible(true);
   }

   
   
   private void buildButtonPanel()
   {
      
      calcButton = new JButton("Calculate Charges");
      
      
      calcButton.addActionListener(new CalcButtonListener());
      
      
      exitButton = new JButton("Exit");
      
      
      exitButton.addActionListener(new ExitButtonListener());

      
      buttonPanel = new JPanel();
      buttonPanel.add(calcButton);
      buttonPanel.add(exitButton);
   }

   
   
   private class CalcButtonListener implements ActionListener
   {
      
      
      public void actionPerformed(ActionEvent e)
      {
         double rate;         
         double totalCharges; 
         
         
         DecimalFormat dollar = new DecimalFormat("#,##0.00");
         
         
         rate = ratePanel.getRate();
         
         
         totalCharges = minutesPanel.getCharges(rate);
         
         
         JOptionPane.showMessageDialog(null, "Total Charges: $" + 
                                             dollar.format(totalCharges));
      }
   } 

   
   
   private class ExitButtonListener implements ActionListener
   {
      
      
      public void actionPerformed(ActionEvent e)
      {
         System.exit(0);
      }
   } 
   
   public static void main(String[] args)
   {
      LongDistanceCalls ldc = new LongDistanceCalls();
   }
}