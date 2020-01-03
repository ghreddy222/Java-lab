class MyException extends Exception 
{ 
	 MyException() 
	{ 
		
		System.out.println("My Exception");
	} 
} 

class Userdefine
{ 
	public static void main(String args[]) 
	{ 
		try
		{  
			throw new MyException(); 
		} 
		catch (MyException e) 
		{ 
			System.out.println("Caught"); 
		}
	
			System.out.println("Rest of code"); 
		} 
	} 
