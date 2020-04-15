
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Felipe Gomes Mendes
 */
public class MatematicaTest {
    
    /*
    public MatematicaTest() {
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
     * Test of soma method, of class Matematica.
     */
    
    @Test
    public void testSoma() {
      InformaIdade teste = new InformaIdade();
        assertEquals(25,teste.checaIdade(2020,1995));
    }
    
    @Test
    public void testbolean() {
      InformaIdade teste = new InformaIdade();
      // se o resultado for verdadeiro aprova
        assertTrue((teste.checaIdade(2020,1995) == 25));
    }
    
    @Test
    public void testboleanfalso() {
      InformaIdade teste = new InformaIdade();
      // seo teste for verdadeiro ele reprova o teste
        assertFalse((teste.checaIdade(2020,1995) == 25));
    }    
}
