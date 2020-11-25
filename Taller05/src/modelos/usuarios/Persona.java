package modelos.usuarios;

import java.util.Date;

public class Persona{
	protected String usuario;
	protected String clave;
	protected String nombre;
	protected String apellido;
	protected String cedula;
	protected String direccion;
	protected Date fechaNac;
	protected Administrador registradoPor;

    public Persona(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
        this.registradoPor = registradoPor;
    }

    public boolean logIn() {
        return false;
    }

    public boolean logOut() {
        return false;
    }
    
    //getters y setters

    public String getUsuario() {
        return usuario;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public Administrador getRegistradoPor() {
        return registradoPor;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setRegistradoPor(Administrador registradoPor) {
        this.registradoPor = registradoPor;
    }
    

}