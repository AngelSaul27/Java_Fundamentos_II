package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.*;

/**
 * @author Angel Saul Pascual Camacho
 * @version 17 - 01 - 2021
 */
public class Component_JButton extends JFrame implements ActionListener {

    /* COMPONENTE GLOBAL SOLO PARA ESTA CLASE [PRIVADO]*/
    private JButton Boton = new JButton("Prensar"); //se define afuera

    public Component_JButton() {
        setLayout(null);
        JButton Boton2 = new JButton("Prensar");
        Boton.setBounds(10, 10, 100, 30);
        /* LA ACCION SE DEFINE MAS ADELANTE */
        Boton.addActionListener(this); // indicamos que tendra una accion
        add(Boton);
    }

    /*METODO QUE TIENE Y REALIZA LAS ACCIONES*/
    public void actionPerformed(ActionEvent E) {
        // ACCION

        if (E.getSource() == Boton) {
            System.out.println("Funciona :P");
        }
    }

    public static void main(String[] args) {
        Component_JButton view = new Component_JButton();
        view.setBounds(0,0,300,300);
        view.setResizable(false);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
    }
}
