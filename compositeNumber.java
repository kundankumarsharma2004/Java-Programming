package loops;

import java.util.Scanner;

public class compositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n : ");
        int n = sc.nextInt();

        int x=0; // 0 means prime
        for(int i=2;i<=n-1;i++){
            if(n%i==0){ // 'i' is factor of n.
                System.out.println("Composit Number");
                x=1; //  1  means composite
                break;
            }
        }
        if(n==1)System.out.println("Neither prime nor composite");
        else if(x==0) System.out.println("Prime number");
    }
}
