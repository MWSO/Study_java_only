package jankenn.judge;
import java.util.*;

public class GetRandom {
  public static int GetRandom() {
    Random rand = new Random();
    return rand.nextInt(3);
  }
}