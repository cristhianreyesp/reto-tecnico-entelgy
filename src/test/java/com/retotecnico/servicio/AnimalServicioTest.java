package com.retotecnico.servicio;

import com.retotecnico.entidad.Acuatico;
import com.retotecnico.entidad.Terrestre;
import com.retotecnico.entidad.Volador;
import com.retotecnico.modelo.Animal;
import com.retotecnico.modelo.TipoAnimal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AnimalServicioTest {

    private final AnimalServicio animalServicio = new AnimalServicio();

    @Test
    public void testCrearAnimalTerrestre() {
        Animal animal = animalServicio.crearAnimal("Perro|TERRESTRE|Guau");
        assertTrue(animal instanceof Terrestre, "El animal debe ser de tipo Terrestre");
        assertEquals("Perro", animal.nombre, "El nombre del animal no es correcto");
        assertEquals("Guau", animal.sonido, "El sonido del animal no es correcto");
    }

    @Test
    public void testCrearAnimalAcuatico() {
        Animal animal = animalServicio.crearAnimal("Pato|ACUATICO|Cuac");
        assertTrue(animal instanceof Acuatico, "El animal debe ser de tipo Acuatico");
        assertEquals("Pato", animal.nombre, "El nombre del animal no es correcto");
        assertEquals("Cuac", animal.sonido, "El sonido del animal no es correcto");
    }

    @Test
    public void testCrearAnimalVolador() {
        Animal animal = animalServicio.crearAnimal("Halcón|VOLADOR|Grito");
        assertTrue(animal instanceof Volador, "El animal debe ser de tipo Volador");
        assertEquals("Halcón", animal.nombre, "El nombre del animal no es correcto");
        assertEquals("Grito", animal.sonido, "El sonido del animal no es correcto");
    }

    @Test
    public void testEntradaTipoAnimalInvalido() {
        assertThrows(IllegalArgumentException.class, () -> {
            animalServicio.crearAnimal("Perro|INDEFINIDO|Guau");
        });
    }
}
