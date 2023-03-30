public class Pie{
  public static void main (String[] args) {
    //円の面積を求める
    final double PI = 3.14;
    int pie = 5;
    System.out.println("円の半径は" + pie + "cmなので、面積は");
    System.out.println((pie * pie * PI) + "㎠です");
    pie = 15;
    System.out.println("半径が15㎝だと・・・");
    System.out.println((pie * pie * PI) + "㎠です");
  }
}