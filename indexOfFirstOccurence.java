public class indexOfFirstOccurence {
  static int Strstr(String hayStack, String needle) {
    for(int  i =0; i < hayStack.length() - needle.length() + 1; i ++) {
      if(hayStack.charAt(i) == needle.charAt(0)) {
        if(hayStack.substring(i, needle.length()+i).equals(needle)){
          return i;
        }
      }  
    }
    return -1;
  }

  public static void main(String[] args) {
    String hay = "leetCode";
    String need = "Code";
    System.out.println(Strstr(hay, need)); 
  }
}
