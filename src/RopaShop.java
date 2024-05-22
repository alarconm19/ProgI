import java.util.Scanner;

public class RopaShop {
    static int contPrendas = 5;
    static String[] inventario = {"remera gris", "pantalon negro", "bermuda azul", "remera negra", "campera celeste"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Agregar prenda - 1 // Buscar prenda - 2 // Vender prenda - 3 // Mostrar inventario - 4. ");
        int eleccion = sc.nextInt();

        String prenda;
        switch (eleccion) {
            case 1:
                System.out.println("Ingrese la prenda a agregar: ");
                sc.nextLine();
                prenda = sc.nextLine();
                agregarPrenda(prenda);
                break;
        
            case 2: 
                System.out.println("Ingrese la prenda a buscar: ");
                sc.nextLine();
                prenda = sc.nextLine();
                prenda ="remera gris";
                buscarPrenda(prenda);
                break;
            
            case 3: 
                System.out.println("Ingrese la prenda a vender: ");
                sc.nextLine();
                prenda = sc.nextLine();
                venderPrenda(prenda);
                break;

            case 4:
                mostrarInventario();
                break;

            default:
                break;
        }

        sc.close();
    }

    static void agregarPrenda(String prenda){
        contPrendas++;
        String[] temp = new String[contPrendas];

        for(int i = 0; i < contPrendas - 1; i++){
            temp[i] = inventario[i];
        }

        temp[contPrendas - 1] = prenda;
        inventario = temp;
        for(int i = 0; i < contPrendas; i++){
            System.out.println("Prenda: " + inventario[i]);
        } 
        
    }

    static void buscarPrenda(String prenda){
        for(int i = 0; i < contPrendas; i++){
            if(inventario[i].equals(prenda)) {
                System.out.println("prenda existente");
                return;
            }
        }
        System.out.println("no existe");
    }

    static void venderPrenda(String prenda){
        for(int i = 0; i < contPrendas; i++){
            if(inventario[i].equals(prenda)){
                contPrendas--;
                String[] temp = new String[contPrendas];
                
                int contt = 0;
                for(i = 0; i < contPrendas + 1; i++){
                    if(!inventario[i].equals(prenda)){
                        temp[contt++] = inventario[i];
                    }
                }
                System.out.println("prenda vendida");
                inventario = temp;
                return;
            }
            
        }
        System.out.println("no existe la prenda");
    }

    static void mostrarInventario(){
        System.out.println(contPrendas);
        for(int i = 0; i < contPrendas; i++){
            System.out.println("Prenda: " + inventario[i]);
        }
        System.out.println("Cantidad de prendas: " + contPrendas);
    }
}