package com.retotecnico.entidad;

import com.retotecnico.modelo.Animal;

public class Volador extends Animal {

    public Volador(String nombre, String sonido) {
        super(nombre, sonido);
    }

    @Override
    public String getType() {
        return "VOLADOR";
    }
}