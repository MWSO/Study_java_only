public class Dotto {
  public static void main(String[] args) {
    //配列定義
    int[] array = new int[30];
    for (int i = 0; i < array.length; i++) {
      array[i] = (i * 10);
    }

    boolean flg = true;
    //[0]～[14]までの偶数
    System.out.print("偶数：");
    for (int i = 0; i < 15; i++) {
      if ((i % 2) == 0) {
        if (flg) {
          System.out.print(array[i]);
          flg = false;
        } else {
          System.out.print("," + array[i]);
        }
      }
    }

    flg = true;
    //[15]～[29]までの奇数
    System.out.print("\n" + "奇数：");
    for (int i = 15; i < array.length; i++) {
      if ((i % 2) == 1) {
        if (flg) {
          System.out.print(array[i]);
          flg = false;
        } else {
          System.out.print("," + array[i]);
        }
      }
    }
  }
}