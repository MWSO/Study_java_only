public class Test_2{
  public static void main(String[] args){
    int x = 5;
    int y = 10;
    String ans = "x+yは" + (x + y);
    System.out.println(ans);

    System.out.println("ようこそ占いの館へ");
    System.out.println("あなたの名前を教えてください");
    String name = new java.util.Scanner(System.in).nextLine();
    System.out.println("次にあなたの年齢を教えてください");
    String ageString = new java.util.Scanner(System.in).nextLine();
    int age = Integer.parseInt(ageString);
    int fortune = new java.util.Random().nextInt(4);
    fortune++;
    System.out.println("占いの結果が出ました・・・");
    System.out.println(age + "歳の" + name + "さんの運気番号は" + fortune + "です");
    System.out.println("1:大吉,2:中吉,3:吉,4:凶");

  }
}