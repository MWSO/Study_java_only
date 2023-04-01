public class If {
  public static void main(String[] args) {
    System.out.println("今日の天気は？（晴れor雨orその他)");
    String tenki = new java.util.Scanner(System.in).nextLine();

    if (tenki.equals("晴れ")) {
      System.out.println("今日は出かけよう！");
    } else if (tenki.equals("雨")) {
      System.out.println("今日は家で読書をしよう！");
    } else {
      System.out.println("ニート生活します。");
    }

    System.out.println("ついでに今日の運勢も占いますか？（\"はい\"ならやります)");
    String ans = new java.util.Scanner(System.in).nextLine();
    if (ans.equals("はい")) {
      int fortune = new java.util.Random().nextInt(4);
      switch (fortune) {
        case 0:
          System.out.println("今日は絶好調！");
          break;
        case 1:
          System.out.println("今日はいい日");
          break;
        case 2:
          System.out.println("今日は普通の日");
          break;
        case 3:
          System.out.println("今日は家から出るな");
      }
    } else {
      System.out.println("やらないのですね・・・");
    }
  }
}