import java.util.ArrayList;
import java.util.Scanner;

class Libro{
    private String Titulo;
    private String Autor;
    private int Publicacion;

    public Libro(String Titulo, String Autor, int Publicacion){
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Publicacion = Publicacion;
    }

    public String getTitulo(){
        return Titulo;
    }

    public void setTitulo(String Titulo){
        this.Titulo = Titulo;
    }

    public String getAutor(){
        return Autor;
    }

    public void setAutor(String Autor){
        this.Autor = Autor;
    }

    public int getPublicacion(){
        return Publicacion;
    }

    public void setPublicacion(int Publicacion){
        this.Publicacion = Publicacion;
    }

    public String TipoLibro(String Libro){
        return "";
    }

    public String toString(){
        return "Titulo: " + Titulo + "| Autor: " + Autor + "| Publicacion: " + Publicacion;
    }
}

class LibroFisico extends Libro {
    private final int Paginas;
    private String Ubicacion;
    private int Copias;

    public LibroFisico(String Titulo, String Autor, int Publicacion, int Paginas, String Ubicacion, int Copias){
        super(Titulo, Autor, Publicacion);
        this.Paginas = Paginas;
        this.Ubicacion = Ubicacion;
        this.Copias = Math.max(Copias, 0);
    }

    public void PrestarLibro(){
        if(Copias > 0)
            Copias--;
        else
            System.out.println("No hay suficientes copias. ");
    }

    @Override
    public String TipoLibro(String Libro){
        return "F";
    }

    @Override
    public String toString(){
        return super.toString() + "| Paginas: " + Paginas + "| Ubicacion: " + Ubicacion + "| Copias: " + Copias;
    }
}

class LibroDigital extends Libro{
    private final String Formato;
    private final int Tamanio_del_archivo;

    public LibroDigital(String Titulo, String Autor, int Publicacion, String Formato, int Tamanio_del_archivo){
        super(Titulo, Autor, Publicacion);
        this.Formato = Formato;
        this.Tamanio_del_archivo = Tamanio_del_archivo;
    }

    @Override
    public String TipoLibro(String Libro){
        return "D";
    }

    @Override
    public String toString(){
        return super.toString() + "| Formato: " + Formato + "| Tamanio del archivo: " + Tamanio_del_archivo;
    }
}

class Biblioteca{
    ArrayList<Libro> Libros;
    
    public Biblioteca(){
        Libros = new ArrayList<Libro>();
    }

    public void agregarLibro(Libro Libro) {
        Libros.add(Libro);
    }

    public void eliminarLibro(String Titulo) {
        for (int i = 0; i < Libros.size(); i++) {
            if (Libros.get(i).getTitulo().equals(Titulo)) {
                Libros.remove(i);
                System.out.println("Libro eliminado.");
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void buscarLibro(String Titulo) {
        for (Libro Libro : Libros) {
            if (Libro.getTitulo().equals(Titulo)) {
                System.out.println(Libro);
            }
        }
    }

    public void listar() {
        for (Libro Libro : Libros) {
            System.out.println(Libro);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        Biblioteca Biblioteca = new Biblioteca();

        while (true) {
            System.out.println("1. Agregar Libro\n2. Borrar Libro\n3. Buscar Libro\n4. Mostrar todos los libros\n5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
            String titulo;

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el titulo: ");
                    titulo = sc.next();

                    System.out.print("Ingrese el autor: ");
                    String autor = sc.next();

                    System.out.print("Ingrese el anio de publicacion: ");
                    int anio = sc.nextInt();

                    System.out.print("Fisico(0) o Digital(1): ");
                    int opcion_formato = sc.nextInt();

                    switch (opcion_formato) {
                        case 0 -> {
                            System.out.print("Ingrese las paginas: ");
                            int paginas = sc.nextInt();

                            System.out.print("Ingrese la ubicacion: ");
                            String ubicacion = sc.next();

                            System.out.print("Ingrese las copias: ");
                            int copias = sc.nextInt();

                            LibroFisico LibroFisico = new LibroFisico(titulo, autor, anio, paginas, ubicacion, copias);
                            Biblioteca.agregarLibro(LibroFisico);
                        }
                        case 1 -> {
                            System.out.print("Ingrese el formato: ");
                            String formato = sc.next();

                            System.out.print("Ingrese el tamanio: ");
                            int tamanio = sc.nextInt();

                            LibroDigital LibroDigital = new LibroDigital(titulo, autor, anio, formato, tamanio);
                            Biblioteca.agregarLibro(LibroDigital);
                        }
                    }
                    break;

                case 2:
                    System.out.println("Ingrese el titulo: ");
                    titulo = sc.next();
                    sc.nextLine();

                    Biblioteca.eliminarLibro(titulo);
                    break;

                case 3:
                    System.out.println("Ingrese el titulo: ");
                    titulo = sc.next();
                    sc.nextLine();

                    Biblioteca.buscarLibro(titulo);

                    System.out.println("Modificar (0) | Prestar (1) | Salir (2)");
                    opcion = sc.nextInt();

                    /*switch (opcion) {
                        case 0 -> {
                            
                        }
                        case 1 -> {

                        }
                        case 2 -> {
                        }
                    }*/

                    break;

                case 4: 
                    Biblioteca.listar();
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Opción inválida. Por favor, intente de nuevo.");
            }
            System.out.println();
        }
    }
}