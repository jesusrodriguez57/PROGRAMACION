import java.util.Scanner;
public class Ejercicio20 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la nota (de 0 a 10): ");
        int nota = scanner.nextInt();
        if (nota < 0 || nota > 10) {
            System.out.println("La nota debe estar entre 0 y 10.");
        } else {
            if (nota >= 0 && nota <= 4) {
                System.out.println("Insuficiente");
            } else if (nota == 5) {
                System.out.println("Suficiente");
            } else if (nota == 6) {
                System.out.println("Bien");
            } else if (nota == 7 || nota == 8) {
                System.out.println("Notable");
            } else if (nota == 9 || nota == 10) {
                System.out.println("Sobresaliente");
            }
        }

        scanner.close();
    }
}
