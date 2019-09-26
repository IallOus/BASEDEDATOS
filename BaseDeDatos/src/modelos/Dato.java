
package modelos;

public class Dato {
    private String id;
    private Object data;

    public Dato() {
    }

    public Dato(String id, Object data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
