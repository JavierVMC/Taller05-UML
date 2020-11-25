package modelos.usuarios;

import java.util.Date;

public class Secretaria extends Persona{
    protected Doctor doctor;

    public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor, Doctor doctor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.doctor = doctor;
    }

    public void verificarCita() {

    }

    public void agendarCita() {

    }

    
    //getters y setters

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
}