package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.JFrame;
import javax.swing.JTextField;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 01 - 2021
 */
public class Component_JTextField extends JFrame{

    /*COMPONENTES DECLARADOS FUERA DEL CONSTRUCCTOR Y MAIN
    CON UN ACCESADOR DE TIPO DEFAULT: Y PUBLIC*/

    JTextField OutField = new JTextField();
    public JTextField OutField2 = new JTextField();

    public Component_JTextField(){
      setLayout(null);

      //Field 1
      OutField.setBounds(10,10,100,30);
      add(OutField);

      //Field 2
      OutField2.setBounds(10,50,100,30);
      add(OutField2);
    }

    public static void main(String[] args) {
      Component_JTextField View = new Component_JTextField();
      View.setBounds(0,0,200,200);
      View.setVisible(true);
      View.setResizable(false);
      View.setLocationRelativeTo(null);
    }
}
