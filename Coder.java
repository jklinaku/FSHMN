import javax.swing.JOptionPane;

public class Coder {
public static void main(String[] args){
	int[] code = new int[27];
	int seed =Integer.parseInt( JOptionPane.showInputDialog("Give the seed")) ;
	code[0] = seed;
	for ( int i = 1; i != code.length; i = i + 1 )
	{ code[i] = (code[i - 1] * 2) + 1; }
	String input_line = JOptionPane.showInputDialog("type sentence to encode: ");
	for ( int j = 0; j != input_line.length(); j = j + 1 )
	{ char c = input_line.charAt(j);
	if ( c == ' ' )
	{ System.out.println(code[0]); }
	else if ( c >= 'a' && c <= 'z' )
	{ int index = (c - 'a') + 1;
	System.out.println(code[index]);
	}
	else { System.out.println("error: bad input character"); }
	}

}
}
