import java.util.Scanner;

public class Computadoras{
    static int CodComp = 1;
    static int CodPor = 0;
    static int CodSob = 0;
    static Portatil[] ListaPortatil = new Portatil[20];
    static Sobremesa[] ListaSobremesa = new Sobremesa[20];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListaPortatil[CodPor++] = new Portatil(CodComp++, 149999.99, 1.23, 1);
        ListaSobremesa[CodSob++] = new Sobremesa(CodComp++, 99999.99, "Atx", 4);

        int aux = 0;

        while(aux == 0){
            System.out.println("Que desea hacer? 1 - Agregar / 2 - Vender / 3 - Buscar / 4 - Mostrar todos.");
            int eleccion = sc.nextInt();
            int cod;

            switch (eleccion) {
                case 1:
                    Agregar(sc);
                    MostrarListas();
                    break;
                
                case 2:
                    System.out.println("Ingrese el codigo del producto a vender. ");
                    cod = sc.nextInt();

                    Vender(cod);
                    MostrarListas();

                    break;

                case 3:
                    System.out.println("Ingrese el codigo del producto a buscar. ");
                    cod = sc.nextInt();

                    BuscarComputadora(cod, sc);
                    System.out.println();
                    MostrarListas();

                    break;

                case 4:
                    MostrarListas();
                    break;

                default:
                    break;
            }
            System.out.println("0 - Continuar / 1 - Salir");
            aux = sc.nextInt();
        }

        sc.close();
    }

    static void Agregar(Scanner sc){
        System.out.println("Que producto desea agregar? 1 - Portatil / 2 - Sobremesa.");
        int eleccion = sc.nextInt();
        double pre;
        int cant;
        switch(eleccion){
            case 1:
                System.out.println("Ingrese el precio del portatil: ");
                pre = sc.nextDouble();

                System.out.println("Ingrese el peso del portatil: ");
                double peso = sc.nextDouble();

                System.out.println("Ingrese la cantidad: ");
                cant = sc.nextInt();

                ListaPortatil[CodPor++] = new Portatil(CodComp++, pre, peso, cant);
                break;

            case 2: 
                System.out.println("Ingrese el precio del pc de sobremesa: ");
                pre = sc.nextDouble();

                System.out.println("Ingrese la descripcion de la torre: ");
                sc.nextLine();
                String torre = sc.nextLine();

                System.out.println("Ingrese la cantidad: ");
                cant = sc.nextInt();

                ListaSobremesa[CodSob++] = new Sobremesa(CodComp++, pre, torre, cant);

                break;

            default: 
                break;
        }
    }

    static void Vender(int cod){
        int i = 0;
        while(i < CodPor){
            if(ListaPortatil[i].getCodigo() == cod){
                ListaPortatil[i].Vender();

                System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());
                System.out.println();
                return;
            }
            i++;
        }
        
        i = 0;
        while(i < CodSob){
            if(ListaSobremesa[i].getCodigo() == cod){
                ListaSobremesa[i].Vender();

                System.out.println("Computadora : " + ListaSobremesa[i].getCodigo() + " / Precio: $" + ListaSobremesa[i].getPrecio() + " / Slogan: " + ListaSobremesa[i].getSlogan() + " / Torre: " + ListaSobremesa[i].getTorre() + " / Cant: " + ListaSobremesa[i].getCant());
                return;
            }
            i++;
        }
        System.out.println("No se ha encontrado el producto. ");
    }

    static void MostrarListas(){
        int i = 0, j = 0;
        while(i < CodPor && j < CodSob){
            if(ListaPortatil[i].getCodigo() < ListaSobremesa[j].getCodigo()){
                System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());
                i++;
            }
            else{
                System.out.println("Computadora : " + ListaSobremesa[j].getCodigo() + " / Precio: $" + ListaSobremesa[j].getPrecio() + " / Slogan: " + ListaSobremesa[j].getSlogan() + " / Torre: " + ListaSobremesa[j].getTorre() + " / Cant: " + ListaSobremesa[j].getCant());
                j++;
            }
        }
        
        while(i < CodPor){
            System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());
            i++;
        }

        while(j < CodSob){
            System.out.println("Computadora : " + ListaSobremesa[j].getCodigo() + " / Precio: $" + ListaSobremesa[j].getPrecio() + " / Slogan: " + ListaSobremesa[j].getSlogan() + " / Torre: " + ListaSobremesa[j].getTorre() + " / Cant: " + ListaSobremesa[j].getCant());
            j++;
        }
    }

    static void BuscarComputadora(int cod, Scanner sc){
        int i = 0;
        while(i < CodPor){
            if(ListaPortatil[i].getCodigo() == cod){
                System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());
                
                System.out.println("Desea modificar algun dato? 1 - Codigo / 2 - Precio / 3 - Peso / 4 - Cantidad.  / 5 - Continuar");
                int eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaPortatil[i].setCodigo(sc.nextInt());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());

                        break;
                    
                    case 2:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaPortatil[i].setPrecio(sc.nextDouble());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());

                        break;
                    
                    case 3:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaPortatil[i].setPeso(sc.nextDouble());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());

                        break;
                
                    case 4:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaPortatil[i].setCant(sc.nextInt());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaPortatil[i].getCodigo() + " / Precio: $" + ListaPortatil[i].getPrecio() + " / Slogan: " + ListaPortatil[i].getSlogan() + " / Peso: " + ListaPortatil[i].getPeso() + "kg. / Cant: " + ListaPortatil[i].getCant());

                        break;
                
                    
                    default:
                        break;
                }
                return;
            }
            i++;
        }
        
        i = 0;
        while(i < CodSob){
            if(ListaSobremesa[i].getCodigo() == cod){
                System.out.println("Computadora : " + ListaSobremesa[i].getCodigo() + " / Precio: $" + ListaSobremesa[i].getPrecio() + " / Slogan: " + ListaSobremesa[i].getSlogan() + " / Torre: " + ListaSobremesa[i].getTorre() + " / Cant: " + ListaSobremesa[i].getCant());

                System.out.println("Desea modificar algun dato? 1 - Codigo / 2 - Precio / 3 - Peso / 4 - Cantidad.");
                int eleccion = sc.nextInt();

                switch (eleccion) {
                    case 1:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaSobremesa[i].setCodigo(sc.nextInt());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaSobremesa[i].getCodigo() + " / Precio: $" + ListaSobremesa[i].getPrecio() + " / Slogan: " + ListaSobremesa[i].getSlogan() + " / Torre: " + ListaSobremesa[i].getTorre() + " / Cant: " + ListaSobremesa[i].getCant());
                        break;
                    
                    case 2:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaSobremesa[i].setPrecio(sc.nextDouble());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaSobremesa[i].getCodigo() + " / Precio: $" + ListaSobremesa[i].getPrecio() + " / Slogan: " + ListaSobremesa[i].getSlogan() + " / Torre: " + ListaSobremesa[i].getTorre() + " / Cant: " + ListaSobremesa[i].getCant());

                        break;
                    
                    case 3:
                        System.out.println("Ingrese el nuevo dato: ");
                        sc.nextLine();
                        String temp = sc.nextLine();
                        ListaSobremesa[i].setTorre(temp);
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaSobremesa[i].getCodigo() + " / Precio: $" + ListaSobremesa[i].getPrecio() + " / Slogan: " + ListaSobremesa[i].getSlogan() + " / Torre: " + ListaSobremesa[i].getTorre() + " / Cant: " + ListaSobremesa[i].getCant());

                        break;
                
                    case 4:
                        System.out.println("Ingrese el nuevo dato: ");
                        ListaSobremesa[i].setCant(sc.nextInt());
                        
                        System.out.println("Se ha modificado el dato. ");

                        System.out.println("Computadora : " + ListaSobremesa[i].getCodigo() + " / Precio: $" + ListaSobremesa[i].getPrecio() + " / Slogan: " + ListaSobremesa[i].getSlogan() + " / Torre: " + ListaSobremesa[i].getTorre() + " / Cant: " + ListaSobremesa[i].getCant());

                        break;
                
                    
                    default:
                        break;
                }
                return;
            }
            i++;
        }
        System.out.println("No se ha encontrado el producto. ");
    }
}

class Portatil{
    private int Codigo;
    private double Precio;
    private double Peso;
    private int Cant;

    //Constructor
    public Portatil(int Codigo, double Precio, double Peso, int Cant){
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Peso = Peso;
        this.Cant = Cant;
    }

    // Get y Set
    public String getSlogan(){
        return "Ideal para sus viajes.";
    }


    public int getCodigo(){
        return Codigo;
    }
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }


    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }


    public double getPeso(){
        return Peso;
    }
    public void setPeso(double Peso){
        this.Peso = Peso;
    }


    public int getCant(){
        return Cant;
    }
    public void setCant(int Cant){
        this.Cant = Cant;
    }
    //Metodos especiales

    public void Vender(){
        if(Cant >= 1){
            Cant--;
            System.out.println("Se ha descontado del stock. ");
        }
        else {
            System.out.println("No queda stock disponible. ");
        }
    }
}

class Sobremesa{
    private int Codigo;
    private double Precio;
    private String Torre;
    private int Cant;

    //Constructor
    public Sobremesa(int Codigo, double Precio, String Torre, int Cant){
        this.Codigo = Codigo;
        this.Precio = Precio;
        this.Torre = Torre;
        this.Cant = Cant;
    }

    // Get y Set
    public String getSlogan(){
        return "El que mas pesa, pero el que menos cuesta.";
    }


    public int getCodigo(){
        return Codigo;
    }
    public void setCodigo(int Codigo){
        this.Codigo = Codigo;
    }


    public double getPrecio(){
        return Precio;
    }
    public void setPrecio(double Precio){
        this.Precio = Precio;
    }


    public String getTorre(){
        return Torre;
    }
    public void setTorre(String Torre){
        this.Torre = Torre;
    }


    public int getCant(){
        return Cant;
    }
    public void setCant(int Cant){
        this.Cant = Cant;
    }
    //Metodos especiales

    public void Vender(){
        if(Cant >= 1){
            Cant--;
            System.out.println("Se ha descontado del stock. ");
        }
        else {
            System.out.println("No queda stock disponible. ");
        }
    }
}