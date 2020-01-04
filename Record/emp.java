import java.util.Scanner;
import java.lang.*;

class MyException extends Exception{ 
MyException(String s) 
{
System.out.println(s); 
} 
} 


class emp{

public static void main(String a[]){

int x,y;
String n;
char j;
Scanner sc = new Scanner(System.in);

try{
System.out.println("Enter the name");
n = sc.nextLine();

for(int i=0;i<n.length();i++){
j = n.charAt(i);
if(!Character.isLetter(j)){
throw new NullPointerException("Name Can't Have Numbers In It");
}
}

System.out.println("Enter the age");
x = sc.nextInt();

y=100/x;
if(x>50){
throw new MyException("Age should not be greater then 50");
}

}catch(NullPointerException e) { 
System.out.println(e);
}
catch(ArithmeticException f) { 
System.out.println("Age can't be 0"); 
}
catch (MyException ex){
}

}

}