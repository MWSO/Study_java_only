public class DNA {
  public static void main(String[] args) {
    int[] seq = new int[10];

    for (int i = 0; i < seq.length; i++) {
      seq[i] = new java.util.Random().nextInt(4);
    }

    for (int i = 0; i < seq.length; i++) {
      String[] base = {"A", "T", "G", "C"};
      System.out.println(base[seq[i]]);
    }

    int sum = 0;
    for (int value : seq) {
      sum += value;
    }
    System.out.println(sum);
  }
}