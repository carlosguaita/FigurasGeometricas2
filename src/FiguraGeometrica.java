public class FiguraGeometrica {

    private int lados = 0;
     double area = 0;
    private double perimetro = 0;

    public FiguraGeometrica(int lados) {
        this.lados = lados;
    }

    public FiguraGeometrica(int lados, double area, double perimetro) {
        this.lados = lados;
        this.area = area;
        this.perimetro = perimetro;
    }

    public double calcularArea(){
        return 0;
    }

    public double calcularPerimetro(){
        return 0;
    }

    public int getLados() {
        return lados;
    }

    public void setLados(int lados) {
        this.lados = lados;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public String toString(){
        String tipoFigura = "";
        if (lados == 0){
            tipoFigura = "Circulo";
        } else if (lados == 3) {
            tipoFigura = "Triangulo";
        } else if (lados == 4) {
            tipoFigura = "Rectangulo";
        }
        return tipoFigura;
    }
}
