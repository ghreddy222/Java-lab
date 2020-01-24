import java.util.*;
class Pattern
{
public static void main (String args[])
{
 int n ;
 Scanner sc=new Scanner (System.in);
 System.out.print("Enter n:\t");
 n=sc.nextInt();
 for(int i=0;i<=n;i++)
 {
   for(int j=0;j<i;j++)
    {
      if((i+j)%2==0)
      {
           System.out.print("0");

        }
           else
           {
             System.out.print("1");
            }
        } 
System.out.println();
   }
}}