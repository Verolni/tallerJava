package taller2;

import java.util.ArrayList;

public class GestionEmpleado {
    ArrayList <Empleado> nomina = new ArrayList<Empleado>();
    public void show (){
        for (int i = 0; i < nomina.size(); i++){
            System.out.println(nomina.get(i).toString());
        }
    }

    public void addEmpleado(Empleado a){
        nomina.add(a);
    }

    public void remoById(int id){
        for (int i = 0; i < nomina.size(); i++){
            if (nomina.get(i).getId() == id){
                nomina.remove(i);
            }
        }
    }
    public void searchByName(String name ){
        for (int i = 0; i < nomina.size(); i++){
        if (nomina.get(i).getName().equals(name)){
            System.out.println(nomina.get(i).toString());
         }
        }
    }


    public static void main(String[] args) {
        GestionEmpleado nomina = new GestionEmpleado();
        Empleado a1 = new Empleado("Juan", 20, 01);
        Empleado a2 = new Empleado("William", 25, 02);
        Empleado a3 = new Empleado("Julian", 22, 03);
        nomina.addEmpleado(a1);
        nomina.addEmpleado(a2);
        nomina.addEmpleado(a3);
        nomina.searchByName("juan");
        System.out.println();
        nomina.remoById(01);
        nomina.show();
    }
 }
