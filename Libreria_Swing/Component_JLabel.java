package Fundamentos_Iniciales_II.Libreria_Swing;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 01 - 2021
 */
public class Component_JLabel extends JFrame{

    /* NO SOLAMENTE SE OUEDE DECLARAR UN COMPONENTE EN EL
      CONTRUCCTOR TAMBIEN EN NUESTRO MAIN O FUERA DE LOS DOS
      PERO DEBERA LLEVAR UN INDICADOR DE ACCESO (PRIVATE-PUBLIC-PROTECTED)
    }*/

    public Component_JLabel (){
      setLayout(null);

      JLabel Texto = new JLabel("Hola");
      Texto.setBounds(5,5,60,60);
      add(Texto);

      JLabel Texto2 = new JLabel("Mundo");
      Texto2.setBounds(5,15,60,60);
      add(Texto2);
    }

    public static void main(String[] args) {
      Component_JLabel View = new Component_JLabel();
      View.setBounds(0,0,300,300);
      View.setVisible(true);
      View.setResizable(false);
      View.setLocationRelativeTo(null);
    }
}
