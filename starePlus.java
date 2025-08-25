package special_Pattern;

import java.util.Scanner;

public class starePlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows (odd number) :");
        int n = sc.nextInt();
            int a = n / 2 + 1;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i == a || j == a)
                        System.out.print("*" + " ");
                    else
                        System.out.print(" " + " ");
                }

                System.out.println();
            }

        }
    }
