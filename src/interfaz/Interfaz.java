package interfaz;
import dominio.*;
import java.io.*;
import java.util.Scanner;

public class Interfaz {
    private Catalogo catalogo;
    private Scanner scanner;

    public Interfaz() {
        this.catalogo = new Catalogo();
        this.scanner = new Scanner(System.in);
        Catalogo c = Catalogo.leer();
    }

    public void menu() {
        int opc;
        do {
            System.out.println("1. Añadir Ordenador\n2. Lista de Ordenadores\n3. Salir\nSelecciona un número de operación: ");
            opc = scanner.nextInt();
            scanner.nextLine(); //Limpiar
            switch (opc) {
                case 1:
                    annadir();
                    break;
                case 2:
                    catalogo.mostrarCatalogo();
                    break;
                case 3:
                    System.out.println("Saliendo del programa");
                    Catalogo.grabar(catalogo);
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opc != 3);
    }

    public void annadir(){
        System.out.println("Introduce la marca: ");
        String marca = scanner.nextLine();
        System.out.println("Marca introducida: " + marca);

        System.out.println("Introduce la cpu: ");
        String cpu = scanner.nextLine();
        System.out.println("cpu introducida: " + cpu);

        System.out.println("Introduce la gpu: ");
        String gpu = scanner.nextLine();
        System.out.println("gpu introducida: " + gpu);

        System.out.println("Introduce la ram (GB): ");
        int ram = scanner.nextInt();
        System.out.println("ram introducida: " + ram);

        Ordenador newordenador = new Ordenador(marca, cpu, gpu, ram);
        catalogo.annadirOrdenador(newordenador);
    }
}