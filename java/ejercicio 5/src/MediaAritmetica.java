import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce la primera nota: ");
            int nota1 = scanner.nextInt();
            
            System.out.print("Introduce la segunda nota: ");
            int nota2 = scanner.nextInt();
            double media = (nota1 + nota2) / 2.0;
            System.out.printf("La media aritmética es: %.2f%n", media);
        }
    }
}
