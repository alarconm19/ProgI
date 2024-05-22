import java.util.Scanner;

public class EjercitacionTeoria2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /*
        System.out.print("Ingrese el tamaño: "); 
        int tamaño = sc.nextInt();

        System.out.println("");

        int[] Num = new int[tamaño];

        for(int i = 0; i < tamaño; i++){
            System.out.print("Ingrese un numero: ");
            Num[i] = sc.nextInt();
            System.out.println("");
        }

        if(EsCapicua(Num)) System.out.println("Es capicua.");
        else System.out.println("No es capicua.");
        //*/


        //* 
        System.out.print("Ingrese la palabra: "); 
        String Nombre = sc.next();

        if(EsPalindromo(Nombre)) System.out.println("Es palindromo.");
        else System.out.println("No es palindromo.");
        // */


        sc.close();
    }

    /* 
    static boolean EsCapicua(int[] a){
        int ini = 0;
        int fin = a.length - 1;
        while(a[ini] == a[fin]){
            if(ini >= fin) return true;
            ini += 1;
            fin -= 1;
        }
        return false;
    }
    //*/

    //* 
    static boolean EsPalindromo(String a){
        a = a.toLowerCase();
        String invertida = new StringBuilder(a).reverse().toString();
        return invertida.equals(a);
    }
    // */
}