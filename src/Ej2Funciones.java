import java.util.Arrays;
import java.util.Scanner;

public class Ej2Funciones {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese dos numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(Suma(a,b));
        System.out.println(Resta(a,b));
        System.out.println(Multiplicacion(a,b));
        System.out.println(Division(a,b));
        
        System.out.println("Ingrese un numero: ");
        a = sc.nextInt();
        System.out.println(Arrays.toString(Tabla(a)));
        
        sc.close();
    }

    public static int Suma(int a, int b){
        return a + b;
    }

    public static int Resta(int a, int b){
        return a - b;
    }

    public static int Multiplicacion(int a, int b){
        return a * b;
    }

    public static int Division(int a, int b){
        if(a != 0 && b != 0){
            if(a < b) return a / b;
            else return b / a;
        }
        else return 0;
    }

    public static int[] Tabla(int a){
        int[] tabla = new int[10]; 
        for(int i = 0; i < 10; i++){
            tabla[i] = a * (i + 1);
        }
        return tabla;
    }

}
