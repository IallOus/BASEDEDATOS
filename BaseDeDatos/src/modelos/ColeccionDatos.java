
package modelos;

import java.util.ArrayList;

public class ColeccionDatos {
    private ArrayList<Dato> datos;
    
    public ColeccionDatos(){
        this.datos = new ArrayList<>();
    }
    
    public ArrayList<Dato> Listar(){
        return this.datos;
    }
    
    public boolean Agregar(Dato dato){
        return this.datos.add(dato);
    }
    
    public boolean Modificar(Dato dato){
        for(int i = 0; i < datos.size(); i++) {
            if (datos.get(i).getId().equals(dato.getId())) 
            {
                datos.get(i).setId((dato.getId()));
                datos.get(i).setData((dato.getData()));
                return true;
            }
        }
        return false;
    }
    
    public boolean Eliminar(Dato dato){
        for (int i = 0; i < datos.size(); i++) {
            datos.remove(i);
            return true;
        }
        return false;
    }
    
    
}
