public class lengthOfLastWord {
  static int length(String str) {
    String s = str.trim();
    int count  =0;
    for(int i =s.length() -1; i>=0; i--){
      if(s.charAt(i) == ' ') {
        break;
      }count++;
    }
    return count;
  }
  public static void main(String[] args) {
    String str = " The Sky is blue why ";
    System.out.println(length(str));
  }
}
