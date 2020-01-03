class A
{
int i;
	void getdata()
	{
	  i=10;
	}
}

class B extends A
{
	int j,r;
	void result()
	{
	 j=20;
	 r=i+j;
	 System.out.println("r="+r);
	}

}

	class Single
{ 
	public static void main (String args[])
{
	B obj=new B();
	obj.getdata();
	obj.result();
}}	
