class R6
{
	public static void main(String args[])
{
try
{
    System.out.println("try block");
     
    throw new NullPointerException("null occurred");
} 
catch (ArithmeticException e) 
{
    System.out.println("catch block 1");
}
catch (NullPointerException e) 
{
    System.out.println("catch block 2");
}
catch (Exception e) 
{
    System.out.println("catch block 3");
} 
finally
{
    System.out.println("finally block");
}}}