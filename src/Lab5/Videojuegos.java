
package Lab5;

public class Videojuegos {
    private String nombre;
    private int Año;
    private int cantidad;
    private float precio;

    public Videojuegos() {
    }

    public Videojuegos(String nombre, int Año, int cantidad, float precio) {
        this.nombre = nombre;
        this.Año = Año;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return Año;
    }

    public void setAño(int Año) {
        this.Año = Año;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Videojuegos{" + "nombre=" + nombre + ", A\u00f1o=" + Año + ", cantidad=" + cantidad + ", precio=" + precio + '}';
    }
    
    
    
}
