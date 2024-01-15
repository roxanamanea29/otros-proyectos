

public class bucle {
   public static void main(String[] args) {
      int j=1;
      for (int i=0; i<5; i++ ) {
        switch (i) {
            case 0:
            case 2:
                j = j+i;
                break;
            case 1:
                j = j * i;
            case 3:
                j = j - i;
                break;
            default:
                j = i/ j;
        }
          System.out.println(j);
      }
      }
}