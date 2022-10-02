
public class Box {
	int width;
    int depth;
    int height;
    Box(Box ob)
    {
    	width=ob.width;
         depth=ob.depth;
         height=ob.height;
    }
    Box(int w, int d, int h)
    {
    	width=w;
         depth=d;
         height=h;
    }
    Box()
    {
    	width=-1;
        depth=-1;
         height=-1;
    }
    Box(int len)
    {
    	width=depth=height=len;
    }
    int volume(){
       int vol=width*depth*height;
       return vol;
}
}
