package taller2;

public class Empleado extends Persona{
    
    private int id;

    public Empleado(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }  

    
}