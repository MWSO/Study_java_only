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
  }
}