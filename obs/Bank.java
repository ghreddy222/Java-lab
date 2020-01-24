import java.util.*;

class Bank
{
String name;
int ano;
String atype;
float bal;
Scanner sc=new Scanner (System.in);

void get(float b)
{
bal=b;
}
float deposit()
{
float amt;
System.out.println("\nEnter amount:");
amt=sc.nextInt();
bal=bal+amt;
return bal;
}
float withdrw()
{
float amt;
System.out.println("\nHow many Rupees withdraw:");
amt=sc.nextInt();
bal=bal-amt;
return bal;
}
void disp()
{

System.out.println("\n\nDeposit Amount: "+deposit());
System.out.println("\n\nAfter Withdraw Amount balnace: "+withdrw());
}
public static void main(String args[])
{
int n;
String nm;
String t;
float a;
Bank bk=new Bank();
Scanner sc=new Scanner (System.in);
System.out.println("\nEnter Account no.:"); 
n=sc.nextInt();
System.out.println("\nEnter Name: "); 
nm=sc.next();
System.out.println("\nEnter account type: "); 
t=sc.next();
System.out.println("\nEnter balance amount: ");
a=sc.nextInt();

System.out.println("\n\nAccount number: "+n);
System.out.println("Name: "+nm);
System.out.println("Account type: "+t);


bk.get(a);
bk.disp();
}}