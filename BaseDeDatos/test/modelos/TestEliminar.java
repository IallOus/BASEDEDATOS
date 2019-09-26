
package modelos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Test;

public class TestEliminar {
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
