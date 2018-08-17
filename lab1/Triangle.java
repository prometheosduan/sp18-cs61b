public class Triangle {
  public static void main(String[] args) {
    int count = 1;
    while (count <= 5) {
      int alter = count;
      while (alter > 0) {
      System.out.print("*");
      alter  = alter  - 1;
      }
    System.out.println("");
    count = count + 1;
    }
  }
}
