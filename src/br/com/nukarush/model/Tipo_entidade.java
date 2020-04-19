/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model;

/**
 *
 * @author Eduardo
 */
public class Tipo_entidade {
    private String nm_entidade;
    private int nr_hp_base;
    private int nr_mp_base;
    private int nr_hp_per_lvl;
    private int nr_mp_per_lvl; 
    private String ds_lore;
    
    public String getNm_entidade() {
        return nm_entidade;
    }

    public void setNm_entidade(String nm_entidade) {
        this.nm_entidade = nm_entidade;
    }

    public int getNr_hp_base() {
        return nr_hp_base;
    }

    public void setNr_hp_base(int nr_hp_base) {
        this.nr_hp_base = nr_hp_base;
    }

    public int getNr_mp_base() {
        return nr_mp_base;
    }

    public void setNr_mp_base(int nr_mp_base) {
        this.nr_mp_base = nr_mp_base;
    }

    public int getNr_hp_per_lvl() {
        return nr_hp_per_lvl;
    }

    public void setNr_hp_per_lvl(int nr_hp_per_lvl) {
        this.nr_hp_per_lvl = nr_hp_per_lvl;
    }

    public int getNr_mp_per_lvl() {
        return nr_mp_per_lvl;
    }

    public void setNr_mp_per_lvl(int nr_mp_per_lvl) {
        this.nr_mp_per_lvl = nr_mp_per_lvl;
    }

    public String getDs_lore() {
        return ds_lore;
    }

    public void setDs_lore(String ds_lore) {
        this.ds_lore = ds_lore;
    }

    @Override
    public String toString() {
        return "Tipo_entidade{" + "nm_entidade=" + nm_entidade + ", nr_hp_base=" + nr_hp_base + ", nr_mp_base=" + nr_mp_base + ", nr_hp_per_lvl=" + nr_hp_per_lvl + ", nr_mp_per_lvl=" + nr_mp_per_lvl + ", ds_lore=" + ds_lore + '}';
    }
    
}
