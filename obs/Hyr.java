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
	r=i+k;
	System.out.println("class c="+r);
	}
}


class D extends A
{
int l,r;
	void getdata4()
	{
	  l=40;
	r=i+l;
	System.out.println("class d="+r);
	}
}




class Hyr
{ 
	public static void main (String args[])
{
	B obj=new B();
	obj.getdata();
	obj.getdata2();	


	C obj2=new C();
	obj2.getdata();
	obj2.getdata3();


	D obj3=new D();
	obj3.getdata();
	obj3.getdata4();	
}}	
