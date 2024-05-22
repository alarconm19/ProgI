public class Funciones {

    public static void main(String[] args) {

        // Creamos una cuenta con titular y cantidad
        Cuenta cuenta1 = new Cuenta("Juan Pérez", 1500);

        // Creamos una cuenta con solo titular (cantidad por defecto es 0)
        Cuenta cuenta2 = new Cuenta("María González");

        // Realizamos algunas operaciones con las cuentas
        cuenta1.ingresar(500);
        cuenta2.retirar(200);

        // Imprimimos los datos de las cuentas
        System.out.println("Cuenta 1: " + cuenta1.getTitular() + " - Saldo: " + cuenta1.getCantidad());
        System.out.println("Cuenta 2: " + cuenta2.getTitular() + " - Saldo: " + cuenta2.getCantidad());
    }

}

class Cuenta {

    // Atributos
    private String titular;
    private double cantidad;

    // Constructores
    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public Cuenta(String titular) {
        this(titular, 0);
    }

    // Métodos Get y Set
    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    // Métodos especiales
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {
        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }
    }
}
