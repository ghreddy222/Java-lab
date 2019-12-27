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
	void getdata2()
	{
	 j=20;
	 r=i+j;
	 System.out.println("class b="+r);
	}

}

class C extends A
{
int k,r;
	void getdata3()
	{
	  k=30;

	}
}


class D extends C
{
int l,r;
	void getdata4()
	{
	  l=40;
	r=i+k+l;
	System.out.println("class d="+r);
	}
}




class Hyb
{ 
	public static void main (String args[])
{
	B obj=new B();
	obj.getdata();
	obj.getdata2();	


	D obj3=new D();
	obj3.getdata();
	obj3.getdata3();
	obj3.getdata4();	
}}	
