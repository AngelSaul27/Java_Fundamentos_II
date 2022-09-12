package Fundamentos_Iniciales_II.ActionListeners;
import javax.swing.*; //Interfaz Componentes
import java.awt.event.*; //
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Event_Buttons extends JFrame implements ActionListener{

  protected JButton BtnEvent = new JButton("ALERT");

  public Event_Buttons(){
    setLayout(null);

    BtnEvent.setBounds(10,10,100,30);
    BtnEvent.addActionListener(this);
    add(BtnEvent);
  }

  public void actionPerformed(ActionEvent E){
    if (E.getSource()==BtnEvent) {
        JOptionPane.showMessageDialog(null, "Evento Realizado");
    }
  }

  public static void main(String[] args) {
    Event_Buttons view = new Event_Buttons();
    view.setBounds(0,0,300,300);
    view.setLocationRelativeTo(null);
    view.setResizable(false);
    view.setVisible(true);
  }
}
