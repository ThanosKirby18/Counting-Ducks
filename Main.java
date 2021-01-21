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

    //-------label1-------//
    JLabel label1 = new JLabel("Count the ducks");
    JTextField textfield1 = new JTextField(10);
    
    //------Button1-------//
    JButton button1 = new JButton("Update Label!");

    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        String[] phrases = {"Counting Ducks", "You counted to", "Look at you Count.", "Nice one There", "Keep going"};
        String newText = phrases[(int)(Math.random() * phrases.length)];
        label1.setText(newText);
        
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


    panel1.add(button1);
    panel1.add(button2);
    panel1.add(label1);
    panel1.add(textfield1);


    //--------Panel 2--------//
    JPanel pnl2 = new JPanel(new BorderLayout(10, 10));
    //--------Image 1--------//
    ImageIcon duckImg = new ImageIcon("duck.jpg", "A little duckies");
    JLabel duckLabelPic = new JLabel(duckImg);
    pnl2.add(duckLabelPic);

    frame1.getContentPane().add(BorderLayout.NORTH, panel1);
    frame1.getContentPane().add(BorderLayout.CENTER, pnl2);
  }// end of main method
}// end of class main