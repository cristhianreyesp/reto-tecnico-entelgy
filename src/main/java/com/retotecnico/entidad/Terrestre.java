package com.retotecnico.entidad;

import com.retotecnico.modelo.Animal;

public class Terrestre extends Animal {

    public Terrestre(String nombre, String sonido) {
        super(nombre, sonido);
    }

    @Override
    public String getType() {
        return "TERRESTRE";
    }
}
