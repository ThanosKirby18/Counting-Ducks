import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Main 
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // You must have this line
    frame1.setSize(500,500);
    frame1.setVisible(true);

  JPanel panel1 = new JPanel(new GridLayout(2, 2, 20, 20));
    //------Button1-------//
    JButton button1 = new JButton("Click Me!");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Yay! You clicked the button");
      }
    });
    JButton button2 = new JButton("No, Click Me!");

    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Thanks Pal!");
      }
    });
    //-------label1-------//
    JLabel label1 = new JLabel("Count the ducks");
    
    panel1.add(button1);
    panel1.add(button2);
    panel1.add(label1);

    frame1.getContentPane().add(panel1);
  }// end of main method
}// end of class main