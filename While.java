public class While {
  public static void main(String[] args) {
    int temp = 27;
    do {
      temp--;
      System.out.println("温度を一度下げました\n今は" + temp + "℃です");
    } while (temp > 25);
  }
}