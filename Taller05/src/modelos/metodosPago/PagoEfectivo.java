package modelos.metodosPago;

public class PagoEfectivo implements Pago{
    protected float monto;
    //constructor

    public PagoEfectivo() {
    }
    


    //Getters y Setters
    public void setMonto(float s) {
        this.monto = s;
    }

    public float getDescripcion() {
        return monto;
    }

    @Override
    public boolean realizarPago(float monto) {
        return false;
    }
}