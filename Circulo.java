public class Circulo extends Figura {

    private double radio;

    @Override
    public void calcularArea(){
        double area = Math.PI * Math.pow(radio, 2);
    }

    @Override 
    public void calcularPerimetro(){
        double perimetro = 2 * Math.PI * radio;
    }

}
