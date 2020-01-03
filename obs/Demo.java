abstract class Bike
{
Bike()
{
System.out.println("Bike is Created");
}
abstract void run();
void changegear()
{
System.out.println("Gear Changed");
}
}

class Honda extends Bike
{
void run()
{
System.out.println("Running Safely");
}
}
abstract class Demo
{
public static void main (String args[])
{
Honda obj=new Honda();
obj.run();
obj.changegear();
}
}