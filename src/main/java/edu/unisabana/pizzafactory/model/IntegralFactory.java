package edu.unisabana.pizzafactory.model;

/**
 * Factory para pizza integral
 */
public class IntegralFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaIntegral();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaIntegral();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaIntegral();
    }
}