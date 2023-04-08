public class Return {
  public static void main(String[] args) {
    int ans = add(6, 2);
    System.out.println("計算結果は," + ans);
    int[] array = makeArray(5);
    for (int i : array) {
      System.out.println(i);
    }
  }

  public static int add(int x, int y) {
    int plus = x + y;
    int zyou = (plus *= plus);
    return zyou;
  }

  public static int[] makeArray(int size) {
    int[] newArray = new int[size];
    for ( int i = 0; i < newArray.length; i++) {
      newArray[i] = i;
    }
    return newArray;
  }
}