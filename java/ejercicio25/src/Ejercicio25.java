import java.util.Scanner;
public class Ejercicio25 {
    public static void main (String[] args){
        int aciertos =0;
        int sumaUsuario;
        int sumando1
        int sumando2
        do {
            int sumando1= (int)Math.random();
            int sumando2= (int)Math.random();
            
            System.out.println("Escribe la suma de los siguientes numeros:");
            Scanner sc = new Scanner(System.in);
        
            sumaUsuario = sc.nextint();
            
        } while(sumando1 + sumando2 ==sumaUsuario);
    }
}