import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SistemaCLI sis = new SistemaCLI();

        int opc1 = 0, opc2 = 0;

        do{

            opc1 = sis.menu();

            switch (opc1) {
                case 1:
                    sis.crearFigura();
                    break;
                case 2:
                    sis.calcularArea();
                    break;
                case 3:
                    sis.calcularPerimetro();
                    break;
                default:
                    System.out.println("No existe la opcion");
                    break;
            }
            System.out.print("Desea seleccionar otra opcion 1.Si/2.No: ");
            opc2 = sc.nextInt();
        }while(opc2 == 1);

    }
}