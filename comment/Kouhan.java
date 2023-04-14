package comment;
public class Kouhan {
  public static void callDeae(String name) {
    System.out.println(name + "の悪事はお見通しだ");
  }

  public static void show() throws Exception {
    System.out.println("成敗じゃ！");
    Thread.sleep(3000);
    System.out.println("終了");
    Zenhan.doTogame();
  }
}