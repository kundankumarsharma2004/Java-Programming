package practicalLab;

class boxdemo {
    int width;
    int height;
    int depth;
    boxdemo(int w,int h,int d){
        height=h;
        width=w;
        depth=d;
    }
    int calculatevol(){
        return width*height*depth;
    }
}
public class box
{
    public static void main(String[] args) {
        boxdemo b=new boxdemo(9,10,10);
        System.out.println("reference = "+b);
        System.out.println(b.calculatevol());
    }
}
