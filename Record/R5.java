class overload
{
int a,b,c;
overload()
{
a=1;
b=2;
}
overload(int i,int j)
{
a=i;
b=j;
}
void add()
{
c=a+b;
System.out.println(""+c);
}
public static void main(String args[])
{
overload o1=new overload(10,20);
overload o2=new overload();
o1.add();
o2.add();
}
}
