public class Cuadrado extends Figura{
    Double lado;
    @Override
    public void calcularArea() {
        System.out.println("El area del cuadrado es: "+ lado*lado);
    }
    @Override
    public void calcularPerimetro() {
        System.out.println("El perimetro del cuadrado es: "+ lado*4);
    }
}
