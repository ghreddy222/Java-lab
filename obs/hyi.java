class A{
A(){
System.out.println("A");
}
}

class b extends A{
b(){
System.out.println("b");
}
}

class c extends A{
c(){
System.out.println("c");
}
}

class d extends c{
d(){
System.out.println("d");
}
}

class hyi{

static public void main(String []a){
b j = new b();
d j = new d();

}
}