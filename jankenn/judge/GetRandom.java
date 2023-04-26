package jankenn.judge;

public class GetRandom {
  public static int GetRandom() {
    Random rand = new java.util.Random();
    return rand.nextInt(3);
  }
}