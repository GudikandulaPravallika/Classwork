
public class MyException extends Exception {
	private int details;
	MyException(int a)
	{
	details=a;	
	}
	public String toString()
	{
		return "MyException[" +details+ "]";
	}

}
