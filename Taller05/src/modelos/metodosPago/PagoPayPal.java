package modelos.metodosPago;

import java.util.Date;

public class PagoPayPal implements Pago{
    protected float monto;
    protected String email;
    
    
    public PagoPayPal(){
        
    }
    

    public float getMonto() {
        return monto;
    }

    public String getEmail() {
        return email;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean realizarPago(float monto) {
        return false;
    }
    
    
}