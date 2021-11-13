
package Lab5;

import java.util.ArrayList;

public class BaseDeDatos {
    private ArrayList <Usuarios >Listadeusuarios = new ArrayList();

    public ArrayList<Usuarios> getListadeusuarios() {
        return Listadeusuarios;
    }

    public void setListadeusuarios(ArrayList<Usuarios> Listadeusuarios) {
        this.Listadeusuarios = Listadeusuarios;
    }
    
    public void addUsuario(String nombre, String nombreU, String contraseña, int edad) throws ExceptionNintendo{
        this.Listadeusuarios.add(new Usuarios(nombre, nombreU, contraseña, edad));
    }
    
    public Usuarios getUsuario(int posicion){
        return Listadeusuarios.get(posicion);
    }

    @Override
    public String toString() {
        return "BaseDeDatos{" + "Listadeusuarios=" + Listadeusuarios + '}';
    }
    
    
    
}
