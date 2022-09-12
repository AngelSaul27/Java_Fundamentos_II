package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.JFrame;
import javax.swing.JTextArea;
/**
 * @author Angel Saul Pascual Camacho
 * @version 17 - 01 - 2021
 */
public class Component_JTextArea extends JFrame{

    public Component_JTextArea (){
      setLayout(null);

      JTextArea TxtArea = new JTextArea();
      TxtArea.setBounds(10,10,100,100);
      add(TxtArea);
    }

    public static void main(String[] args) {
      Component_JTextArea view = new Component_JTextArea();
      view.setBounds(0,0,300,300);
      view.setLocationRelativeTo(null);
      view.setResizable(false);
      view.setVisible(true);
    }
}
