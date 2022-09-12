package Fundamentos_Iniciales_II.Metodos;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 * @author Angel Saul Pascual Camacho
 * @version 15 - 01 - 2021
 */
public class Metodo_Layout extends JFrame{
  public Metodo_Layout(){

    setLayout(null);
    /* Layout: Permite indicar donde colocar
     los elementos en la pantalla, para esto usaremos
     la palabra reservada null, asi evitamos que los
     elementos en la pantalla se coloquen de manera
     aleatoria */

    JLabel Texto = new JLabel("Texto");
    Texto.setBounds(10,10,50,50);
    add(Texto);
  }

  public static void main(String[] args) {
    Metodo_Layout View = new Metodo_Layout();
    View.setBounds(0,0,300,300);
    View.setResizable(false);
    View.setLocationRelativeTo(null);
    View.setVisible(true);
  }
}
