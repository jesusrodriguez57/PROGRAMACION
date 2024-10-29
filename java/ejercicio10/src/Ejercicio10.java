import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("¿Cuántos kilos de manzanas ha vendido en el primer semestre? ");
            int kgmanzanas = scanner.nextInt();
            
            System.out.print("¿Cuántos kilos de peras ha vendido en el primer trimeste? ");
            int kgperas = scanner.nextInt();
            
            double totalmanzanas = kgmanzanas * 2.35;
            double totalperas = kgperas * 1.95;  
            double total = totalperas + totalmanzanas;
            
            System.out.println("En total ha ganado con las manzanas: " + totalmanzanas);
            System.out.println("En total ha ganado con las peras: " + totalperas);
            System.out.println("Total ganado en el primer tremestre: " + total);
            
            System.out.print("¿Cuántos kilos de manzanas ha vendido en el segundo semestre? ");
            int kgmanzanas2 = scanner.nextInt();
            
            System.out.print("¿Cuántos kilos de peras ha vendido en el segundo trimeste? ");
            int kgperas2 = scanner.nextInt();
            
            double totalmanzanas2 = kgmanzanas2 * 2.35;
            double totalperas2 = kgperas2 * 1.95;
            
            double total2 = totalperas2 + totalmanzanas2;
            
            System.out.println("En total ha ganado con las manzanas: " + totalmanzanas2);
            System.out.println("En total ha ganado con las peras: " + totalperas2);
            System.out.println("Total ganado en el segundo tremestre: " + total2);
            
            double totalaño = total + total2;
            System.out.println("En total en un año ha ganado: " + totalaño + " €");
         
        }
    }
}
