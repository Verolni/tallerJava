package taller2;

import java.util.ArrayList;

public class GestionCusros {
    ArrayList <Curso> Estudio = new ArrayList<Curso>();
    public void show(){
        for (int i = 0; i < Estudio.size(); i++) {
            System.out.println(Estudio.get(i).getNombre());
        }

    }
    public void addCurso(Curso a){
        Estudio.add(a);
    }

    public void removeByCodigo (int codigo){
        for (int i = 0; i < Estudio.size(); i++) {
        if(Estudio.get(i).getCodigo() == codigo){
            Estudio.remove(i);
        }
        }
    }
    public void searchByName(String name){
        for (int i = 0; i < Estudio.size(); i++) {
        if(Estudio.get(i).getNombre().equals(name)){
            System.out.println(Estudio.get(i).toString());
        }
        }
    }
   
    public static void main(String[] args) {
        GestionCusros Estudio = new GestionCusros();
      Estudio.addCurso(new Curso());
    }
}
