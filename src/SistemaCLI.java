import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SistemaCLI {

    private List<FiguraGeometrica> listaFiguras = new ArrayList<>();

    private Scanner sc;

    public SistemaCLI() {
        sc = new Scanner(System.in);
    }

    public int menu(){
        System.out.println("Seleccione una opcion:");
        System.out.println("1.Crear Figura");
        System.out.println("2.Calcular Area");
        System.out.println("3.Calcular Perimetro");
        System.out.print(">> ");
        int opc = sc.nextInt();
        return opc;
    }

    public int listarFiguras(){
        System.out.println("Seleccione una figura:");
        int i = 0;
        for (FiguraGeometrica figura : listaFiguras){
            System.out.println(i + ". " + figura);
            i++;
        }
        System.out.print(">> ");
        int opc = sc.nextInt();
        return opc;
    }

    public void crearFigura(){
        System.out.println("Seleccione una opcion:");
        System.out.println("1.Circulo");
        System.out.println("2.Triangulo");
        System.out.println("3.Rectangulo");
        System.out.print(">> ");
        int opc = sc.nextInt();

        switch (opc){
            case 1:
                System.out.print("Ingrese el radio del circulo: ");
                double radio = sc.nextDouble();
                Circulo circulo = new Circulo(radio);
                listaFiguras.add(circulo);
                break;
            case 2:
                System.out.print("Ingrese el lado A: ");
                double ladoA = sc.nextDouble();
                System.out.print("Ingrese el lado B: ");
                double ladoB = sc.nextDouble();
                System.out.print("Ingrese el lado C: ");
                double ladoC = sc.nextDouble();
                Triangulo triangulo = new Triangulo(ladoA,ladoB,ladoC);
                listaFiguras.add(triangulo);
                break;
            case 3:
                System.out.print("Ingrese la base: ");
                double base = sc.nextDouble();
                System.out.print("Ingrese la altura: ");
                double altura = sc.nextDouble();
                Rectangulo rectangulo = new Rectangulo(base,altura);
                listaFiguras.add(rectangulo);
                break;
            default:
                System.out.println("No existe la opción");
                break;
        }

    }

    public void calcularArea(){
        int indice  = listarFiguras();
        FiguraGeometrica figura = listaFiguras.get(indice);
        System.out.println("El area del " + figura + " es: " + figura.calcularArea());
    }

    public void calcularPerimetro(){
        int indice  = listarFiguras();
        FiguraGeometrica figura = listaFiguras.get(indice);
        System.out.println("El perimetro del " + figura + " es: " + figura.calcularPerimetro());
    }

}
