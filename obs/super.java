class A{

int i = 10;
void m(){
System.out.println("a - m");
}

}

class b extends A{

int i,j;
void m(){
System.out.println("b - m");
}

void n(){
i=20;
j=i+super.i;
System.out.println("b - m");
}

}

class super{

static public void main(String []a){
b j = new b();
b.m();
b.n();

}
}