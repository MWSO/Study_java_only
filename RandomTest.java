public class RandomTest {
  public static void main(String[] args) {
    int rand = 0;
    for (int i = 0; i < 5; i++) {
      rand = new java.util.Random().nextInt(6);
      if (rand == 5) {
        System.out.println("ラッキー！");
      } else if (rand < 5 && rand >= 3) {
        System.out.println("普通です");
      } else {
        System.out.println("アンラッキー・・・");
      }
    }
  }
}