package conditionals;

import java.util.Scanner;

public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of rectangle : ");
        int len = sc.nextInt();
        System.out.println("Enter breadth of rectangle : ");
        int bth = sc.nextInt();
        int area = len * bth;
        int peri = 2*(len + bth);
        if(area > peri) System.out.println("Area is Greater than Perimeter ");
        if(area < peri) System.out.println("Area is less than perimeter ");
        if(area == peri) System.out.println("Area is equal to perimeter " );
    }
}
