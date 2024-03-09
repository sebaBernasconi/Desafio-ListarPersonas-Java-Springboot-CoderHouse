import com.coderhouse.modell.Persona;

import java.util.*;

public class TestPersona {

    public static void ordenarPorApellido(List<Persona> l){
        Collections.sort(l,new Comparator<Persona>(){

            @Override
            public int compare(Persona pUno, Persona pDos) {
                return pUno.getApellido().compareTo(pDos.getApellido());
            }

        });
        mostrarPersonasPorApellido(l);
    }

    public static void mostrarPersonasPorNombre(List<Persona> l){
        System.out.println("Nombre  |   Apellido");
        System.out.println("--------------------");
        for (Persona p :
                l) {
            System.out.println( p.getNombre() + "        " + p.getApellido());
        }
        System.out.println();
    }

    public static void mostrarPersonasPorApellido(List<Persona> l){
        System.out.println("Apellido  |   Nombre");
        System.out.println("--------------------");
        for (Persona p :
                l) {
            System.out.println(p.getApellido() + "      " + p.getNombre());
        }
        System.out.println();
    }


    public static void main(String[] args) {

        //Creando varias instancias de Persona
        Persona sebas = new Persona("Sebastian","Bernasconi");

        Persona juan = new Persona("Juan","Alvarez");

        Persona lucas = new Persona("Lucas","Quiroga");

        Persona betty = new Persona("Bettina","Auguliaro");

        Persona oliver = new Persona("Oliver","Bernasconi");

        //Creando la lista y llenandola
        List<Persona> listadoDePersonas = new ArrayList<>();

        listadoDePersonas.add(sebas);
        listadoDePersonas.add(juan);
        listadoDePersonas.add(lucas);
        listadoDePersonas.add(betty);
        listadoDePersonas.add(oliver);

        //Ordenando la lista alfabeticamente
        //Aca usa el CompareTo que hay en la clase persona que es implementado de la interfaz
        Collections.sort(listadoDePersonas);
        System.out.println("Lista ordenada alfabeticamente por el atributo nombre");
        mostrarPersonasPorNombre(listadoDePersonas);

        //Ordenando la lista alfabeticamente por atributo apellido
        //Aca usa el Compare que hay en el metodo que sirve para comparar apellidos
        System.out.println("Lista ordenada alfabeticamente por el atributo apellido");
        ordenarPorApellido(listadoDePersonas);

        //Ordenando la lista alfabeticamente al reves por atributo apellido
        //Como el ultimo cambio que sufrio la lista fue ser ordenada por apellido
        //No hizo falta crear un metodo nuevo. Simplemente con el .reverse queda el ordenamiento que se busca
        System.out.println("Lista ordenada alfabeticamente al reves por el atributo apellido");
        Collections.reverse(listadoDePersonas);
        mostrarPersonasPorApellido(listadoDePersonas);



    }
}
