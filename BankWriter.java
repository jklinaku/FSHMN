
import java.awt.*;
import javax.swing.*;
import java.text.*;
public class BankWriter extends JPanel
{ private int WIDTH = 300; 
private int DEPTH = 200;
private BankAccount bank;
private String last_transaction = "";
public BankWriter(String title, BankAccount b, int i)
{ bank = b;
JFrame f = new JFrame();
f.setLocation(i*300,0 );
f.getContentPane().add(this);
f.setTitle(title);
f.setSize(WIDTH, DEPTH);
f.setVisible(true);
}
public void paintComponent(Graphics g)
{ g.setColor(Color.white);
g.fillRect(0, 0, WIDTH, DEPTH); 
g.setColor(Color.black);
int text_margin = 50;
int text_baseline = 50;
g.drawString(last_transaction, text_margin, text_baseline);
g.drawString("Balanci aktual = $" + unconvert(bank.getBalance()),
text_margin, text_baseline + 20);
}
private String unconvert(int i)
{ double dollars_cents = i / 100.00;
return new DecimalFormat("0.00").format(dollars_cents);
}
public void showTransaction(String message, int amount)
{ last_transaction = message + " " + unconvert(amount);
this.repaint();
}
public void showTransaction(String message)
{ last_transaction = message;
this.repaint();
}
}