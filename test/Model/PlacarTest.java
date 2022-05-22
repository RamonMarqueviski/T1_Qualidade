/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Model;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ramom
 */
public class PlacarTest {
    
    private Placar placar;
    
    public PlacarTest() {
        placar = new Placar("Equipe1", "Equipe2","22:00");
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEquipe1 method, of class Placar.
     */
    @Test
     public void verificaTime1VencedorSet() {
        System.out.println("Verifica se há times vencedores - Placar: 26 - 25 - Set 1");

        int vencedor = placar.VerificaVencedorSet(26, 25,1);
        assertEquals(0,vencedor);
    }
    @Test
     public void verificaTime2VencedorSet() {
        System.out.println("Verifica se time vencedor é o time2- Placar: 25 - 27 - Set 2");
        int vencedor = placar.VerificaVencedorSet(25, 27, 2);
        assertEquals(2,vencedor);
    }
       @Test
     public void verificaTime2VencedorJogo() {
        System.out.println("Verifica se time vencedor é o time1 no Jogo");
        int vencedor = placar.VerificaVencedor(3, 0);
        assertEquals(1,vencedor);
    }
    
}
