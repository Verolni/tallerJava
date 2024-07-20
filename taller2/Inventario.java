package taller2;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Producto> invetory = new ArrayList<Producto>();

    public void show(){
        for (int i = 0; i < invetory.size(); i++) {
            System.out.println(invetory.get(i).toString());
        }
    }

    public void addToInventory(Producto a){
        invetory.add(a);
    }

    public void removeById(int id){
        for(int i = 0; i < invetory.size(); i++){
            if(invetory.get(i).getId() == id){
                invetory.remove(i);
            }
        }
    }

    public void searchByName(String name){
        for (int i = 0; i < invetory.size(); i++) {
            if (invetory.get(i).getName().equals(name)) {
                System.out.println(invetory.get(i).toString());
            }
        }
    }

    public static void main(String[] args) {
        Inventario invetory = new Inventario();
        Producto p1 = new Producto(1, "Apple iPhone", 999.99);
        Producto p2 = new Producto(2, "Samsung TV", 1299.99);
        Producto p3 = new Producto(3, "Nike Shoes", 79.99);
        Producto p4 = new Producto(4, "Sony Headphones", 49.99);
        Producto p5 = new Producto(5, "Canon Camera", 399.99);
        invetory.addToInventory(p1);
        invetory.addToInventory(p2);
        invetory.addToInventory(p3);
        invetory.addToInventory(p4);
        invetory.addToInventory(p5);
        invetory.show();
        
    }

}
