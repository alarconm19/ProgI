import java.util.Random;

class Nodo {
    int dato;
    Nodo siguiente;

    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}

public class Listas {
    public static void main(String[] args) {
        // Creación y carga de elementos en la lista 1
        Nodo lista1 = generarListaAleatoria(5);
        System.out.println("Lista 1:");
        imprimirLista(lista1);

        // Creación y carga de elementos en la lista 2
        Nodo lista2 = generarListaAleatoria(6);
        System.out.println("Lista 2:");
        imprimirLista(lista2);

        // Unir las listas 1 y 2 en una tercera lista
        Nodo listaUnida = unirListas(lista1, lista2);
        System.out.println("Lista Unida:");
        imprimirLista(listaUnida);
    }

    static Nodo generarListaAleatoria(int longitud) {
        Random rand = new Random();
        Nodo cabeza = null;
        Nodo actual = null;

        for (int i = 0; i < longitud; i++) {
            int dato = rand.nextInt(100); // Generar un número aleatorio entre 0 y 99
            Nodo nuevoNodo = new Nodo(dato);

            if (cabeza == null) {
                cabeza = nuevoNodo;
                actual = nuevoNodo;
            } else {
                actual.siguiente = nuevoNodo;
                actual = actual.siguiente;
            }
        }

        return cabeza;
    }

    static void imprimirLista(Nodo cabeza) {
        Nodo temp = cabeza;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }

    static Nodo unirListas(Nodo lista1, Nodo lista2) {
        if (lista1 == null) {
            return lista2;
        }
        if (lista2 == null) {
            return lista1;
        }

        Nodo cabeza = lista1;
        while (lista1.siguiente != null) {
            lista1 = lista1.siguiente;
        }
        lista1.siguiente = lista2;

        return cabeza;
    }
}
