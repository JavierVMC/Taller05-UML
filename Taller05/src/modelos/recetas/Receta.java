package modelos.recetas;
import java.util.ArrayList;
import java.util.Date;
import modelos.usuarios.*;


public class Receta{
  protected Date fecha;
  protected Doctor doc;
  protected Paciente paciente;
  protected ArrayList<Medicamento> medicamentos;
  protected PlanNutricional plan;
  //Constructor

  public Receta(){
      
  }
  
  
  //getters y setters

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Doctor getDoc() {
        return doc;
    }

    public void setDoc(Doctor doc) {
        this.doc = doc;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public ArrayList<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(ArrayList<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }

    public PlanNutricional getPlan() {
        return plan;
    }

    public void setPlan(PlanNutricional plan) {
        this.plan = plan;
    }
  

}