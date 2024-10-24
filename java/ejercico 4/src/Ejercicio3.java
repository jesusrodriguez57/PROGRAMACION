import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int anyoActual;
        int anyoNacimiento;
        int edad;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca año actual");
        anyoActual = sc.nextInt();
        System.out.println("introduzca año de nacimiento");
        anyoNacimiento = sc.nextInt();
        
        edad = anyoActual - anyoNacimiento;
        System.out.println("edad: " + edad);
    }
}