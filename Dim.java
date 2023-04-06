public class Dim {
  public static void main(String[] args) {
    int[][] scores = new int[2][3];
    scores[0][0] = 60;
    scores[0][1] = 70;
    scores[0][2] = 80;
    scores[1][0] = 60;
    scores[1][1] = 50;
    scores[1][2] = 90;
    System.out.println(scores[0][1]);

    int[][] tests = { {30, 50, 70}, {40, 60, 80} };
    System.out.println(tests[0][1]);
    System.out.println(tests[1][2]);
  }
}