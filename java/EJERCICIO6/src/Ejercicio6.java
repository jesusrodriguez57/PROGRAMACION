import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
     
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Introduce el radio de la circunferencia ");
            double radio = scanner.nextDouble();
        
            double longitud = 2 * Math.PI * radio;
            double area = Math.PI * Math.pow(radio, 2);
            
            System.out.printf("La longitud de la circunferencia es: %.2f%n", longitud);
            System.out.printf("El área de la circunferencia es: %.2f%n", area);
           
        } 
    }
}

