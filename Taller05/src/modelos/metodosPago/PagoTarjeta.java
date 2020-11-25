package modelos.metodosPago;

import java.util.Date;

public class PagoTarjeta implements Pago{
  protected float monto;
  protected String numero;
  protected Date expira;
  protected String propietario;
  protected String banco;
  
  protected String email;
  
  //constructor
  public PagoTarjeta(){}
  
  
  @Override
  public boolean realizarPago(float monto){
    return false;
  }

  //Getters y Setters

    public float getMonto() {
        return monto;
    }

    public String getNumero() {
        return numero;
    }

    public Date getExpira() {
        return expira;
    }

    public String getPropietario() {
        return propietario;
    }

    public String getBanco() {
        return banco;
    }

    public String getEmail() {
        return email;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setExpira(Date expira) {
        this.expira = expira;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public void setEmail(String email) {
        this.email = email;
    }
  
}