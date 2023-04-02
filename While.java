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

    for (int i = 1; i < 10; i += 2) {
      if (i == 1 || i == 5) {
        continue;
      }
      for (int j = 1; j < 10; j++) {
        System.out.print(i * j);
        System.out.print(" ");
      }
      System.out.println("");
    }
  }
}