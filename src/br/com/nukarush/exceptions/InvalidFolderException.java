/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.exceptions;

import java.io.IOException;

/**
 *
 * @author Celina
 */
public class InvalidFolderException extends IOException{

    public InvalidFolderException(String message) {
        super(message);
    }
    
}
