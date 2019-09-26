
package modelos;

import java.util.ArrayList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestListar {
    @Test
    public void testListar() {
        System.out.println("Listar");
        ColeccionDatos instance = new ColeccionDatos();
        ArrayList<Dato> expResult = new ArrayList<Dato>();
        ArrayList<Dato> result = instance.Listar();
        assertEquals(expResult, result);
    }
}
