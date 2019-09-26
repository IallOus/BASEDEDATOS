
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestModificar {
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
}
