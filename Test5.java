public class Test5 {
  public static void main(String[] args) {
    introduceOneself();
    String title = "すごいよ";
    String address = "山田";
    String text = "激レア引いた！";
    email(title, address, text);
    email(address, text);
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
}