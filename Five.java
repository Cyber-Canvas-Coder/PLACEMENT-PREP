import java.util.*;
class prime
{
	public static boolean isprime (int x)
	{
		if (x==1)
			return false;
		int c=0;
		for(int i=2;i<=Math.sqrt(x);i++)
		{
			if(x%i==0)
				c++;
		}
		return (c==0)?true:false;
	}
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a num:");
		int n = sc.nextInt();
		int p = n+1;
		while(true){
			if (isprime(p))
			{
				System.out.print(p);
				break;
			}
			p++;
		}
	}
}