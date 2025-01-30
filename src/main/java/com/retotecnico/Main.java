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
                "Murciélago|VOLADOR|Chirrido",
                "Pato|ACUATICO|Cuac",
                "Gato|TERRESTRE|Miau",
                "Halcón|VOLADOR|Grito",
                "Ganso|ACUATICO|Graznido",
                "Vaca|TERRESTRE|Mugido",
                "Loro|VOLADOR|Habla",
                "Ballena|ACUATICO|Canto",
                "Cerdo|TERRESTRE|Oink",
                "Paloma|VOLADOR|Arrullo",
                "Cangrejo|ACUATICO|Pinza",
                "Oveja|TERRESTRE|Beee",
                "Gaviota|VOLADOR|Chillido",
                "Delfín|ACUATICO|Chirrido",
                "Cabra|TERRESTRE|Beee",
                "Cuervo|VOLADOR|Croar",
                "Tiburón|ACUATICO|Gruñido",
                "Burro|TERRESTRE|Rebuzno",
                "Golondrina|VOLADOR|Trino",
                "Carpa|ACUATICO|Chapoteo");

        animalServicio.procesarAnimales(animales);
    }
}
