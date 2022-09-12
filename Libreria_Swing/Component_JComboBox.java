package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.*;
import java.awt.event.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 17 - 01 - 2021
 */
public class Component_JComboBox extends JFrame implements ItemListener {

    public JComboBox Box = new JComboBox();

    public Component_JComboBox() {
      setLayout(null);

      Box.setBounds(10,10,100,30);
      Box.addItem("RED");
      Box.addItem("BLUE");
      Box.addItem("GREEN");
      Box.addItemListener(this);
      add(Box);
    }

    public void itemStateChanged(ItemEvent E) {
      if (E.getSource()==Box) {
        String Seleccion = Box.getSelectedItem().toString();
        setTitle(Seleccion);
      }
    }

    public static void main(String[] args) {
      Component_JComboBox view = new Component_JComboBox();
      view.setBounds(0,0,300,300);
      view.setLocationRelativeTo(null);
      view.setResizable(false);
      view.setVisible(true);
    }
}
