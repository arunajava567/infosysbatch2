//Var Args Demo

public class VarArgsDemo
{
	static int sum(int... n)
	{
		int sum=0;
	
		for(int i=0;i<n.length;i++)
			sum = sum + n[i];

		return sum;	
	}
	public static void main(String[] args)
	{
		System.out.println(sum(10,20,30));

		System.out.println(sum(10,20,30,40,50));
		
		System.out.println(sum(10,20));
	}
}