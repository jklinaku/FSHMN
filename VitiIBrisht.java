import javax.swing.*;
public class VitiIBrisht {
	public String Viti(){
		int v=new Integer(JOptionPane.showInputDialog("Jepe nje vit")).intValue();
		String a="Viti eshte i brisht", b="Viti nuk eshte i brisht";
		if(v%4==0)
		{if(v%100==0)
		{if(v%400==0)
		{return a;}
		 else {return b;}}
		else {return a;}}
		else {return b;}
}

}