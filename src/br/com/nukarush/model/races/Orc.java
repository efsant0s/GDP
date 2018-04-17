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
    private boolean NPC;
  
    
    public boolean isNPC() {
        return NPC;
    }

    public void setNPC(boolean NPC) {
        this.NPC = NPC;
    }
    
    
    public Orc(int levelPersonagemPrincipal) {
        this.NPC =  true;
        
    }

    public Orc(String nome, Integer desarmado, Integer resistenciaFi, Integer resistenciaMa, Integer espadasUmaMao, Integer espadasDuasMaos, Integer defesaFisica, Integer defesaMagica) {
        super(nome, desarmado, resistenciaFi, resistenciaMa, espadasUmaMao, espadasDuasMaos, defesaFisica, defesaMagica);
    }


    public Orc(Integer hp, Integer mp, Integer st, Integer forca, Integer carisma, Integer inteligencia, Integer agilidade) {
        super(hp, mp, st, forca, carisma, inteligencia, agilidade);
    }

}
