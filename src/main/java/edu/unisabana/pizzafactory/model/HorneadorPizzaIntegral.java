package edu.unisabana.pizzafactory.model;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cesarvefe
 */
public class HorneadorPizzaIntegral extends Horneador {

    public void hornear() {
        Logger.getLogger(HorneadorPizzaIntegral.class.getName())
            .log(Level.INFO, "[~~] Horneando la pizza integral con masa integral.");

        //CODIGO DE LLAMADO AL MICROCONTROLADOR
    }

}