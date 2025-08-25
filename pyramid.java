import java.util.*;
public class pyramid {

  public static void main(String[] args) {
    int n =3;
    for(int i =1; i<=n; i++) {
      int space = n -i;
      for(int j = space; j >=1 ; j--) {
        System.out.print(" ");
      }
      for(int j =1; j <= i; j++) {
        System.out.print("*"+ " ");
      }
      System.out.println();
    }
    for(int i =n - 1 ; i>=1; i--) {
      int space = n -i;
      for(int j = space; j >=1 ; j--) {
        System.out.print(" ");
      }
      for(int j =1; j <= i; j++) {
        System.out.print("*"+ " ");
      }
      System.out.println();
    }
  }
}
