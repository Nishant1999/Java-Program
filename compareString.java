class compareString
{
	public static void main(String ar[])
	{
		String s="welcometojava";
		int a=s.length();
		int k=3;
		String comp[]=new String[a-k+1];
		for(int i=0;i<a-k+1;i++)
		{
			comp[i]=s.substring(i,k);
			k++;
		}
		for(int i=0;i<(s.length()/2)+1;i++)
		{
			System.out.println(comp[i]);
		}
		System.out.println("====================================================");
		String temp="";
		for(int i=0;i<a-k+1;i++)
		{
			for(int l=0;l<k;l++)
			{
				if(comp[i].charAt(l)>comp[i+1].charAt(l))
				{
					temp=comp[i];
					comp[i]=comp[i+1];
					comp[i+1]=temp;
					break;
				}
				else if(comp[i].charAt(l)==comp[i+1].charAt(l))
				{
					continue;
				}
				else if(comp[i].charAt(l)<comp[i+1].charAt(l))
				{
					continue;
				}
			}
		}
		for(int i=0;i<(s.length()/2)+1;i++)
		{
			System.out.println(comp[i]);
		}
	}
}