import java.io.*;
import java.util.*;
class Emp
{
public static void main(String args[])
 {
String name;
int age;
System.out.println("Enter Name and Age:");
Scanner sc=new Scanner(System.in);
name=sc.nextLine();
try
{
if(!(name.matches("[a-zA-Z]+")))
{
throw new IOException();
}

age=sc.nextInt();
if(age>50)
{
System.out.println("Exception");
throw new Exception();
}

Emp x=new Emp();
System.out.println("Name ="+name);
System.out.println("Age ="+age);
}

catch(Exception e)
{
System.out.println("Exception");
}
}}
