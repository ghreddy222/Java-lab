import java.util.*;
class Vehicle
{
String noplate;
Vehicle(String r){
noplate=r;
 
}
void display(){
Scanner sc=new Scanner (System.in);
System.out.println("Number plate: "+noplate);
sc.nextLine();

}
}




class Bike extends Vehicle{
int w;
Bike(String r,int n)
{
super(r);
w=n;
}
void display(){
System.out.println("Bike");
super.display();
System.out.println("No. of wheel : " +w);
}}




class Car extends Vehicle{
int w;
Car(String r,int n){
super(r);
w=n;
}
void display(){
System.out.println("Car:");
super.display();
System.out.println("No. of wheels:" +w);
}}






class Truck extends Vehicle{
int w;
Truck(String r,int n){
super(r);
w=n;
}
void display()
{
System.out.println("Truck");
super.display();
System.out.println("No. of Wheels:" +w);
}}






class VehicleDemo
{
public static void main(String args[])
{


Bike t1;
Car th1;
Truck f1;
int n;
Scanner so=new Scanner(System.in);
n=so.nextInt();
switch(n)
{
case 1: t1=new Bike(" ", 1);

t1.display();
break;

case 2:th1=new Car(" ", 4);
th1.display();
break;

case 3:f1=new Truck(" ",4);
f1.display();
break;
}


}
}