import java.lang.*;
class table
{
    public static void main(String s[])
    {System.out.println("mul table using thread");
        TableThree three=new TableThree();
        TableTwo two=new TableTwo();
// two.setPriority(Thread.MAX_PRIORITY);
        //three.setPriority(Thread.MIN_PRIORITY);
        three.start();

        try
        {
            three.join();//makes sure that three is terminated before the next
            // instruction is executed by the program.
        }
        catch(Exception e)
        {System.out.println(e);
        }
        two.start();


    }
}

class TableThree extends Thread
{
    public void run()
    {
        System.out.println("Table of three");
        for(int i=0;i<=10;i++)
        {System.out.println(i+"x"+"3="+(i*3));
        }
    }
}


class TableTwo extends Thread
{
    public void run()
    {
        System.out.println("Table of two");
        for(int i=0;i<=10;i++)
        {System.out.println(i+"x"+"2="+(i*2));
        }
    }
}

