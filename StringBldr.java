import java.lang.reflect.Array;
import java.util.*;
public class StringBldr{
  public static void main(String[] args) {

    // System.out.println('a' - 'a');
    // System.out.println('a' + 3);
    // System.out.println((char)('a' + 3));

    // System.out.println("a" + "a");
    // // System.out.println("a" + 3);
    // System.out.println("a" + 'a');
    // System.out.println('a' + 'a');

    // System.out.println("faiz" + new Integer(50));

    
    // String alphabet = "";
    // for(int i=0; i <26; i++) {
    //   char ch = ((char)('a' + i));
    //   // System.out.print(ch+" ");
    //   alphabet = alphabet +" " +ch;
    // }
    // System.out.println(alphabet+" ");

    String name = " FAIZ ZAMIR ";
    String reversedStr = name.reverse()
    // String name1 = (Arrays.toString(name.toCharArray()));
    // System.out.println(name1);
    System.out.println(name.indexOf("F"));
    System.out.println(name.trim());
    System.out.println(name.strip());

    // StringBuilder builder  = new StringBuilder();
    // for(int i =0; i < 26; i++) {
    //   char ch =(char)('a' + i);
    //   builder.append(ch);  
    // }
    // System.out.println(builder.toString());
    // System.out.println(builder.reverse());
  }
}