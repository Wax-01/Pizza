package edu.unisabana.pizzafactory.model;

/**
 * Factory general que crea las factories específicas
 */
public class PizzaFactoryGeneral {

    public static PizzaFactory crearFactory(TipoPizza tipo) {
        switch (tipo) {
            case DELGADA:
                return new DelgadaFactory();
            case GRUESA:
                return new GruesaFactory();
            case INTEGRAL:
                return new IntegralFactory();
            default:
                throw new IllegalArgumentException("Tipo de pizza no soportado: " + tipo);
        }
    }
}