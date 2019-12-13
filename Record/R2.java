import java.util.*;

class R2
{
   public static void main(String args[])
   {
       int n, m, i, j, k,t;
Scanner scan = new Scanner(System.in);

       int a[] = new int[m];
       int b[] = new int[n];
       int c[] = new int[k];
       
	 
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
       for(i=0,j=0;j<m; i++,j++)
       {
           c[i] = a[i];
       }
	    
       
	   
       for(i=i,j=0; j<n; i++, j++)
       {
           c[i] = b[j];
       }




	for (i=0;i<k;i++)

	{
	for (j=0;j<k-1;j++)
	{
	if(c[j]>c[j+1])

	{	
	 t=c[j+1];
c[j+1]=c[j];
c[j]=t;
}}}


	   
       System.out.print("elements of c :\n");
       for(j=0; j<k; j++)
       {
           System.out.print(c[i] + "  ");
       }
   }
}