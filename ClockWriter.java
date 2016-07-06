import java.awt.*;
import javax.swing.*;
import java.util.*;
/** ClockWriter draws a clock in a panel. */
public class ClockWriter extends JPanel
{ public ClockWriter()
{ int width = 200; // the width of the clock
// construct this panel's frame:
JFrame clocks_frame = new JFrame();
// and insert this panel into its frame:
clocks_frame.getContentPane().add(this);
// show the frame:
clocks_frame.setTitle("Clock");
clocks_frame.setSize(width, width);
clocks_frame.setVisible(true);
}
/** paintComponent draws the clock with the correct time.
* @param g - the graphics pen that does the drawing */
public void paintComponent(Graphics g)
{ int width = 200; // the width of the clock
g.setColor(Color.white);
g.fillRect(0, 0, width, width); // paint the background
GregorianCalendar time = new GregorianCalendar();
int minutes_angle = 90 - (time.get(Calendar.MINUTE) * 6);
int hours_angle = 90 - (time.get(Calendar.HOUR) * 30);
// draw the clock as a black circle:
int left_edge = 50;
int top = 50;
int diameter = 100;
g.setColor(Color.black);
g.drawString(time.get(Calendar.HOUR)+"",width-60,width-40);
g.drawString(":",width-40,width-40);
g.drawString(time.get(Calendar.MINUTE)+"",width-32,width-40);
g.drawOval(left_edge, top, diameter, diameter);
// draw the minutes' hand red, 10 pixels smaller, with a width of 5 degrees:
g.setColor(Color.red);
g.fillArc(left_edge + 5, top + 5, diameter - 10, diameter - 10,
minutes_angle, 5);
// draw the hours' hand blue, 50 pixels smaller, with a width of -8 degrees:
g.setColor(Color.blue);
g.fillArc(left_edge + 5, top + 5, diameter - 10, diameter - 10,
hours_angle, -10);
}
/** The main method assembles the clock in its frame. The method
* is inserted here for testing purposes. */
public static void main(String[] args)
{ new ClockWriter(); }
}