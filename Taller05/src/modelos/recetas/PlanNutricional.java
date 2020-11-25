package modelos.recetas;

public class PlanNutricional{
    protected String descripcion;

    //Constructor
    public PlanNutricional() {
    }

    //Getters y Setters
    public void setDescripcion(String s) {
        this.descripcion = s;
    }

    public String getDescripcion() {
        return descripcion;
    }
 
}