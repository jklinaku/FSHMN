import javax.swing.JOptionPane;

public class Decoder {
	public static void main(String[] args) {
		int[] code = new int[27];
		boolean a=true, f=false;String s="";
		int b,seed =Integer.parseInt( JOptionPane.showInputDialog("Give the seed(positive)"));
		code[0] = seed;
		for ( int i = 1; i != code.length; i = i + 1 )
		{ code[i] = (code[i - 1] * 2) + 1; }
		while(a)
		{    f=false;
      b=Integer.parseInt(JOptionPane.showInputDialog("Give an integer number(one chart at a time)\nGive a negative number to stop it"));
			if(b<0) 
			 {f=false;a=false;}
			for(int i=0;i<=26&&!f;i++)
			{
				if(code[i]==b)
				{if(code[i]!=0){
					s=s+(char)(i+'a'-1);
					f=true;}
				else{s=s+" ";}
				}
			}
		
		}
		System.out.print(s);
	}

}
