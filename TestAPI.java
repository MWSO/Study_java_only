import java.util.*;

public class TestAPI {
  public static void main(String[] args) {
    int[] heights = {170, 195, 160, 155, 175};
    java.util.Arrays.sort(heights);
    for (int height : heights) {
      System.out.print(height + " ");
    }

    Date date = new Date();
    System.out.println("\n" + "今日は、" + date + "です！");

    List<String> list = new ArrayList<String>(
      Arrays.asList("apple", "orange", "peach", "melon"));
    System.out.println(list);
    System.out.println(list.size());

    for(Map.Entry<String, String> entry : map.entrySet()) {
      System.out.println(entry.getKey() + ":" + entry.getValue());
    }
  }

  private static Map<String, String> map = new HashMap<>();
  static {
    map.put("item1", "apple");
    map.put("item2", "orange");
    map.put("item3", "melon");
  }
}