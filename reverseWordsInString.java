public class reverseWordsInString{
  static String check(String str) {
    String[] words = str.split(" +");
    StringBuilder sb = new StringBuilder();
    for(int i = words.length- 1; i>=0; i--) {
      sb.append(words[i]);
      sb.append(" ");
    }
    return sb.toString().trim();
  }
  public static void main(String[] args) {
    String str = "the sky is blue ";
    System.out.println(check("the sky is blue "));
  }
}
