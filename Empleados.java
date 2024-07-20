public class Empleados {
    String name;
    String position;
    double salary;
    int id;

public Empleados(String name, String position, double salary, int id){
    this.name = name;
    this.position = position;
    this.salary =salary;
    this.id =id;
}

public Empleados() {
}

public String getName() {
    return name;
}

public String getPosition() {
    return position;
}

public double getSalary() {
    return salary;
}

public int getId() {
    return id;
}

public void aunmento(double porcentaje){
    double aumentoDado = salary*(porcentaje/100);
    this.salary = salary+aumentoDado;
    System.out.println("Su salario nuevo es: "+ salary +" con un aumento del: "+ porcentaje+"%");
}

public static void main(String[] args) {
    Empleados empleado1 = new Empleados("Juan", "Programador", 100, 12);
    empleado1.aunmento(20);
}

@Override
public String toString() {
    return "Empleados [name=" + name + ", position=" + position + ", salary=" + salary + ", id=" + id + "]";
}

}


