public class Return {
  public static void main(String[] args) {
    int ans = add(6, 2);
    System.out.println("計算結果は," + ans);
  }

  public static int add(int x, int y) {
    int plus = x + y;
    int zyou = (plus *= plus);
    return zyou;
  }
}