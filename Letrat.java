
public class Letrat {
	
	public static void main(String[] args){
		int j,n=45,l1,l2;
	String[] lloji={"Clubs", "Diamonds", "Hearts", "Spades"};
	int[] letra= new int[12];
	
    for(int i=0;i<letra.length;i++)
    {
    	letra[i]=i+1;
    }
    for(j=0;j<n;j++)
    {
    	l1=(int)(Math.random()*4);
    	l2=(int)(Math.random()*12);
    	System.out.println(letra[l2]+" of "+lloji[l1]);
    }
}}
