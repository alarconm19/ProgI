import java.util.Scanner;

public class ej2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int no_primos = 0;
        int primos = 0;

        System.out.print("Ingrese un numero: ");
        
        int num = sc.nextInt();
        if(num != 0){
            int sum = 0;
            for(int i = 1; i < num; i++){
                if((num % i) == 0){
                    sum += 1;
                }
            } 
            
            if(sum > 1){
                System.out.println("El numero no es primo.");
            } else {
                System.out.println("El numero es primo.");

                for(int i = 1; i < num; i++){
                    sum = 0;
                    for(int j = 1; j < i; j++){
                        if((i % j) == 0){
                            sum += 1;
                        }
                    } 
                    
                    if(sum > 1){
                        no_primos += 1;
                    } else {
                        primos += 1;
                    }
                }
                System.out.println("Cant numeros primos: " +primos);
                System.out.println("Cant numeros no primos: " +no_primos);
            }

        } else {
            System.out.println("El numero es neutro.");
        }
        sc.close();
        
    }
}
