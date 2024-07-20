package taller2;

public class EmpleadoT extends Empleado {
    private int mesesContrato;

    public EmpleadoT(int id, String name, int age, int mesesContrato ){
    super(name, age,id);
    this.mesesContrato = mesesContrato;
    
    }

}
