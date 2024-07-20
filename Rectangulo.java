public class Rectangulo extends Figura {
    
    private double base;
    private double altura;

    @Override
    public void calcularArea(){
        System.out.println("El area del rectangulo es: " + (base * altura));
    }
    @Override
    public void calcularPerimetro(){
        System.out.println("El perimetro del rectangulo es: " + (base*2 + altura*2));

    }
}
