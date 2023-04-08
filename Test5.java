public class Test5 {
  public static void main(String[] args) {
    introduceOneself();
    String title = "すごいよ";
    String address = "山田";
    String text = "激レア引いた！";
    email(title, address, text);
    email(address, text);
    double triArea = calcTriangleArea(5,10);
    System.out.println("この三角形の面積は" + triArea + "㎠です");
    double radius = new java.util.Scanner(System.in).nextDouble();
    double cirArea = calcCirclearea(radius);
    System.out.println("この円の面積は" + cirArea + "㎠です");
  }

  public static void introduceOneself() {
    String name = "小太郎";
    int age = 27;
    double high = 175.5;
    char eto = '子';
    System.out.println("私は" + name + "、年齢は" + age + "歳で身長は" + high + "、干支は" + eto + "だ！");
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "にメールを送りました");
    System.out.println("件名：" + title + "\n本文：" + text);
  }

  public static void email(String address, String text) {
    System.out.println(address + "にメールを送りました");
    System.out.println("件名：無題 "+ "\n本文：" + text);
  }

  public static double calcTriangleArea(double bottom, double height) {
    double area = bottom * height / 2;
    return area;
  }

  public static double calcCirclearea(double radius) {
    double area = radius * radius * 3.14;
    return area;
  }
}