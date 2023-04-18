import java.util.Date;

public class TestAPI {
  public static void main(String[] args) {
    int[] heights = {170, 195, 160, 155, 175};
    java.util.Arrays.sort(heights);
    for (int height : heights) {
      System.out.print(height + " ");
    }

    Date date = new Date();
    System.out.println("\n" + "今日は、" + date + "です！");
  }
}