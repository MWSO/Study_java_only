public class Test3 {
  public static void main(String[] args) {
    int isHungry = 1;
    String food = "寿司";
    System.out.println("こんにちは");

    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです");
    } else {
      System.out.println("はらぺこです");
      System.out.println(food + "をいただきます");
    }

    System.out.print("[メニュー]1:検索 2:登録 3:削除 4:変更>");
    int selected = new java.util.Scanner(System.in).nextInt();
    switch (selected) {
      case 1:
        System.out.println("検索します");
        break;
      case 2:
        System.out.println("登録します");
        break;
      case 3:
        System.out.println("削除します");
        break;
      case 4:
        System.out.println("変更します");
        break;
    }

    System.out.println("数字当てゲーム!");
    int ans = new java.util.Random().nextInt(10);
    for (int i = 5; i > 0; i-- ) {
      System.out.println("0~9の数字を当てろ！");
      int num = new java.util.Scanner(System.in).nextInt();
      if (ans == num) {
        System.out.println("当たり！");
        break;
      } else {
        System.out.println("外れ、チャンスは残り" + (i-1) + "回です");
      }
    }
    System.out.println("ゲームを終了します");
  }
}