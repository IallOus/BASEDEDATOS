
package modelos;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class ColeccionDatosTest {
    
    public ColeccionDatosTest() {
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
     * Test of Listar method, of class ColeccionDatos.
     */
    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionDatos instance = new ColeccionDatos();
        ArrayList<Dato> expResult = new ArrayList<Dato>();
        ArrayList<Dato> result = instance.Listar();
        assertEquals(expResult, result);
    }

    /**
     * Test of Agregar method, of class ColeccionDatos.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Dato dato = new Dato("01", "data01");
        ColeccionDatos instance = new ColeccionDatos();
        boolean expResult = true;
        boolean result = instance.Agregar(dato);
        assertEquals(expResult, result);
    }

    /**
     * Test of Modificar method, of class ColeccionDatos.
     */
    @Test
    public void testModificar() {
        System.out.println("Modificar");
        Dato dato = new Dato("01", "data01");
        ColeccionDatos instance = new ColeccionDatos();
        instance.Agregar(dato);
        boolean expResult = true;
        boolean result = instance.Modificar(dato);
        assertEquals(expResult, result);
    }

    /**
     * Test of Eliminar method, of class ColeccionDatos.
     */
    @Test
    public void testEliminar() {
        System.out.println("Eliminar");
        Dato dato = new Dato("01", "data01");
        ColeccionDatos instance = new ColeccionDatos();
        instance.Agregar(dato);
        boolean expResult = true;
        boolean result = instance.Eliminar(dato);
        assertEquals(expResult, result);
    }
    
}
