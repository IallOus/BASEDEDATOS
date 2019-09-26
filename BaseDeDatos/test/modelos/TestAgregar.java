
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestAgregar {
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Dato dato = new Dato("01", "data01");
        ColeccionDatos instance = new ColeccionDatos();
        boolean expResult = true;
        boolean result = instance.Agregar(dato);
        assertEquals(expResult, result);
    }
}
