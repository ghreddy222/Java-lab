class Mythread1 extends Thread
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Mythread1="+i);
}
System.out.println("Exit Mythread1");
}
}
class Mythread2 implements Runnable
{
public void run()
{
for(int i=0;i<5;i++)
{
System.out.println("Mythread2="+i);
}
System.out.println("Exit Mythread2");
}
}
class M
{
public static void main(String args[])
{
Mythread1 m1=new Mythread1();
m1.start();
Mythread2 m=new Mythread2();
Thread t=new Thread(m);
t.start();
}
}