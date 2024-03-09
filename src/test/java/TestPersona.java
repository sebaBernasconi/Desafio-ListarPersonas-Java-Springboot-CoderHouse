import com.coderhouse.modell.Persona;

import java.util.*;

public class TestPersona {

    public static void main(String[] args) {
        Persona sebas = new Persona("Sebastian","Bernasconi");

        Persona juan = new Persona("Juan","Bernasconi");

        Persona lucas = new Persona("Lucas","Bernasconi");

        Persona betty = new Persona("Bettina","Auguliaro");

        Persona oliver = new Persona("Oliver","Bernasconi");

        List<Persona> listadoDePersonas = new ArrayList<Persona>();

        listadoDePersonas.add(sebas);
        listadoDePersonas.add(juan);
        listadoDePersonas.add(lucas);
        listadoDePersonas.add(betty);
        listadoDePersonas.add(oliver);

        Collections.sort(listadoDePersonas, new Comparator<Persona>() {
            @Override
            public int compare(Persona o1, Persona o2) {
                return new String()o1.getNombre().compareTo(new String(o2.getNombre()));
            }
        });

        System.out.println("Lista ordenada alfbeticamente");

        for (Object p :
                listadoDePersonas) {
            System.out.println(p.toString());
        }
    }
}
