package Lab5;

public class Usuarios {

    private String nombre;
    private String nombreU;
    private String contraseña;
    private int edad;

    public Usuarios() {
    }

    public Usuarios(String nombre, String nombreU, String contraseña, int edad)
    throws ExceptionNintendo
    {
        this.nombre = nombre;
        this.nombreU = nombreU;
        this.contraseña = contraseña;
        this.setEdad(edad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreU() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU = nombreU;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws ExceptionNintendo {
        if (edad >= 18) {
            this.edad = edad;
        }else{
            throw new ExceptionNintendo("El usuario debe ser mayor de edad");
        }
    }

    @Override
    public String toString() {
        return "Usuarios{" + "nombre=" + nombre + ", nombreU=" + nombreU + ", contraseña=" + contraseña + ", edad=" + edad + '}';
    }

}
