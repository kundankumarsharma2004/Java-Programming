package conditionals;

import java.util.Scanner;

public class quadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x-axis : ");
        int x = sc.nextInt();
        System.out.println("Enter value of y-axis : ");
        int y = sc.nextInt();

        if(x==0 && y==0) System.out.println(x+" and "+y+" lie on origin");
        else if(x==0 && y!=0) System.out.println(x+" and "+y+" lie on Y-Axis");
        else if(y==0 && x!=0) System.out.println(x+" and "+y+" lie on X-Axis");
        else if(x>0 && y>0) System.out.println(x+" and "+y+" lie in 1st Quadrant");
        else if(x<0 && y>0) System.out.println(x+" and "+y+" lie in 2nd Quadrant");
        else if(x<0 && y<0) System.out.println(x+" and "+y+" lie in 3rd Quadrant");
        else System.out.println(x+" and "+y+" lie in 4th Quadrant");
    }
}
