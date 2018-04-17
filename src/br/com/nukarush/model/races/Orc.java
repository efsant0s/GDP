/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.races;

/**
 *
 * @author efsantos
 */
public class Orc extends DefaultRace {

    public Orc(Integer hp, Integer mp, Integer st, Integer forca, Integer desarmado, Integer resistenciaFi, 
            Integer resistenciaMa, Integer espadasUmaMao, Integer espadasDuasMaos, Integer defesaFisica, 
            Integer defesaMagica, Integer carisma, Integer inteligencia, Integer agilidade) {
        
        super(hp, mp, st, forca, desarmado, resistenciaFi, 
                resistenciaMa, espadasUmaMao, espadasDuasMaos, defesaFisica, defesaMagica, carisma, inteligencia, agilidade);
    }

    public Orc(Integer hp, Integer mp, Integer st, Integer forca, Integer carisma, Integer inteligencia, Integer agilidade) {
        super(hp, mp, st, forca, carisma, inteligencia, agilidade);
    }

}
