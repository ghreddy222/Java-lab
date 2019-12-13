class Sf
{
 public static void main(String args[])
  {
	String s1="hello";
	String s2=" World ";
	String s3="Hello";
	
	System.out.println(s1.toUpperCase());

	System.out.println(s2.toLowerCase());

	System.out.println(s1.replace('l','i'));

	System.out.println(s2.trim());

	System.out.println(s1.equals(s3));

	System.out.println(s1.equalsIgnoreCase(s3));
	
	System.out.println(s1.length());

	System.out.println(s1.charAt(3));
	
	System.out.println(s1.compareTo(s2));

	System.out.println(s1.concat(s2));
	
	System.out.println(s2.substring(2));

	System.out.println(s2.substring(2,4));
	
	System.out.println(s1.indexOf('l'));
	
	System.out.println(s1.indexOf('l',1));
	
	
} 
  }