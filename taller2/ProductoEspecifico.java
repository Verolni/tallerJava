package taller2;

public class ProductoEspecifico extends Producto{
    
    private String category;
    private String brand;
    
    public ProductoEspecifico(int id, String name, double price, String category, String brand) {
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

}
