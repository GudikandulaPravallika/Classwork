
public class Client implements Callback {
	public void callback(int p)
	{
		System.out.println("callback is called this "+p);
	}
	void nonInFace()
	{
		System.out.println("this is non interface method");
	}

}
