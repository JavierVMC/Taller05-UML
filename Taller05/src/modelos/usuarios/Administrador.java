package modelos.usuarios;

import java.util.Date;

public class Administrador extends Persona{

    public Administrador(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
    }

    public void registrarUsuario() {

    }

    public void asignarRol(Persona p) {

    }


}