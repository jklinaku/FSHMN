import java.awt.*;
import javax.swing.*;
public class EggWriter extends JPanel
{ private int height, width;
   public EggWriter(int w, int h)
   { JFrame c = new JFrame();
      height = h;
      width = w;
   
      c.getContentPane().add(this);
      c.setBackground(Color.yellow);
      c.setTitle("EggWritter");
      c.setSize(500, 500);
      c.setVisible(true);
   
   }
   public void paintComponent( Graphics g)
   {g.setColor(Color.gray);
   
      g.fillOval(0,0, width, height);
      width= width/2;
      height=height/2;
   }

}