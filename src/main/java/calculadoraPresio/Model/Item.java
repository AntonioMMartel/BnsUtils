package calculadoraPresio.Model;

/**
 * @author Antonio Miguel Martel
 */
public class Item {
    
    private int id;
    private Precio precio;
    private String nombre;

    public Item(int id, Precio precio, String nombre) {
        this.id = id;
        this.precio = precio;
        this.nombre = nombre;
    }

    public Precio getPrecio() {
        return precio;
    }

    public void setPrecio(Precio precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
