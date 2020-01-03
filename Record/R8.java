import java.util.*;

class Vc{
String rn;
int md;
Vc(String r, int m){
rn=r;
md=m;
}
void display(){
System.out.println("");
System.out.println("Registration no: "+rn);
System.out.println("Model no: "+md);
}
void display2(){
System.out.println("Prize : 20,000");
System.out.println("Max Speed : 120kmph");
System.out.println("Silver Edge body");
System.out.println("Milage : 40kmpL");
System.out.println("Nitro Boosters");
}
void display3(){
System.out.println("Prize : 1,20,000");
System.out.println("Max Speed : 140kmph");
System.out.println("Adjustable Seats");
System.out.println("Milage : 25kmpL");
System.out.println("Quick Start");
}
void display4(){
System.out.println("Prize : 20,00,000");
System.out.println("Max Speed : 250kmph");
System.out.println("Metallic Finished body");
System.out.println("380HP Engine");
System.out.println("Petrol/Power petrol");
System.out.println("Milage : 10kmpL");
System.out.println("Parking Sensors");
}
}
class twl extends Vc{
int nws;
twl(String r,int m){
super(r,m);
nws=2;
}
void display(){
System.out.println("Two wheeler ");
super.display();
System.out.println("No. of wheel : " +nws);
super.display2();
}
}
class tlw extends Vc{
int nls;
tlw(String r,int m){
super(r,m);
nls=3;
}
void display(){
System.out.println("Three wheeler");
super.display();
System.out.println("No. of wheels:" +nls);
super.display3();
}
}
class fwl extends Vc{
int nls;
fwl(String r,int m){
super(r,m);
nls=4;
}
void display()
{
System.out.println("Four wheeler car");
super.display();
System.out.println("No. of wheels:" +nls);
super.display4();
}
}
class R22{
public static void main(String a[]){

String s;
int mdl;
Scanner sc = new Scanner(System.in);
Scanner sr = new Scanner(System.in);

System.out.println ("Enter no. of wheels ");
switch(sc.nextInt()){
case 4:
System.out.println ("Enter Registration no: ");
s=sr.nextLine();
System.out.println ("Enter Model no: ");
mdl=sc.nextInt();
fwl f1=new fwl(s,mdl);
f1.display();
break;
case 2:
System.out.println ("Enter Registration no: ");
s=sr.nextLine();
System.out.println ("Enter Model no: ");
mdl=sc.nextInt();
twl t1=new twl(s,mdl);
t1.display();
break;
case 3:
System.out.println ("Enter Registration no: ");
s=sr.nextLine();
System.out.println ("Enter Model no: ");
mdl=sc.nextInt();
tlw th1=new tlw(s,mdl);
th1.display();
break;
default:
System.err.println ( "Unrecognized option" );
break;
}

}
}