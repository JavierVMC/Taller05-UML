package modelos.usuarios;

import java.util.ArrayList;
import java.util.Date;
import modelos.CitasMedicas.Cita;
import modelos.areas.AreaMedica;


public class Doctor extends Persona{

    protected int regDoctor;
    protected String especialidad;
    protected AreaMedica area;
    protected Secretaria secretaria;
    protected ArrayList<Cita> citasPendientes;

    public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor, int regDoctor, String especialidad, AreaMedica area) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.regDoctor = regDoctor;
        this.especialidad = especialidad;
        this.area = area;
    }

    public void recetar() {

    }

    public void agregarPlanNut() {

    }

    public void imprimirReceta() {

    }

    public void registraSecretaria() {

    }

}