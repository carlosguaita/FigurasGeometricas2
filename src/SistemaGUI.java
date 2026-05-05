import javax.swing.*;
import java.awt.event.*;

public class SistemaGUI extends JFrame{
    private JButton crearFiguraButton;
    private JComboBox cbTipoFigura;
    private JTextArea txtListaFiguras;
    private JPanel contenedor;

    private String tipoFigura = "Circulo";

    public SistemaGUI() {
        setContentPane(contenedor);

        CrearFigura crearFigura = new CrearFigura();

        cbTipoFigura.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(e.getItem().toString());
                tipoFigura = e.getItem().toString();
            }
        });
        crearFiguraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                crearFigura.pack();
                crearFigura.setTipoFigura(tipoFigura);
                crearFigura.setVisible(true);
            }
        });
    }
}
