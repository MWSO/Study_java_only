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
  }
}