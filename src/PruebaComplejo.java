import java.util.Scanner;

class Complejo{
    private double pReal;
    private double pImaginaria; 

    public Complejo(){
        this.pReal = 0;
        this.pImaginaria = 0;
    }

    public void Asignar(double pReal, double pImaginaria){
        this.pReal = pReal;
        this.pImaginaria = pImaginaria;
    }

    public void Sumar(double pReal, double pImaginaria){
        this.pReal += pReal;
        this.pImaginaria += pImaginaria;
    }

    public void Imprimir(){
        System.out.print(this.pReal + "." + this.pImaginaria);
    }
}

public class PruebaComplejo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la parte real: ");
        double real = sc.nextDouble();
        System.out.println();

        System.out.print("Ingrese la parte imaginaria: ");
        double imaginaria = sc.nextDouble();
        System.out.println();

        Complejo complejo1 = new Complejo();
        complejo1.Asignar(real, imaginaria);


        System.out.print("Ingrese la parte real para sumar: ");
        real = sc.nextDouble();
        System.out.println();

        System.out.print("Ingrese la parte imaginaria para sumar: ");
        imaginaria = sc.nextDouble();
        System.out.println();

        complejo1.Sumar(real, imaginaria);

        complejo1.Imprimir();

        sc.close();
    }
}