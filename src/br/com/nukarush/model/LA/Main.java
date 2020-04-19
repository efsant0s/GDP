/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.LA;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Eduardo
 */
public class Main {

    public static void main(String[] args) {
        printCharactersWithDelays("ESTOU TENTANDO FAZER ISSO FUNCIONAR ", TimeUnit.NANOSECONDS, 25000000);
    }

    public static void printCharactersWithDelays(String sample, TimeUnit unit, long delay) {
        List<Character> chars = sample.chars().mapToObj(e -> (char) e).collect(Collectors.toList());
        chars.forEach(character -> {
            System.out.print(character);
            try {
                unit.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    }
}
