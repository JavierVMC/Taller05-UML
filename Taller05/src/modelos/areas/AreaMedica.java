package modelos.areas;

import java.util.ArrayList;
import modelos.usuarios.Doctor;

public class AreaMedica{
    protected String especialidad;
    protected float costo;
    protected ArrayList<Doctor> doctores;
    
    public AreaMedica(){
        
    }
    
    //getters y setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }
    
    
}