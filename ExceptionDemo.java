
public class ExceptionDemo {
	static void compute(int a) throws MyException{
		System.out.println("called compute("+ a +")");
		if(a>10)
			throw new MyException (a);
		System.out.println("Normal Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			compute(1);
			compute(20);
		}
		catch(MyException e)
		{
			System.out.println(e);
		}
	}
}
