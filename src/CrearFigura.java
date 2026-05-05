import javax.swing.*;
import java.awt.event.*;

public class CrearFigura extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JTextField textRadio;
    private JTextField textLadoA;
    private JTextField textLadoB;
    private JTextField textLadoC;
    private JTextField textBase;
    private JTextField textAltura;
    private JLabel lbRadio;
    private JLabel lbLadoA;
    private JLabel lbLadoB;
    private JLabel lbLadoC;
    private JLabel lbBase;
    private JLabel lbAltura;

    public CrearFigura() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }

    public void setTipoFigura(String tipoFigura){
        if (tipoFigura.equals("Circulo")){
            configurarParaCirculo();
        }
    }

    public void configurarParaCirculo(){
        textRadio.setVisible(true);
        textLadoA.setVisible(false);
        textLadoB.setVisible(false);
        textLadoC.setVisible(false);
        textBase.setVisible(false);
        textAltura.setVisible(false);
        lbRadio.setVisible(true);
        lbLadoA.setVisible(false);
        lbLadoB.setVisible(false);
        lbLadoC.setVisible(false);
        lbBase.setVisible(false);
        lbAltura.setVisible(false);
    }


    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }
}
