import java.util.Scanner;

public class Arreglos {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud del arreglo: ");
        int n = sc.nextInt();

        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = i + 1;
        }

        int[] primos = new int[num.length];
        int p = 0;
        int sum = 0;

        for(int i = 0; i < num.length; i++){
            if(esPrimo(i)){
                primos[p++] = i;
            }
            sum += num[i];
        }
        float prom = (float) sum / 10;

        System.out.println("La sumatoria da igual a = " + sum + " y el promedio es: " + prom);
        System.out.println("Los numeros primos dentro del arreglo son: ");

        for(int i = 0; i < p; i++){
            System.out.println(primos[i]);
        }
        
        sc.close();
    }

    public static boolean esPrimo(int num){
        if(num <= 1){
            return false;
        }
        for(int i = 2; i < num; i++){
            if((num % i) == 0){
                return false;
            }
        }
        return true;
    }

}
