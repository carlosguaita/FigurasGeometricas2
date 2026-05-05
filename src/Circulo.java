public class Circulo extends FiguraGeometrica{

     private double radio = 0;
     private double diametro = 0;


    public Circulo(double radio) {
        super(0);
        this.radio = radio;
        this.diametro = 2 * radio;
    }

    @Override
    public double calcularArea(){
        double area = Math.PI * Math.pow(radio,2);
        setArea(area);
        return getArea();
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = diametro * Math.PI;
        setPerimetro(perimetro);
        return getPerimetro();
    }
}
