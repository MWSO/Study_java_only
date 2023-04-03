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
  }
}