public class Buzz {
  public static String Buzz(int i) {
    String result;

    if ((i % 3) == 0 && (i % 5) == 0) {
      result = "FizzBuzz";
    } else if ((i % 3) == 0) {
      result = "Fizz";
    } else if((i % 5) == 0) {
      result = "Buzz";
    } else {
      result = Integer.toString(i);
    }
    return result;
  }
}