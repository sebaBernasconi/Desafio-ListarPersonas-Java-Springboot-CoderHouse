package com.coderhouse.modell;

public class Persona implements Comparable<Persona>{

    private String nombre;

    private String apellido;

    //Constructor
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Metodos de la intefaz que implementa

    @Override
       public int compareTo(Persona personaDos) {
        return this.nombre.compareTo(personaDos.getNombre());
    }


    //Metodos de la Clase
    public int compareToApellidos(Persona personaDos){
        return this.apellido.compareTo(personaDos.getApellido());
    }


    //Getters y Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
