import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


  public class Counter implements ActionListener {
  JLabel leftlabel;
  JLabel rightlabel;
  int leftCount;
  int rightCount;

  Counter(){
    JFrame frame = new JFrame ("Lets Count");
    frame.setLayout(new FlowLayout());
    frame.setSize(200,110);
    JButton left = new JButton("Left");
	  JButton right = new JButton("Right");

    leftCount = 0;
    rightCount = 0;

    left.addActionListener(this);
    right.addActionListener(this);

    frame.add(left);
    frame.add(right);

    leftlabel = new JLabel("Count " + leftCount);
    rightlabel = new JLabel("Count " + rightCount);

    frame.add(leftlabel);
    frame.add(rightlabel);

    JButton reset = new JButton("Reset");
    reset.addActionListener(this);

    frame.add(reset);

    frame.setVisible(true);

  }

  public void actionPerformed(ActionEvent ae) {
    if(ae.getActionCommand().equals("Left")) {
      leftCount = leftCount + 1;
      leftlabel.setText("Count " + leftCount);
    }
    if(ae.getActionCommand().equals("Right")) {
      rightCount = rightCount + 1;
      rightlabel.setText("Count " + rightCount);
    }
    if(ae.getActionCommand().equals("Reset")) {
      leftCount = 0;
      rightCount = 0;
      leftlabel.setText("Count " + leftCount);
      rightlabel.setText("Count " + rightCount);
  }
}
  }