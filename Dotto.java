public class Dotto {
  public static void main(String[] args) {
    //配列定義
    int[] array = new int[10];
    for (int i = 0; i < array.length; i++) {
      array[i] = (i * 10);
    }

    boolean flg = true;
    //[0]～[4]までの偶数
    System.out.print("偶数：");
    for (int i = 0; i < 5; i++) {
      if (flg) {
        System.out.print(array[i]);
        flg = false;
      } else {
        System.out.print("," + array[i]);
      }
    }

    flg = true;
    //[5]～[9]までの奇数
    System.out.print("\n" + "奇数：");
    for (int i = 5; i < array.length; i++) {
      if (flg) {
        System.out.print(array[i]);
        flg = false;
      } else {
        System.out.print("," + array[i]);
      }
    }
  }
}