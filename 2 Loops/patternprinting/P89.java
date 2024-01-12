package patternprinting;

public class P89 {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 11; i += 2) {
            for (int k = 10; k >= i; k-=2) {
                System.out.print(" ");
            }
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
    
      /*/ public static void main(String[] args) {
      int i, j, s;
      for (i = 1; i <= 5; i++) {
      for (j = 1, s = 1; j <= 9; j++) {
      if (j >= 6 - i && j <= 4 + i) {
      System.out.print(s + "");
      s = (s == 1) ? --s : ++s;
      } else
      System.out.print(" ");
      }
      System.out.println();
      }
      }*/
     
}
