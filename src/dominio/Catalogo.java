package dominio;
import interfaz.Interfaz;

import java.io.*;
import java.util.ArrayList;
import java.io.Serializable;

public class Catalogo implements Serializable{
    private ArrayList<Ordenador> catalogo;

    public Catalogo() {
        this.catalogo = new ArrayList<>();
    }

    public void annadirOrdenador(Ordenador ordenador) {
        catalogo.add(ordenador);
        System.out.println("Ordenador añadido al catalogo: "+ ordenador);
    }

    public void mostrarCatalogo() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
        } else {
            System.out.println("Catálogo de Ordenadores:");
            for (Ordenador ordenador : catalogo) {
                ordenador.mostrarInfo();
            }
        }
    }
    public static void grabar(Catalogo catalogo){
        try{
            ObjectOutputStream fo=new ObjectOutputStream (new FileOutputStream("catalogo.ser"));
            fo.writeObject(catalogo);
            fo.close();
        } catch (Exception e){
            System.out.println("error de escritura");
        }
    }
    public static Catalogo leer(){
        try{
            ObjectInputStream fi=new ObjectInputStream(new FileInputStream("catalogo.ser"));
            Catalogo c= (Catalogo) fi.readObject();
            fi.close();
            return c;
        } catch (Exception e){
            return new Catalogo();
        }
    }
}