package jankenn.main;

public class Result {
  public static void Result(int user, int rand, String result) {
    String[] jankenn = ["グー", "チョキ", "パー"];
    System.out.println("あなたは「" + jankenn[user] + "」を出しました");
    System.out.println("相手は「" + jankenn[rand] + "」を出しました");
    System.out.println(result);
  }
}