package jankenn.judge;
import java.util.*;

public class Judge {
  public static String judge(int user, int rand) {
    String result;

    if ((user==0 && rand==1) || (user==1 && rand==2) || (user==2 && rand==0)) {
      result = "あなたの勝ち！";
    } else if ((user==0 && rand==2) || (user==1 && rand==0) || (user==2 && rand==1)) {
      result = "あなたの負け";
    } else {
      result = "引き分け！";
    }
    return result;
  }
}