package desafio_entregable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prueba {
    public static void main(String[] args) {

        // Definir una lista y crear un arraylist
        List<Persona> nomina = new ArrayList<>();

        // Crear y agregar individuos a la nomina
        Persona individuo1 = new Persona("Cruz", "Maxi");
        nomina.add(individuo1);
        Persona individuo2 = new Persona("Tutti", "Francesco");
        nomina.add(individuo2);
        Persona individuo3 = new Persona("Formosa", "Ivana");
        nomina.add(individuo3);
        Persona individuo4 = new Persona("Yanki", "Danielle");
        nomina.add(individuo4);
        Persona individuo5 = new Persona("Dolores", "Soledad");
        nomina.add(individuo5);

        // Ordenar la lista alfabéticamente por nombre
        Collections.sort(nomina, (nombre1, nombre2) -> nombre1.getNombre().compareTo(nombre2.getNombre()));

        // Imprimir la lista ordenada por nombres
        for (Persona persona : nomina) {
            System.out.println(persona.getNombre() + ", " + persona.getApellido());
        }
        System.out.println();

        // Ordenar la lista alfabéticamente por apellido
        Collections.sort(nomina, (apellido1, apellido2) -> apellido1.getApellido().compareTo(apellido2.getApellido()));

        // Imprimir la lista ordenada por apellidos
        for (Persona persona : nomina) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
        System.out.println();

        // Ordenar la lista alfabéticamente inversa por apellido
        Collections.reverse(nomina);

        // Imprimir la lista ordenada por apellidos inversamente
        for (Persona persona : nomina) {
            System.out.println(persona.getApellido() + ", " + persona.getNombre());
        }
    }
}
