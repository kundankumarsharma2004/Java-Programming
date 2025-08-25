class X extends Thread
{
    public void run()
    {
        System.out.println("Start X");
        for(int i=1;i<=5;i++)
        {
            if(i==2)
               // yield();// makes same priority thread gain the CPU and let itself wait
            // in the queue
            System.out.println("X(i)"+i);
        }
        System.out.println("Exit from X");
    }
}

class Y extends Thread
{
    public void run()
    {
        System.out.println("Start Y");
        for(int k=1;k<=5;k++)
        {
            System.out.println("Y(k)"+k);
        }
        System.out.println("Exit from Y");
    }
}

public class Yield
{
    public static void main(String s[])

    { X threadX=new X();
        Y threadY=new Y();
        System.out.println("Start main");
        threadX.start();
        threadY.start();
        System.out.println("exit main");
    }
}
