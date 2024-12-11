import java.util.Scanner;
class WQ4
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int a=sc.nextInt();
		int n=1;
		while(n<=a)
		{
			int c=0,r,sum=0;
			int t=n;
			while(n!=0)
			{
				n=n/10;
				c++;
			}
			n=t;
			while(n!=0)
			{	
				r=n%10;
				int i=1;
				int sq=r;
				while(i<c)
				{
					sq=sq*r;
					i++;
				}
				sum=sq+sum;
				n=n/10;
			}
			if(t==sum)
				System.out.print(sum+",");
			n=t+1;
		}
	}
}