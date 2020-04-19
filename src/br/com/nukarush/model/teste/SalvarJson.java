/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.teste;

import br.com.nukarush.model.Tipo_entidade;
import com.google.gson.Gson;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Eduardo
 */
public class SalvarJson {

    public static void main(String[] args) {

        String json = JHelper.toJson(createEntidade());
        System.out.println(json);
        Tipo_entidade t =  (Tipo_entidade) JHelper.fromJson(json, Tipo_entidade.class);
        System.out.println(t);
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
