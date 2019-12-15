import java.util.*;

class R2
{
   public static void main(String args[])
   {
       int n, m, i, j, k,t,o;
Scanner scan = new Scanner(System.in);

	    
       int a[] = new int[10];
       int b[] = new int[10];
       int c[] = new int[10];
       
	 
       System.out.print("enter size a : ");
       m = scan.nextInt();
	   
       System.out.print("enter a elements : ");
       for(i=0; i<m; i++)
       {
           a[i] = scan.nextInt();
       }
	   
       System.out.print("enter size b : ");
       n = scan.nextInt();
	   
       System.out.print("enter b elements : ");
       for(i=0; i<n; i++)
       {
           b[i] = scan.nextInt();
       }



	k = n + m;


       for(i=0;i<m;i++)
       {
           c[i] = a[i];
       }
	    
       
	   
       for(j=0; j<n; j++)
       {
           c[i] = b[j];
	i++;
       }




	for (i=0;i<k;i++)

	{
	for (o=0;o<k-1;o++)
	{
	if(c[o]>=c[o+1])

	{	
	 t=c[o+1];
	c[o+1]=c[o];
	c[o]=t;
	}}}


	   
       System.out.print("elements of c :\n");
       for(i=0; i<k; i++)
       {
           System.out.print("  "+c[i]);
       }
   }
}