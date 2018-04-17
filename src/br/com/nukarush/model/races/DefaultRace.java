/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.races;

import br.com.nukarush.model.LA.LifeAtributtes;

/**
 *
 * @author efsantos
 */
public class DefaultRace extends LifeAtributtes {

    //
    private String nome;
    private Integer desarmado = 10;
    private Integer resistenciaFi = 25; //MAX 100
    private Integer resistenciaMa = 25; //MAX 100
    private Integer espadasUmaMao = 25;
    private Integer espadasDuasMaos = 25;
    private Integer defesaFisica = 25;
    private Integer defesaMagica = 25;

    public DefaultRace() {
        super(100, 50, 100, 6, 6, 6, 6);
    }

    public DefaultRace(Integer hp, Integer mp, Integer st, Integer forca, Integer carisma, Integer inteligencia, Integer agilidade) {
        super(hp, mp, st, forca, carisma, inteligencia, agilidade);
    }

    public DefaultRace(String nome,
            Integer desarmado,
            Integer resistenciaFi,
            Integer resistenciaMa,
            Integer espadasUmaMao,
            Integer espadasDuasMaos,
            Integer defesaFisica,
            Integer defesaMagica) {

        super(100, 50, 100, 6, 6, 6, 6);
        this.nome = nome;
        this.desarmado = desarmado;
        this.resistenciaFi = resistenciaFi;
        this.resistenciaMa = resistenciaMa;
        this.espadasUmaMao = espadasUmaMao;
        this.espadasDuasMaos = espadasDuasMaos;
        this.defesaFisica = defesaFisica;
        this.defesaMagica = defesaMagica;
    }

}
