import java.util.Scanner;

public class Libros{

    //atributos
    String name;
    String title;
    int year;
    boolean prestado = false ;
    

    //metodo
    public Libros(String name, String title, int year) {
        this.name = name;
        this.title = title;
        this.year = year;
    }

    void prestar() {
        if (prestado != true) {
            this.prestado =  true;
            System.out.println("El libro te será prestado");
        } else {
            System.out.println("El libro ya fue prestado");
        }
    }

    @Override
    public String toString() {
        return "Libros{" +
                "name = '" + name + '\'' +
                ", title = '" + title + '\'' +
                ", year = " + year +
                ", prestado = '" + prestado + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre del autor: ");
        String name = sc.nextLine();

        System.out.println("Ingrese el titulo del libro: ");
        String title = sc.nextLine();

        sc.nextLine();

        System.out.println("ingrese el año de publicacion: ");
        int year = sc.nextInt();


        Libros libro1 = new Libros(name, title, year);
        System.out.println(libro1);
        libro1.prestar();
        System.out.println(libro1);

    }

}
