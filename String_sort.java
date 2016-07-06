
public class String_sort {
	public void alphabeticalSort(String a)
	{String s="";
		for(int i=83;i<=122;i++)
		{
			int S=0;
			for(int j=0;j<a.length();j++)
			{
				if(a.charAt(j)==i)
					S++;
				
			}
			for(int k=1;k<=S;k++){
				s=s+(char)i;
				
			}
		}
		System.out.println(s);
	}public void alphabeticalSortNoDuplicates(String a)
	{String s="";
	for(int i=83;i<=122;i++)
	{
		int S=0;
		for(int j=0;j<a.length();j++)
		{
			if(a.charAt(j)==i)
				S++;
			
		}
		if(S>0)
			s=s+(char)i;
			
	}
	
	System.out.println(s);
	}
	public String removeDuplicateLetters(String a)
	{String s="";boolean duplicate= false;
	
	for(int i=0;i<a.length();i++)
		{if(i==0)
			s=s+a.charAt(i);
		else
		{
			
				for(int k=0;k<s.length()&&!duplicate;k++){
					if(a.charAt(i)==s.charAt(k))
						duplicate=true;
				}
			
			if(duplicate)
				duplicate=false;
				else s=s+a.charAt(i);
		}
			
			
		}
		return s;
	}
public static void main(String[] args){
	new String_sort().alphabeticalSort("butterflies");
	new String_sort().alphabeticalSortNoDuplicates("butterflies");
	new String_sort().removeDuplicateLetters("butterflies");
}
}
