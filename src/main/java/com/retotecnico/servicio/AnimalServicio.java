package com.retotecnico.servicio;

import com.retotecnico.entidad.Acuatico;
import com.retotecnico.entidad.Terrestre;
import com.retotecnico.entidad.Volador;
import com.retotecnico.modelo.Animal;
import com.retotecnico.modelo.TipoAnimal;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnimalServicio {

    public void procesarAnimales(List<String> arguments) {

        List<Animal> animal = arguments.stream()
                .map(this::crearAnimal)
                .toList();

        Map<String, List<Animal>> groupedByType = animal.stream()
                .collect(Collectors.groupingBy(Animal::getType));

        groupedByType.forEach((type, list) -> {
            System.out.println("***Animales de tipo " + type + ":****");
            list.forEach(Animal::produceSonido);
            System.out.println();
        });
    }

    public Animal crearAnimal(String input) {
        String[] parts = input.split("\\|");
        String name = parts[0];
        String type = parts[1];
        String sound = parts[2];

        return switch (TipoAnimal.valueOf(type)) {
            case TERRESTRE -> new Terrestre(name, sound);
            case ACUATICO -> new Acuatico(name, sound);
            case VOLADOR -> new Volador(name, sound);
        };
    }
}
