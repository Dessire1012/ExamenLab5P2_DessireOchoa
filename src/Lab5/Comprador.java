
package Lab5;

import java.util.ArrayList;

public class Comprador extends Usuarios{
    private ArrayList <Videojuegos> juegos = new ArrayList();
    private CuentaBancaria cuenta = new CuentaBancaria();
    private int dinero;
    private String PersonajeFav;

    public Comprador() {
        super();
    }

    public Comprador(int dinero, String PersonajeFav, String nombre, String nombreU, String contraseña, int edad) throws ExceptionNintendo {
        super(nombre, nombreU, contraseña, edad);
        this.dinero = dinero;
        this.PersonajeFav = PersonajeFav;
    }

    public ArrayList<Videojuegos> getJuegos() {
        return juegos;
    }

    public void setJuegos(ArrayList<Videojuegos> juegos) {
        this.juegos = juegos;
    }

    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getPersonajeFav() {
        return PersonajeFav;
    }

    public void setPersonajeFav(String PersonajeFav) {
        this.PersonajeFav = PersonajeFav;
    }
    

    @Override
    public String toString() {
        return "Comprador{" + "juegos=" + juegos + ", cuenta=" + cuenta + ", dinero=" + dinero + ", PersonajeFav=" + PersonajeFav + '}';
    }
    
    
}
