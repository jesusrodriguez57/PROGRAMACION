import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("di un numero");
        float num = sc.nextFloat();
        System.out.println("di un numero");
        float num2 = sc.nextFloat();
        System.out.println("di un numero");
        float num3 = sc.nextFloat();
        if (num > num2 && num2 > num3){
            System.out.println("el orden es" + num + "," + num2 + "," + num3);
            
        }else if (num > num3 && num3 > num2){
            System.out.println("el orden es" + num + "," + num3 + "," + num2);
            
        }
    }
    
}
