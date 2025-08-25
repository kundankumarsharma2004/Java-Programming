package loops;

import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();
        // 1 3 5 7 9 ........
        for(int i=1;i<=2*n-1;i+=2){
            System.out.println(i);
        } // n rounds

        // 4 7 10 13 16 .....
//        for(int i=4;i<=3*n+1;i+=3){
//            System.out.println(i);
//        } // n rounds

        int a=4,d=3;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            a +=d;
        } // n rounds
    }

}
