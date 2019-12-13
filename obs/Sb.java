import java.util.*;
class Sb
{
 public static void main(String args[])
  {
	StringBuffer s1=new StringBuffer("GITAM CSE");
	
	s1.setLength(20);
	s1.setCharAt(9,'B');
	
	s1.append(2);

	s1.insert(10,"2ndyear");
	
	System.out.println(s1);

	


} 
  }