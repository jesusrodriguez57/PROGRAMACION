import java.util.Scanner;

public class EdadFutura {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿que edad tienes? ");
            int edadActual = scanner.nextInt();
            int edadFutura = edadActual + 1;
            System.out.println("el año que viene tendras " + edadFutura + " años.");
        }
    }
}
