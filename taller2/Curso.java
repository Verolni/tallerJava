package taller2;

public class Curso {
   int codigo;
   String nombre;

public int getCodigo() {
    return codigo;
}
public void setCodigo(int codigo) {
    this.codigo = codigo;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public class Estudiantes extends LEstudiantes {
/**
 * @param name
 * @param id
 * @param email
 */
public void ListaEstudiantes(String name, int id, String email){
    System.out.println("Nombre: "+name+" ID: "+id+" Email: "+email);
}
    
}

public int getId() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getId'");
}
}
