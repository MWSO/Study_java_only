public class While {
  public static void main(String[] args) {
    int temp = 27;
    do {
      temp--;
      System.out.println("温度を一度下げました\n今は" + temp + "℃です");
    } while (temp > 25);

    int test = 5;
    for (int i = 0; i < 10; i++) {
      test *= 5;
      System.out.println(test);
    }
  }
}