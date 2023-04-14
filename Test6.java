public class Test6 {
  public static void main(String[] args) throws Exception {
    doWarusa();
    doTogame();
    callDeae("山田");
    show();
  }

  public static void doWarusa() {
    System.out.println("悪事発覚");
  }

  public static void doTogame() {
    System.out.println("許さん");
  }

  public static void callDeae(String name) {
    System.out.println(name + "の悪事はお見通しだ");
  }

  public static void show() throws Exception {
    System.out.println("成敗じゃ！");
    System.out.println("終了");
    doTogame();
  }
}