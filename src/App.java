import java.util.Scanner;

public class App {

  public static String appName = "Multiplication Table";
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

    System.out.printf("### %s ###\n", appName);
    System.out.print("Digite o número para a tabela: ");

    int n = 0;

    try {
      n = scanner.nextInt();
      MultTable.mult(n);
    } catch (Exception e) {
      System.err.printf("%s: %s%n", e, e.getMessage());
    }
  }
}
