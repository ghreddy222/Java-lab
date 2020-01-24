import java.util.Scanner;
class Stg
{	
	public static void main(String[] args)
	{
	   int num,fac,sum = 0,n;	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");				
		num = sc.nextInt();
		 n = num;
		while(n != 0)
		{	
			fac = 1;
			int r = n % 10;
			
			for(int i = r ; i >= 1 ; i--)
			fac = fac * i;
			
			sum = sum + fac;
			n=n/10;
		}
		
		if(sum == num)
			System.out.println("Strong number");
		else
			System.out.println("Not Strong number");
		
														
	}
}