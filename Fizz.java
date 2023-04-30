public class Fizz {
  public static void main(String[] args) {
    System.out.println("FizzBuzzゲーム！" + "\n数字を入れてね！");
    int i = new java.util.Scanner(System.in).nextInt();
    System.out.println(Buzz.Buzz(i));
  }
}