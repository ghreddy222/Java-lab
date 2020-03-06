class D1 implements Runnable 
{
    public void run() 
{
        synchronized (Integer.class)
{
            System.out.println("D1");

            synchronized (String.class) 
{
                System.out.println("sc");
            }
        }
    }
}


class D2 implements Runnable 
{
    public void run() 
{
        synchronized (String.class) 
{
            System.out.println("d2");

            synchronized (Integer.class) 
{
                System.out.println("ic");
            }
        }
    }
}

class de
{
public static void main(String args[])
{
D1 o1= new D1();
D2 o2= new D2();

Thread t = new Thread (o1);
Thread t1 = new Thread (o2);

t.start();
t1.start();
}}
