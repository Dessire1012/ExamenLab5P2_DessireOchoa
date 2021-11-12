
package Lab5;

import java.util.ArrayList;


public class Vendedor extends Usuarios{
    private float cantEstrellas;
    private ArrayList <Videojuegos> juegosVender = new ArrayList();
    private ArrayList <Videojuegos> juegosVendidos = new ArrayList();
    private int dineroRecibido;
    private CuentaBancaria cuenta = new CuentaBancaria();
    private String PersonajeFav;

    public Vendedor() {
        super();
    }

    public Vendedor(float cantEstrellas, int dineroRecibido, String PersonajeFav, String nombre, String nombreU, String contraseña, int edad) throws ExceptionNintendo {
        super(nombre, nombreU, contraseña, edad);
        this.cantEstrellas = cantEstrellas;
        this.dineroRecibido = dineroRecibido;
        this.PersonajeFav = PersonajeFav;
    }
    

    public float getCantEstrellas() {
        return cantEstrellas;
    }

    public void setCantEstrellas(float cantEstrellas) {
        this.cantEstrellas = cantEstrellas;
    }

    public ArrayList<Videojuegos> getJuegosVender() {
        return juegosVender;
    }

    public void setJuegosVender(ArrayList<Videojuegos> juegosVender) {
        this.juegosVender = juegosVender;
    }

    public ArrayList<Videojuegos> getJuegosVendidos() {
        return juegosVendidos;
    }

    public void setJuegosVendidos(ArrayList<Videojuegos> juegosVendidos) {
        this.juegosVendidos = juegosVendidos;
    }
    
    public void addJuegoVender (String nombre, int Año, int cantidad, float precio){
        this.juegosVender.add(new Videojuegos(nombre, Año, cantidad, precio));
    }
    
    public void addJuegoVendidos (String nombre, int Año, int cantidad, float precio){
        this.juegosVendidos.add(new Videojuegos(nombre, Año, cantidad, precio));
    }

    public int getDineroRecibido() {
        return dineroRecibido;
    }

    public void setDineroRecibido(int dineroRecibido) {
        this.dineroRecibido = dineroRecibido;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public String getPersonajeFav() {
        return PersonajeFav;
    }

    public void setPersonajeFav(String PersonajeFav) {
        this.PersonajeFav = PersonajeFav;
    }

    @Override
    public String toString() {
        return "Vendedor{" + "cantEstrellas=" + cantEstrellas + ", juegosVender=" + juegosVender + ", juegosVendidos=" + juegosVendidos + ", dineroRecibido=" + dineroRecibido + ", cuenta=" + cuenta + ", PersonajeFav=" + PersonajeFav + '}';
    }
    
    
    
}
