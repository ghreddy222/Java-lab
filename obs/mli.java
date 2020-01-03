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

class c extends b{
c(){
System.out.println("c");
}
}



class mli{

static public void main(String []a){
c j = new c();

}
}