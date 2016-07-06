
public class StandardMathematicalDefnitions {
	private int S;private long P;
	public StandardMathematicalDefnitions(){
		S=0; P=1;
	}
	public void reset(){
		S=0; P=1;
	}
	public int summation(int i){
		int c=0;
		while(c<=i)
		{S=S+c;
		c++;
		}
		return S;
		
		}
	public long iteratedProduct(int a, int b){
		int c=0;
		int r=a;
		while(a<=b)
		{P=P*(r+c);
			a++;c++;
		}
			return P;
		
	}
	public long factorial(int m){
		int i=1;
		while(i<=m)
		{P=P*i;
		i++;
		}
		return P;
		
	}
	


}


