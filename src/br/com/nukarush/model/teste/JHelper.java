/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.model.teste;

import br.com.nukarush.model.SaveFile;
import br.com.nukarush.model.Tipo_entidade;
import com.google.gson.Gson;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

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

    public static Object saveToJson(SaveFile save) {
        return tool.fromJson(save.getJson(), save.getClasse());
    }

    public static void salvarArquivos(String arq, List<SaveFile> save) {

        try {
            criarPastaSeNaoExistir();
            File f = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\GDP\\" + arq);

            if (!f.exists()) {
                f.createNewFile();
            }

            FileOutputStream fos = new FileOutputStream(f);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(save);

            oos.close();
            fos.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro I/O!");
        }
    }

    private static boolean criarPastaSeNaoExistir() {
        File f = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\GDP");
        if (!f.exists()) {
            return f.mkdir();
        }
        return true;
    }

    public static List<SaveFile> lerArquivos(String arq) {
        try {
            criarPastaSeNaoExistir();
            File f = new File("C:\\Users\\" + System.getProperty("user.name") + "\\Documents\\GDP\\" + arq);

            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);

            List<SaveFile> saveFile = (List<SaveFile>) ois.readObject();

            System.out.println(saveFile);

            ois.close();
            fis.close();
            return saveFile;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        } catch (IOException e) {
            System.out.println("Erro I/O!");
        } catch (ClassNotFoundException e) {
            System.out.println("Classe Registro não encontrada!");
        }
        return null;
    }

}
