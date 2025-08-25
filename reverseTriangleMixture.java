package Star_Priting_Triangle;

import java.util.Scanner;

public class reverseTriangleMixture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows :");
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            for(int j = 1; j <= n+1-i; ++j) {
                if(i%2!=0)
                    System.out.print(j+" ");
                else
                    System.out.print((char)(j+64)+" ");
            }

            System.out.println();
        }

    }
}
