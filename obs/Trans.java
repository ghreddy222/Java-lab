import java.util.*;
class Trans
{
	public static void main(String args[])
	{
          int n,m,sum=0;
Scanner sc=new Scanner(System.in);
Scanner cs=new Scanner(System.in);
System.out.print("Enter Length");
n=sc.nextInt();
m=cs.nextInt();
int a[][]=new int[n][m];
System.out.print("Enter Elements");
for(int i=0;i<n;i++)
{
for (int j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}
for(int i=0;i<n;i++)
{
for (int j=0;j<m;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println("");
}
int b[][]=new int[n][m];
for(int i=0;i<n;i++){    
for(int j=0;j<m;j++){    
b[i][j]=a[j][i];  
}    
} 
for(int i=0;i<n;i++){    
for(int j=0;j<m;j++){    
System.out.print(b[i][j]+" ");    
}
System.out.println("");
}}}