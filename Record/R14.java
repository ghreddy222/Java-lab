import java.awt.*;
import java.applet.*;
public class R14 extends Applet implements Runnable
{

String str = "221810302021";
Thread t1 = null;
public void init() 
{
t1 = new Thread(this);
t1.start();
}
public void run () 
{
char ch1;
while(true)                    
{
try 
{
repaint();             
Thread.sleep(110);  
ch1 = str.charAt(0);
str = str.substring(1, str.length());
str += ch1;
} 
catch(InterruptedException e) {}
}
}

public void paint(Graphics g) 
{
 g.drawString(str, 40, 100);
showStatus("Status Banner");
}
}

/*<applet code="R14.class" width="450" height="200">
</applet>*/
