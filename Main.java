import javax.swing.*;
import java.awt.event.*;
public class Main 
{
  public static void main (String args[])
  {
    JFrame frame1 = new JFrame("This is a JFrame");
    frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    // You must have this line
    frame1.setSize(500,500);
    frame1.setVisible(true);

    //------Button1-------//
    JButton button1 = new JButton("Click Me!");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("Yay! You clicked the button");
      }
    });
    frame1.add(button1);
    frame1.setVisible(true);
  }// end of main method
}// end of class main