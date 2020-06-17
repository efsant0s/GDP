/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.teste;

import br.com.nukarush.model.SaveFile;
import br.com.nukarush.model.Tipo_entidade;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class SalvarJson {

    public static void main(String[] args) {
    }

 

  
    private static Tipo_entidade createEntidade() {
        Tipo_entidade human = new Tipo_entidade();
        human.setNm_entidade("Humano");
        human.setNr_hp_base(10);
        human.setNr_hp_per_lvl(10);
        human.setNr_mp_base(5);
        human.setNr_mp_per_lvl(2);

        return human;
    }

}
