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
	int j;
	void get()
	{
	 j=20;
	}

}

class c extends B
{
int k,r;
	void result()
	{
	  k=30;
	r=i+j+k;
	System.out.println("r="+r);
	}
}

	class Multilevel
{ 
	public static void main (String args[])
{
	c obj=new c();
	obj.getdata();
	obj.get();
	obj.result();
}}	
