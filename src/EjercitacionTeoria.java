import java.util.Scanner;

public class EjercitacionTeoria{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        int a = 1;  // -------------------- Volumen y superficie--------------------------------
        int b = a;

        System.out.println(a);
        System.out.println(b);
        
        b = 2;

        System.out.println(a);
        System.out.println(b);*/

        /*System.out.println("Ingrese el radio: ");
        int radio = sc.nextInt();

        double volumen = (4/3) * Math.PI * Math.pow(radio, 3);
        double superficie = 4 * Math.PI * Math.pow(radio, 2);

        System.out.println("El volumen es: " + volumen);
        System.out.println("La superficie es: " + superficie);
        // */


        /*
        int usu = 0, i = 10; //--------------------------- Juego de numero--------------------------
        int num = (int) (Math.random()*100 + 1);

        while(i > 0 && usu != num){
            System.out.println("Ingrese un numero: ");
            usu = sc.nextInt();

            i--;

            if(num > usu) System.out.println("El numero es mayor. Intentos restantes: " + i);
            else if (num < usu)System.out.println("El numero es menor. Intentos restantes: " + i);
                else System.out.println("Has adivinado el numero. Intentos restantes: " + i);
        }
        if(usu != num) System.out.println("El numero era: " + num);
        // */


        /*
        int tamaño = 5;  //----------------------Nombres----------------------

        String[] Nombres = new String[tamaño];

        Cargar(sc, tamaño, Nombres);
        System.out.println("");
        Eliminar(sc, tamaño, Nombres);
        System.out.println("");
        Ordenar(sc, tamaño, Nombres);
        // */

        /* 
        System.out.println("Ingrese el tamaño del arreglo 1: ");
        int tamaño1 = sc.nextInt();

        System.out.println("Ingrese el tamaño del arreglo 2: ");
        int tamaño2 = sc.nextInt();
        System.out.println("");

        int[] a1 = new int[tamaño1]; int[] a2 = new int[tamaño2];
        int[] a3 = new int[tamaño1 + tamaño2];
        
        CargarA(a1, tamaño1, sc);
        System.out.println("");
        CargarA(a2, tamaño2, sc);

        // */

        /*
        for(int i = 0; i < tamaño; i++){
            a3[i] = a1[i];
            a3[i + tamaño] = a2[i];
        }
        // *
        int ind = 0;
        for(int i = 0; i < tamaño1; i++){
            for(int j = 0; j < tamaño2; j++){
                if(a1[i] == a2[j]) a3[ind++] = a1[i];
            }
        }

        /*
        for(int i = 0; i < (tamaño1 + tamaño2 - 1); i++){
            for(int j = (i + 1); j < (tamaño1 + tamaño2); j++){
                if(a3[i] > a3[j]){
                    int aux = a3[i];
                    a3[i] = a3[j];
                    a3[j] = aux;
                }
            }
        }
        // */

        //for(int i = 0; i < (tamaño1 + tamaño2); i++) System.out.print(a3[i] + " / ");
            
        sc.close();
    }







    //----------------------Metodos----------------------//


    public static void CargarA(int[] a, int tamanio, Scanner sc){
        for(int i = 0; i < tamanio; i++){
            System.out.println("Ingrese un numero: "); a[i] = sc.nextInt();
            
        }
        System.out.println();
    }

    public static void Cargar(Scanner sc, int tamanio, String[] Nombres){
        for(int i = 0; i < tamanio; i++){
            System.out.println("Ingrese un nombre: ");
            String nom = sc.next();

            if(nom.length() > 30){
                do {
                    System.out.println("Ha superado el limte. Ingrese un nombre nuevamente: ");
                    nom = sc.next();
                } while (nom.length() > 30);
            }
            Nombres[i] = nom;
            System.out.println("Nombre " + (i + 1) + ": " + Nombres[i]);
        }
    }
    public static void Eliminar(Scanner sc, int tamanio, String[] Nombres){

        System.out.println("Ingrese el nombre a eliminar: ");
        String eliminar = sc.next();
        System.out.println();

        for(int i = 0; i < tamanio; i++){
            if(Nombres[i].equals(eliminar)){
                Nombres[i] = "";
                System.out.println("Se ha eliminado el nombre.");
                break;
            }
            if(i == (tamanio - 1)) System.out.println("No se ha encontrado el nombre.");
        }
    }

    public static void Ordenar(Scanner sc, int tamanio, String[] Nombres){
        for(int i = 0; i < (tamanio - 1); i++){
            for(int j = (i + 1); j < tamanio; j++){
                if(Nombres[i].compareTo(Nombres[j]) > 0){
                    String aux = Nombres[i];
                    Nombres[i] = Nombres[j];
                    Nombres[j] = aux;
                }
            }
        }

        System.out.println("Arreglo ordenado: ");

        for(int i = 0; i < tamanio; i++){
            System.out.print(Nombres[i] + " / ");
        }
    }
}


