package modelos.usuarios;


import java.util.ArrayList;
import java.util.Date;
import modelos.CitasMedicas.Cita;
import modelos.CitasMedicas.HistoriaClinica;
import modelos.recetas.Receta;


public class Paciente extends Persona{
    protected String email;
    protected Cita cita;
    protected HistoriaClinica historiaClinica; 
    protected ArrayList<Receta> recetas;

    public Paciente(String email, String usuario, String clave, String nombre, String apellido, String cedula, String direccion, Date fechaNac, Administrador registradoPor) {
        super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac, registradoPor);
        this.email = email;
    }
    

    public boolean solicitarCita() {
        return false;
    }


    //getters y setters

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public HistoriaClinica getHistoriaClinica() {
        return historiaClinica;
    }

    public void setHistoriaClinica(HistoriaClinica historiaClinica) {
        this.historiaClinica = historiaClinica;
    }

    public ArrayList<Receta> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<Receta> recetas) {
        this.recetas = recetas;
    }
    
}