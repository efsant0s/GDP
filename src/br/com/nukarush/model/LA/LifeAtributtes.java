/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.LA;

/**
 *
 * @author efsantos
 */
//Life atributes
public class LifeAtributtes {
    private Integer hp; //MAX 500
    private Integer mp; //MAX 500
    private Integer st; //MAX 500
    private Integer forca; //MAX 10
    private Integer carisma; //MAX 10
    private Integer inteligencia; //MAX 10 
    private Integer agilidade;

    public LifeAtributtes() {
    }

    public LifeAtributtes(Integer hp, Integer mp, Integer st, Integer forca, Integer carisma, Integer inteligencia, Integer agilidade) {
        this.hp = hp;
        this.mp = mp;
        this.st = st;
        this.forca = forca;
        this.carisma = carisma;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getMp() {
        return mp;
    }

    public void setMp(Integer mp) {
        this.mp = mp;
    }

    public Integer getSt() {
        return st;
    }

    public void setSt(Integer st) {
        this.st = st;
    }

    public Integer getForca() {
        return forca;
    }

    public void setForca(Integer forca) {
        this.forca = forca;
    }

    public Integer getCarisma() {
        return carisma;
    }

    public void setCarisma(Integer carisma) {
        this.carisma = carisma;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(Integer inteligencia) {
        this.inteligencia = inteligencia;
    }

    public Integer getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(Integer agilidade) {
        this.agilidade = agilidade;
    }
    
    
}
