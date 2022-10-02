package P2;

import P1.Protection;
public class OtherPackage {
	OtherPackage()
	{
	P1.Protection p=new P1.Protection();
	System.out.println("base constructor");
	//System.out.println("n_pri"+p.n_pri);
	System.out.println("n_public"+p.n_pub);
	//System.out.println("n"+p.n);
	//System.out.println("n_pro"+p.n_pro);
	
}


}
