public class Guess {
  public static void main(String[] args) {
    int Random = new java.util.Random().nextInt(10);
    System.out.println("0～9までの数字を当ててみて");

    for (int i = 0; i < 5; i++){
      int Guess = new java.util.Scanner(System.in).nextInt();
      int gap = Math.abs(Random - Guess);

      if (gap == 0) {
        System.out.println("正解！");
        break;
      } else if (gap <= 2) {
        System.out.println("惜しい！");
      } else {
        System.out.println("全然違うよ");
      }
    }
    System.out.println("ゲーム終了");
  }
}