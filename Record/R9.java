import java.util.*;
import java.lang.*;
import java.io.*;

interface department
{
void dep();
}
interface sudents
{
void details();
}
class college implements department,sudents
{
int n;
String om;
String name;
Scanner sc=new Scanner (System.in);
public void dep()
{
System.out.print("enter Departement");
om=sc.next();
}
public void details()
{
System.out.print("enter name");
name=sc.next();
System.out.print("enter Pinno:");
n=sc.nextInt();
}
public void print()
{
System.out.print("Department:"+om);
System.out.print("Name:"+name);
System.out.print("Pinno:"+n);
}
public static void main(String args[])
{
college obj =new college();
obj.dep();
obj.details();
obj.print();
}}