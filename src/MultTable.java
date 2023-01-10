public class MultTable {
  public static void mult(int n) {
    System.out.printf("Tabela de multiplicação de %d%n", n);

    for (int i = 0; i <= 9; i++) {
      System.out.printf("%2d X %2d = %2d%n", n, i, n * i);
    }
  }
}
