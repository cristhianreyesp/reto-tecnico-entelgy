package com.retotecnico.entidad;

import com.retotecnico.modelo.Animal;

public class Acuatico extends Animal {
    public Acuatico(String nombre, String sonido) {
        super(nombre, sonido);
    }

    @Override
    public String getType() {
        return "ACUATICO";
    }
}
