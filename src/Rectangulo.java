public class Rectangulo extends FiguraGeometrica{

    private double base = 0, altura = 0;

    public Rectangulo(double base, double altura) {
        super(4);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea(){
        double area = base * altura;
        setArea(area);
        return getArea();
    }

    @Override
    public double calcularPerimetro(){
        double perimetro = 2 * base + 2 * altura;
        setPerimetro(perimetro);
        return getPerimetro();
    }
}
