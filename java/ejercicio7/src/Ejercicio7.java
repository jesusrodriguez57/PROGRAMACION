import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        boolean esMayorDeEdad = (edad >= 18);

        System.out.println("¿Eres mayor de edad? " + esMayorDeEdad);
    }
}
