public class Box1{
	int width;
    int depth;
    int height;
    Box1(Box1 ob)
    {
    	width=ob.width;
         depth=ob.depth;
         height=ob.height;
    }
    Box1(int w, int d, int h)
    {
    	width=w;
         depth=d;
         height=h;
    }
    Box1()
    {
    	width=-1;
        depth=-1;
         height=-1;
    }
    Box1(int len)
    {
    	width=depth=height=len;
    }
    int volume(){
       int vol=width*depth*height;
       return vol;
}
}
