package edu.unisabana.pizzafactory.model;

/**
 * Interfaz para PizzaFactory
 */
public interface PizzaFactory {

    Amasador crearAmasador();

    Horneador crearHorneador();

    Moldeador crearMoldeador();
}