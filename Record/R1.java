import java.util.*;
class R1
{
 public static void main (String args[])
{
  String a=args[0];
String b="";
	int i;
  System.out.print(args[0]);
   int len=a.length();
for(i=len-1;i>=0;i--)
  
   b=b+a.charAt(i);
   if (a.equals(b))
   
    System.out.print("is a Palindrome");
    
    else
     System.out.print("is not a Not palindrome");
}}
