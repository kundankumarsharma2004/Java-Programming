class XX extends Thread
{
    public void run()
    {
        System.out.println("Start xx");
        try
        {
            for(int i=1;i<=15;i++)
            { System.out.println("XX(i)="+i);
                Thread.sleep(200);
            }
        }
        catch(InterruptedException e)
        {}
        System.out.println("exit from XX");
    }
}


class YY extends Thread
{
    public void run()
    {
        System.out.println("Start yy");
        try
        {
            for(int k=1;k<=15;k++)
            {System.out.println("YY(k)="+k);
                Thread.sleep(200);
            }
        }
        catch(InterruptedException e)
        {}
        System.out.println("exit from YY");
    }
}


public class resum
{

    public static void main(String s[])
    {
        XX threadXX=new XX();
        YY threadYY=new YY();

        System.out.println(threadXX);
        System.out.println(threadYY);

        System.out.println("Start main");

        threadXX.start();
        threadYY.start();

        try
        { threadXX.sleep(1000);
            threadXX.suspend();

            System.out.println("Suspend threadXX");

            // threadXX.sleep(1000);
            threadXX.resume();
            System.out.println("resume threadXX");

            threadYY.suspend();
            System.out.println("Suspend threadYY");
            threadYY.stop();//deprecated
            threadYY.resume();//cannot work
        }

        catch(InterruptedException e)
        {}

        System.out.println("Exit Main");
    }
}
