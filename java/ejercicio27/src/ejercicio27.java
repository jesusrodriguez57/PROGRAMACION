import java.util.Scanner;

public class ejercicio27 {
    public static void main(String[] args) {
         try (Scanner scanner = new Scanner(System.in)) {
             System.out.println("introduce un numero");
              int num = scanner.nextInt();
            for  (int i = 0; i < num; i++) {
                System.out.print(i);
            }
         }
        
    }
}
