package conditionals;

import java.util.Scanner;

public class calculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of first number : ");
        int x = sc.nextInt();
        System.out.println("Enter operator : ");
        char op = sc.next().charAt(0);
        System.out.println("Enter value of second number : ");
        int y = sc.nextInt();

        System.out.println("The result is : ");
//        if(op == '+') System.out.println(x+y);
//        if(op == '-') System.out.println(x-y);
//        if(op == '*') System.out.println(x*y);
//        if(op == '/') System.out.println(x/y);

        switch(op){
            case '+':
                System.out.println(x+y);
                break;
            case '-':
                System.out.println(x-y);
                break;
            case '*':
                System.out.println(x*y);
                break;
            case '/':
                System.out.println(x/y);
                break;
            default :
                System.out.println("Invalid operator");
        }
    }
}
