package modelos.CitasMedicas;

import java.util.ArrayList;
import modelos.usuarios.Paciente;

public class HistoriaClinica{
  protected int nro;
  protected ArrayList<String> enfermedades; 
  protected ArrayList<String> alergias;
  protected ArrayList<String> otros;
  protected Paciente paciente; 
  
  public HistoriaClinica(){
      
  }
  
  //getters y setters

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<String> getOtros() {
        return otros;
    }

    public void setOtros(ArrayList<String> otros) {
        this.otros = otros;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
  
  
}