public class Triangulo extends FiguraGeometrica{

    private double a = 0, b = 0, c = 0;

    public Triangulo(double a, double b, double c) {
        super(3);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calcularArea(){
        double semi = calcularPerimetro() / 2;
        double area = Math.sqrt(semi * (semi - a) * (semi - b) * (semi - c));
        setArea(area);
        return getArea();
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = a + b + c;
        setPerimetro(perimetro);
        return getPerimetro();
    }
}
