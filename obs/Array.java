import java.util.*;
class Array
{
	public static void main(String args[])
	{
          int n,i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Length");
n=sc.nextInt();
int a[]=new int[n];
System.out.print("Enter Elements");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.print("Sum="+sum);
}}