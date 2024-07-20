package taller2;

public class EmpleadoP extends Empleado{
    private int anioContrato;

    private EmpleadoP (String name, int age, int id, int anioContrato){
        super(name, age, id);
        this.anioContrato = anioContrato;
        
    }

}