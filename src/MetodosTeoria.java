import java.util.Scanner;

class Metodosteoria{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese 2, 3 o 4 valores para ingresar: ");
        int tam = sc.nextInt();

        int[] Arr = new int[4];

        for(int i = 0; i < tam; i++){
            System.out.println("Ingrese un valor: ");
            Arr[i] = sc.nextInt();
        }
        
        switch (tam) {
            case 2:
                System.out.println("El mayor numero es: " + Mayor(Arr[0], Arr[1]));
                break;
            case 3:
                System.out.println("El mayor numero es: " + Mayor(Arr[0], Arr[1], Arr[2]));
                break;
            case 4:
                System.out.println("El mayor numero es: " + Mayor(Arr[0], Arr[1], Arr[2], Arr[3]));
                break;
        }

        sc.close();
    }

    static int Mayor(int a, int b){
        return Math.max(a, b);
    }
    static int Mayor(int a, int b, int c){
        return Math.max(Mayor(a, b), c);
    }
    static int Mayor(int a, int b, int c, int d){
        return Math.max(Mayor(a, b), Mayor(c, d));
    }
}