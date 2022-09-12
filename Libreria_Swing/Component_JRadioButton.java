package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 24 - 01 - 2021
 */
public class Component_JRadioButton extends JFrame{

  /*AGRUPACION DONDE SE AGREGAN LOS RADIOS BUTTONS PARA QUE
    SOLO SE PUEDA ELEGIR UNA OPCION SI NO SE COLOCA DENTRO default:
    ESTE COMPONENTE ENTONCES SE PODRAN SELECCIONAR LAS DOS OPCIONES
  */
  ButtonGroup bg = new ButtonGroup();

  public Component_JRadioButton(){
    setLayout(null);

    JRadioButton Radio = new JRadioButton("Opcion 1");
    Radio.setBounds(10,10,100,30);

    JRadioButton Radio2 = new JRadioButton("Opcion 2");
    Radio2.setBounds(120,10,100,30);

    add(Radio); add(Radio2);
    bg.add(Radio); bg.add(Radio2); //SE AGREGA AL GRUPO DE BUTTONS
  }

  public static void main(String[] args) {
    Component_JRadioButton RadioBtn = new Component_JRadioButton();
    RadioBtn.setBounds(0,0,300,300);
    RadioBtn.setLocationRelativeTo(null);
    RadioBtn.setResizable(false);
    RadioBtn.setVisible(true);
  }
}
