package jankenn.main;
import java.util.*;
import jankenn.judge.*;

public class Main {
  public static void main(String[] args) {
    int user = GetUser.GetUser();
    int rand = GetRandom.GetRandom();
    String result = Judge.judge(user, rand);
    Result.Result(user, rand, result);
  }
}