import com.coderhouse.modell.Persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TestPersona {

    public static void main(String[] args) {
        Persona sebas = new Persona("Sebastian","Bernasconi");

        Persona juan = new Persona("Juan","Bernasconi");

        Persona lucas = new Persona("Lucas","Bernasconi");

        Persona betty = new Persona("Bettina","Auguliaro");

        Persona oliver = new Persona("Oliver","Bernasconi");

        List<Persona> personas = new ArrayList<Persona>();

        personas.add(sebas);
        personas.add(juan);
        personas.add(lucas);
        personas.add(betty);
        personas.add(oliver);
    }
}
