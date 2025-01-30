package com.retotecnico.modelo;

public abstract class Animal {

    protected String nombre;
    protected String sonido;

    public Animal(String nombre, String sonido) {
        this.nombre = nombre;
        this.sonido = sonido;
    }

    public abstract String getType();

    public void produceSonido() {
        System.out.println(nombre + " hace: " + sonido);
    }
}
