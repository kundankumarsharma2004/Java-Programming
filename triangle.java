//  *
//  * *
//  * * *
//  * * * *
// public class triangle {
//   public static void main(String[] args) {
//     int n = 5;
//     for(int i =0; i < n ; i++) {
//       for(int j = 0; j < i; j++) {
//         System.out.print(" *");
//       }
//       System.out.println();
//     }
//   }
//}

//  *  *  *  *  *
//  *  *  *  *
//  *  *  *
//  *  *
//  *
// public class triangle {
//   public static void main(String[] args) {
//     int n = 5;
//     for(int i = n; i >= 1; i--) {
//       for(int j = 0; j < i; j++) {
//         System.out.print(" * ");
//       }
//       System.out.println();
//     }
//   }
// }

// public class triangle {
//   public static void main(String[] args) {
//     int n = 4;
//     for(int i = 1; i <= n; i++) {
//       for(int j = 1; j <= n-i ; j++) {
//         System.out.print(" ");
//       }
//       for(int j = 1; j <= i; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

// 1 
// 1 2 
// 1 2 3 
// 1 2 3 4 
// public class triangle {
//   public static void main(String[] args) {
//     int n = 4;
//     for(int i = 1; i <= n; i++) {
//       for(int j = 1; j <= i ; j++) {
//         System.out.print(j+" ");
//       }
//       System.out.println();
//     }
//   }
// }

// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
// public class triangle {
//   public static void main(String[] args) {
//     int n = 5;
//     for(int i = n; i >=1; i--) {
//       for(int j = 1; j <= i ; j++) {
//         System.out.print(j+" ");
//       }
//       System.out.println();
//     }
//   }
// }

// 1 
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// public class triangle {
//   public static void main(String[] args) {
//     int n = 5;
//     int num = 1;
//     for(int i = 1; i <= n; i++) {

//       for(int j = 1; j <= i ; j++) {
//         System.out.print(num+" ");
//         num++;
//       }
//       System.out.println();
//     }
//   }
// }

public class triangle {
  public static void main(String[] args) {
    int n = 5;
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        int sum = i + j;
        if (sum % 2 == 0) {
          System.out.print("1" + " ");
        } else {
          System.out.print("0" + " ");
        }

      }
      System.out.println();
    }
  }
}