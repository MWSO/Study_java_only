package calcapp.main;
public class Calc {
  public static void main(String[] args) {
    int a = new java.util.Scanner(System.in).nextInt();
    int b = new java.util.Scanner(System.in).nextInt();
    int plus = calcapp.logics.CalcLogic.tasu(a, b);
    int minus = calcapp.logics.CalcLogic.hiku(a,b);
    System.out.println("足すと" + plus +"、引くと" + minus);
  }
}