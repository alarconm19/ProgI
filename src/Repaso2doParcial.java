import java.util.Scanner;

public class Repaso2doParcial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un intervalo en hs, min, sg: ");
        int horas = sc.nextInt();
        int min = sc.nextInt();
        int seg = sc.nextInt();

        System.out.println("La duracion en segundos es: " + CalcularSeg(horas, min, seg) + " seg.");

        System.out.println("Ingrese un intervalo en sg: ");

        seg = sc.nextInt();

        int[] tiempo = CalcularHMS(seg);
        System.out.println("La duracion en hs, min y sg es: " + tiempo[0] + " hs/ " + tiempo[1] + " min/ " + tiempo[2] + " sg.");

        sc.close();
    }

    static int CalcularSeg(int h, int m, int s) {
        return h * 3600 + m * 60 + s;
    }

    static int[] CalcularHMS(int s){
        int hs = 0, min = 0;
        if(s / 3600 > 0){
            hs = s / 3600;
            s -= 3600 * hs;
        }
        if(s / 60 > 0){
            min = s / 60;
            s -= 60 * min;
        }

        int seg = s;

        return new int[]{hs, min, seg};
    }
}