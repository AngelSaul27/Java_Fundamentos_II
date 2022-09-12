package Fundamentos_Iniciales_II.ItemListener;
import java.awt.event.*;
import javax.swing.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class ItemComboBox extends JFrame implements ItemListener{

  protected JComboBox Box = new JComboBox();

  public ItemComboBox(){
    setLayout(null);

    Box.setBounds(10,10,100,30);
    Box.addItem("Opcion 1");
    Box.addItem("Opcion 2");
    Box.addItem("Opcion 3");
    Box.addItem("Opcion 4");
    Box.addItemListener(this);
    add(Box);
  }

  public void itemStateChanged(ItemEvent E){
    if (E.getSource()==Box) {
      String selector = Box.getSelectedItem().toString();

      if (selector == "Opcion 1") {
        setTitle(selector);
      }else if(selector == ("Opcion 2")){
        setTitle(selector);
      }else if(selector.equals("Opcion 3")){
        setTitle(selector);
      }else if(selector.equalsIgnoreCase("Opcion 4")){
        setTitle(selector);
      }
      /*Nota: Dependiendo de lo que se desea realizar se hace
      uso del equals o no */
    }
  }

  public static void main(String[] args) {
    ItemComboBox view = new ItemComboBox();
    view.setBounds(0,0,300,300);
    view.setLocationRelativeTo(null);
    view.setResizable(false);
    view.setVisible(true);
  }

}
