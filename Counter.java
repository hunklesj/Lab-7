import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


  public class Counter implements ActionListener {
  JLable leftLable;
  JLable rightLable;
  int leftCount;
  int rightCount;

  Counter(){
    Jframe frame = new Jframe ("Lets Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);
    JButton left = new JButton("left");
	  JButton right = new JButton("right");

    leftCount = 0;
    rightCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftLabel = new JLabel("Count" + leftCount);
    rightLable = new JLabel("Count" + rightCount);

    frame.add(leftLable);
    frame.add(rightLable);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);

    frame.add(reset);

    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("left")) {
      leftCount = leftCount++;
    }
    else if(ae.getActionCommand().equals("right")) {
      rightCount = rightCount++;
    }
    else if(ae.getActionCommand().equals("reset")) {
      leftCount = 0;
      rightCount = 0;
  }
}