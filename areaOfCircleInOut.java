package Basics;
import java.util.Scanner;
public class areaOfCircleInOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter th radius :");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.println("Area of circle is :"+a);


    }
}
