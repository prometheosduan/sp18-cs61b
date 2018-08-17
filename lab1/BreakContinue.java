public class BreakContinue {
  public static void windowPosSum(int[] m, int n) {
    /** your code here */
    for (int index = 0; index < m.length; index += 1) {
      if (m[index] < 0) {
        continue;
      }
      for (int inner_index = index + 1; inner_index - index <= n; inner_index += 1) {
        if (inner_index >= m.length) {
          break;
        } else {
          m[index] = m[index] + m[inner_index];
        }
      }
    }
  }

  public static void main(String[] args) {
    int[] a = {1, 2, -3, 4, 5, 4};
    int n = 3;
    windowPosSum(a, n);

    // Should print 4, 8, -3, 13, 9, 4
    System.out.println(java.util.Arrays.toString(a));
  }
}
