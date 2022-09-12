package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 24 - 01 - 2021
 */
public class Component_JMenus extends JFrame{

  public Component_JMenus(){
    setLayout(null);
    /*Barra de menu en el que se agregan los submenus,
    colocacion automatica no precisa de el setBounds*/
    JMenuBar Barra = new JMenuBar();
    /*Establecemos a JMenuBar el objeto Barra*/
    setJMenuBar(Barra);

    JMenu SubMenus = new JMenu("Opciones");
    /*A la barra creada (objeto barra) le agregamos un submenu*/
    Barra.add(SubMenus);

    JMenuItem Item1 = new JMenuItem("Opcion 1");
    /*Al submenu le agregamos una opcion*/
    SubMenus.add(Item1);
    /*Sirve para darle una funcion o evento a realizar al ser pulsado*/
    // Item1.addActionListener(this);

    /*SUBMENUS DENTRO DE SUBS MENUS*/

    JMenu SubMenu2 = new JMenu("Opcion 2");
    Barra.add(SubMenu2);

    JMenu SubMenu3 = new JMenu("Opcion 3");
    SubMenu2.add(SubMenu3);

    JMenuItem Item2 = new JMenuItem("Item 2");
    SubMenu3.add(Item2);
  }


  public static void main(String[] args) {
    Component_JMenus Menus = new Component_JMenus();
    Menus.setBounds(0,0,300,300);
    Menus.setResizable(false);
    Menus.setLocationRelativeTo(null);
    Menus.setVisible(true);
  }
}
