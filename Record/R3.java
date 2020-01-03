class R3
{
 public static void main(String args[])
  {
	String s1="hello";
	String s2=" World ";
	String s3="Hello";
	System.out.print("1.");
	System.out.println(s1.equals(s3));
	System.out.print("2.");
	System.out.println(s1.compareTo(s2));
	System.out.print("3.");
	System.out.println(s2.substring(2));
	System.out.print("4.");
	System.out.println(s1.indexOf('l'));
	System.out.print("5.");
	System.out.println(s2.toLowerCase());
} 
  }