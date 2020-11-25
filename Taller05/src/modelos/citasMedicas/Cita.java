package modelos.CitasMedicas;

import java.util.Date;
import modelos.metodosPago.Pago;
import modelos.usuarios.Doctor;
import modelos.usuarios.Paciente;


public class Cita{
  protected Date fecha;
  protected boolean pagada;
  protected String registradaPor;
  protected Doctor doctor;
  protected Paciente paciente;
  
  public Cita(){
      
  }
  
  
  public boolean realizarPago(Pago pago){
    return false;
  }
  
  //getters y setters

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getRegistradaPor() {
        return registradaPor;
    }

    public void setRegistradaPor(String registradaPor) {
        this.registradaPor = registradaPor;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
  
	
}