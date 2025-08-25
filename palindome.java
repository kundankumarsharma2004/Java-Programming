public class palindome {
    static boolean checkPalindrome(String str) {
        // convert to lowercase for case-insensitive check
        String temp = str.toLowerCase();

        // reverse using StringBuilder
        String reversed = new StringBuilder(temp).reverse().toString();

  ;
        if ( temp.equals(reversed)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "level";
      System.out.println(checkPalindrome(str));
        
    }
}
