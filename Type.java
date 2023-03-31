public class Type{
  public static void main(String[] args){
    int i = 5;
    float f = i;
    double d = f;
    System.out.println(i);
    System.out.println(f);
    System.out.println(d);
    int test = (int)f;
    System.out.println(test);

    String age = "26";
    int n = Integer.parseInt(age);
    System.out.println("私の年齢は今年で" + (n + 1) + "になります");

    int r = new java.util.Random().nextInt(100);
    System.out.println("乱数テストです、100点満点中・・・" + r + "点でした！");

    System.out.println("君の名前は？");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("君の年齢は？");
    int yourAge = new java.util.Scanner(System.in).nextInt();
    System.out.println("君は" + yourAge + "歳の" + name + "さんという方なのですね！");
  }
}