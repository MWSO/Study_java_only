package jankenn.judge;

public class GetUser {
  public static int GetUser() {
    Scanner stdin = java.util.Scanner(System.in);

    while (true) {
      System.out.println("じゃんけんの手を数字で入力してね！");
      System.out.println("グー：0, チョキ：1, パー：2");

      if (stdin.hasNextInt()) {
        int number = stdin.nextInt();

        if (number <= -1 || number >= 3) {
          System.out.println("0～2で入力してね！");
          continue;
        } else {
          return number;
        }
      } else {
        System.out.println("整数で入力してね！");
        stdin.next();
      }
    }
  }
}