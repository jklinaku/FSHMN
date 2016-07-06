
public class Matricat {
	public void matricaPD(int k){
		for ( int i = 0; i <= k; i = i + 1 )
		{ 
		for ( int j = 0; j <= k; j = j + 1 )
		
		{ if(i>=j)System.out.print(i +""+ j+"  "); }
		System.out.println();
		}
	}
	public void matricaND(int k){
		for ( int i = 0; i <= k; i = i + 1 )
		{ 
		for ( int j = k; j >= 0; j = j - 1 )
		
		{ if(i<=j)System.out.print(i +""+ j+"  "); }
		System.out.println();
		}
	}
	public static void main(String[] args){
		new Matricat().matricaPD(3);
		System.out.println();
		new Matricat().matricaND(3);
	}

}
