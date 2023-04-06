public class Test4 {
  public static void main(String[] args) {
    int[] lists = {121902, 8302, 55100};
    for (int i = 0; i < lists.length; i++) {
      System.out.println(lists[i]);
    }

    for (int num : lists) {
      System.out.println(num);
    }

    /*数字当て*/
    int[] numbers = {3, 4, 9};
    System.out.println("1桁の数字を入力してください");
    int input = new java.util.Scanner(System.in).nextInt();

    for (int number : numbers) {
      if (number == input) {
        System.out.println("当たり！");
      }
    }
  }
}