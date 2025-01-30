package com.retotecnico;

import com.retotecnico.config.ConfigAplicacion;
import com.retotecnico.servicio.AnimalServicio;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigAplicacion.class);

        AnimalServicio animalServicio = context.getBean(AnimalServicio.class);

        List<String> animales = Arrays.asList(
                "Perro|TERRESTRE|Guau",
                "Águila|VOLADOR|Chillido",
                "Delfín|ACUATICO|Chirrido",
                "Gato|TERRESTRE|Miau",
                "Murciélago|VOLADOR|Chirrido",
                "Pez|ACUATICO|Burbujas",
                "Elefante|TERRESTRE|Barrito",
                "Halcón|VOLADOR|Grito",
                "Ballena|ACUATICO|Canto",
                "Conejo|TERRESTRE|Rebuzno",
                "Loro|VOLADOR|Habla",
                "Tiburón|ACUATICO|Gruñido",
                "Caballo|TERRESTRE|Relincho",
                "Mariposa|VOLADOR|Silencio",
                "Cangrejo|ACUATICO|Pinza");

        animalServicio.procesarAnimales(animales);
    }
}
