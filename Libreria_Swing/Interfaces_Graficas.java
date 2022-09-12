package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.JFrame;
/**
 * @author Angel Saul Pascual Camacho
 * @version 13 - 01 - 2021
 */
public class Interfaces_Graficas extends JFrame{

    // Interfaz Por Medio De Un Constructor
    public Interfaces_Graficas(){
        setBounds(0,0,400,200);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
    Interfaces_Graficas View = new Interfaces_Graficas();

    /*
    Interfaz Por Medio Del Main
    Interfaces_Graficas Ventana = new Interfaces_Graficas();
    Ventana.setBounds(0,0,300,300);
    Ventana.setResizable(false);
    Ventana.setVisible(true);
    Ventana.setLocationRelativeTo(null);
    */
  }


}
