package conditionals;

import java.util.Scanner;

public class GreatestOfThreeNested {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st Number : ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number : ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Number : ");
        int c = sc.nextInt();

        if(a>b){
            if(a>c) System.out.println(a+" is greatest");
            else
                System.out.println(c+" is greatest");
        }
        else{
            if(b>c) System.out.println(b+" is greatest");
            else
                System.out.println(c+" is greatest");
        }
    }
}
