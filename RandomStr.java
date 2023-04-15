import java.nio.charset.*;
import java.util.*;

public class RandomStr {
  public static String RandomString(int i) {
    int[] array = new int[256];
    String mystring;
    StringBuffer thebuffer;
    String RandomNum;

    new Random().nextInt(array);

    mystring = new String(array, Charset.forName("UTF-8"));

    thebuffer = new StringBuffer();

    RandomNum = mystring.replaceAll("[^A-z0-9]", "");

    for (int m = 0; m < RandomNum.length(); m++) {
      if (Character.isLetter(RandomNum.charAt(m)) && (i > 0) || Character.isDigit(RandomNum.charAt(m)) && (i > 0)) {
        thebuffer.append(Random.charAt(m));
        i--;
      }
    }
  }
}