
package Lab5;

public class Administrador extends Usuarios{

    public Administrador() {
        super();
    }

    public Administrador(String nombre, String nombreU, String contraseña, int edad) throws ExceptionNintendo {
        super(nombre, nombreU, contraseña, edad);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

}
