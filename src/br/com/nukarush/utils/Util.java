/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.utils;

/**
 *
 * @author Celina
 */
public class Util {
    public static String nvl(String valor, String valorPadrao){
        return valor == null || valor.isEmpty() ? valorPadrao : valor;
    }
}
