/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.nukarush.testes;

import br.com.nukarush.model.SaveFile;
import br.com.nukarush.model.Entidade;
import br.com.nukarush.model.teste.JHelper;
import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Celina
 */
public class JHelperTest {

    public JHelperTest() {
    }
    
    @Test
    public void TesteSalvarLerEntidade() {
        SaveFile saveIn = new SaveFile();
        Entidade entidadeSalvar = createEntidade();
        saveIn.setJson(JHelper.toJson(entidadeSalvar));
        saveIn.setClasse(Entidade.class);
        System.out.println(saveIn);
        List<SaveFile> saves = new ArrayList();
        saves.add(saveIn);
        JHelper.salvarArquivos("Save01.dat", saves);
        List<SaveFile> saveOut = JHelper.lerArquivos("Save01.dat");
        Entidade entidadeLer = (Entidade) JHelper.saveToJson(saveOut.get(0));
        assertEquals(entidadeSalvar, entidadeLer);
    }

    private static Entidade createEntidade() {
        Entidade human = new Entidade();
        human.setNm_entidade("Humano");
        human.setNr_hp_base(10);
        human.setNr_hp_per_lvl(10);
        human.setNr_mp_base(5);
        human.setNr_mp_per_lvl(2);

        return human;
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
