package edu.unisabana.pizzafactory.model;

/**
 * Factory para pizza gruesa
 */
public class GruesaFactory implements PizzaFactory {

    @Override
    public Amasador crearAmasador() {
        return new AmasadorPizzaGruesa();
    }

    @Override
    public Horneador crearHorneador() {
        return new HorneadorPizzaGruesa();
    }

    @Override
    public Moldeador crearMoldeador() {
        return new MoldeadorPizzaGruesa();
    }
}