import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = scanner.nextBoolean();

        System.out.print("¿Has terminado tus tareas? (true/false): ");
        boolean tareasTerminadas = scanner.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irABiblioteca = scanner.nextBoolean();

        boolean puedeSalir = (!llueve && tareasTerminadas) || irABiblioteca;

        System.out.println("¿Puedes salir a la calle? " + puedeSalir);
    }
}
