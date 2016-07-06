import javax.swing.*;
public class Voto {
	private String k1="Kandidatin 1", k2="Kandidatin 2", k3="Kandidatin 3";
	private int mosha=18, i;
	private String a="", q=k1+" mund ta votosh me numrin 1, ", w=k2+" mund ta votosh me numrin 2, ", e=k3+" mund ta votosh me numrin 3.";
	public void FilloVotimin()
	{String s= JOptionPane.showInputDialog("Jepe moshen");
	 mosha = new Integer(s).intValue();
		if(mosha<18)
		{this.FilloVotimin();}
		else{this.vazhdim();}
	}
public void vazhdim()
{String s= JOptionPane.showInputDialog(q+w+e);
	int kandidati = new Integer(s).intValue();
	if(kandidati==1)
	{q="";i=1;a=k1;
	this.vazhdim_1();}
	else{if(kandidati==2)
	{w="";i=2;a=k2;
	this.vazhdim_1();}
	else{if(kandidati==3)
	{e="";i=3;a=k3;
	this.vazhdim_1();}
	else{this.FilloVotimin();}}}

	}
public void vazhdim_1(){
	String s= JOptionPane.showInputDialog(q+w+e);
	int kandidati = new Integer(s).intValue();
	if(kandidati==1 && i!=1)
	{JOptionPane.showMessageDialog(null,"Ju keni votuar per "+k1+" dhe "+a);
	}
	else{if(kandidati==2 && i!=2)
	{JOptionPane.showMessageDialog(null,"Ju keni votuar per "+k2+" dhe "+a);}
	else{if(kandidati==3 && i!=3)
	{JOptionPane.showMessageDialog(null,"Ju keni votuar per "+k3+" dhe "+a);}
	else{this.FilloVotimin();}}}
	if(JOptionPane.showConfirmDialog(null, "Deshiron ta ndalosh?")!=0)
	{this.FilloVotimin();}
	
	
	
}

}