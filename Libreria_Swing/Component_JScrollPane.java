package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 17 - 01 - 2021
 */
public class Component_JScrollPane extends JFrame{

  public Component_JScrollPane(){
    setLayout(null);

    JTextArea Area = new JTextArea();
    JScrollPane Scroll = new JScrollPane(Area);

    Scroll.setBounds(10,10,100,100);
    add(Scroll);
  }

  public static void main(String[] args) {
    Component_JScrollPane view = new Component_JScrollPane();
    view.setBounds(0,0,300,300);
    view.setLocationRelativeTo(null);
    view.setResizable(false);
    view.setVisible(true);
  }
}
