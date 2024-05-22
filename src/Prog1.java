import java.util.Scanner;

public class Prog1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la distancia a recorrer en kilometros: ");
        
        double km = sc.nextDouble();
        double precio = km * 10.50;

        System.out.println("El precio del boleto es: $" + precio);

        sc.close();
        
    }
}
