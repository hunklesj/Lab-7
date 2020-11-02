import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main {
  public static void main(String args[]){
    SwingUtilties.invokeLater(new Runnable(){
      public void run() {
        new Counter();
      }
    });
  }
}

