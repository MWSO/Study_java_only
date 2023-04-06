public class Test4 {
  public static void main(String[] args) {
    int[] lists = {121902, 8302, 55100};
    for (int i = 0; i < lists.length; i++) {
      System.out.println(lists[i]);
    }

    for (int num : lists) {
      System.out.println(num);
    }
  }
}