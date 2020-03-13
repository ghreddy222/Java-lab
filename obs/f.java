import java.awt.*;
class f extends Frame
{

f()
{
Button b=new Button("Click me");
b.setBounds(30,100,80,30);
add(b);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
f o=new f();
}
}