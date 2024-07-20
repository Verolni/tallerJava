package taller2;

import java.util.ArrayList;

public class LEstudiantes {
    ArrayList <Estudiante> Estudiantes = new ArrayList<Estudiante>();
    public void show (){
        for (int i = 0; i < Estudiantes.size(); i++) {
            System.out.println(Estudiantes.get(i).toString());
        }
    
    }
public void addEstudiante(Estudiante a){
    Estudiantes.add(a);
}

public void removeById (int id){
    for (int i = 0; i < Estudiantes.size(); i++) {
    if(Estudiante.get(i).getId()==id){
        Estudiantes.remove(i);
    }
    }
}
    public void searchByName(String name){
        for (int i = 0; i < Estudiantes.size(); i++) {
            if(Estudiante.get(i).getName()==name){
    }
}

    }
}
