
public class Exc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,s;
		try
		{
			d=0;
			s=42/d;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("After try/catch blocks");

	}

}
