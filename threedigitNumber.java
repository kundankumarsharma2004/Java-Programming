package conditionals;

import java.util.Scanner;

public class threedigitNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();

        if(n>99 && n<1000) System.out.println("Three digit number ");
        else System.out.println("Not three digit number ");
    }
}
