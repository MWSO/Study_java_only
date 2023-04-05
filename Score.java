public class Score {
  public static void main(String[] args) {
    int[] scores;
    scores = new int[5];
    int num = scores.length;
    System.out.println("要素の数：" + num);
    scores[1] = 30;
    System.out.println(scores[1]);

    int[] test = new int[] {30, 50, 70, 90};
    System.out.println(test[2]);

    int sum = 0;
    int avr = 0;
    int count = 0;

    for (int i = 0; i < test.length; i++) {
      if (test[i] >= 60) {
        count++;
      }
      sum += test[i];
      avr = sum / test.length;
    }
    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avr);
    System.out.println("平均点越えの教科は" + count + "科目です");
  }
}