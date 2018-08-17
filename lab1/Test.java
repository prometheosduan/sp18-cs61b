public class Test {
   public static int max(int[] m) {
      int index = 1;
      int result = m[0];
      while (index < m.length) {
          if (m[index] > result) {
              result = m[index];
          } else {
              result = result;
          }
         index = index + 1;
      }
       return result;
   }

   public static int max_2(int[] m) {
     int result = m[0];
     for (int index = 1; index < m.length; index += 1) {
       if (m[index] > result) {
           result = m[index];
       } else {
           result = result;
       }
     }
    return result;
   }
   public static void main(String[] args) {
      int[] numbers = new int[]{9, 2, 15, 2, 22, 10, 6};
      System.out.println(max_2(numbers));
   }
}
