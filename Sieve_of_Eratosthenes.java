import javax.swing.JOptionPane;

public class Sieve_of_Eratosthenes {

	public static void main(String[] args) {
		int i,j,s=0,k=0;
		int n=Integer.parseInt(JOptionPane.showInputDialog(null, "Jep nje numer pozitiv"));
		int[] SoE = new int[n];
		for( i=0;i<SoE.length;i++)
		{
			SoE[i]=i+1;
			
		}
        int a=(int)Math.floor(Math.sqrt(n));
        for(i=2;i<=a;i++)
        {
        	for(j=i;j<SoE.length;j++)
        	{
        		if(SoE[j]%i==0)
        		{
        			SoE[j]=0;
        		}
        		
        		
        	}
        	
        }
        for( i=0;i<SoE.length;i++)
		{
			if(SoE[i]!=0)
			{
				s++;
			}
		}
        int[] SoE1 = new int[s];
        for( i=0;i<SoE.length;i++)
		{
			if(SoE[i]!=0)
			{
				SoE1[k]=SoE[i];
				k++;
			}
		}
        
	for(i=0;i<SoE1.length;i++)
	{
		System.out.print(SoE1[i]+" ");
	}
	}

}
