package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 24 - 01 - 2021
 */
public class Component_JCheckBox extends JFrame{

    //DERECHA ARRIBA LARGO ANCHO

    public Component_JCheckBox(){
      setLayout(null);

      //se puede elegir dos opciones o mas

      JCheckBox Check1 = new JCheckBox("Op. 1");
      Check1.setBounds(10,10,100,30);
      add(Check1);

      JCheckBox Check2 = new JCheckBox("Op. 1");
      Check2.setBounds(10,50,100,30);
      add(Check2);
    }

    public static void main(String[] args) {
      Component_JCheckBox Box = new Component_JCheckBox();
      Box.setBounds(0,0,300,300);
      Box.setResizable(false);
      Box.setVisible(true);
      Box.setLocationRelativeTo(null);
    }
}
