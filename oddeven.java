import java.lang.*;
public class oddeven
{
    public static void main(String s[])
    {
        System.out.println("odd even using thread");
        Even e=new Even();
        Odd o=new Odd();
        e.setPriority(5);
        //o.setPriority(10);

        o.start();
        e.start();
    }
}

class Even extends Thread
{
    public void run()
    {  int j=0;
        System.out.println("even....");
        for(int i=0;i<=10;i++)
        {j=j+2;
            System.out.println(j);

        }
    }
}


class Odd extends Thread
{
    public void run()
    {  int j=1;
        System.out.println("odd");
        for(int i=0;i<=10;i++)
        {j+=2;
            System.out.println(j);

        }
    }
}
