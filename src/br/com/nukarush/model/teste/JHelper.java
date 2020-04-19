/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.teste;

import br.com.nukarush.model.Tipo_entidade;
import com.google.gson.Gson;

/**
 *
 * @author Eduardo
 */
public class JHelper {

    private static Gson tool = new Gson();

    public static String toJson(Object objeto) {
        return tool.toJson(objeto);
    }

    public static Object fromJson(String json, Class aClass) {
        return tool.fromJson(json, Tipo_entidade.class);
    }
}
