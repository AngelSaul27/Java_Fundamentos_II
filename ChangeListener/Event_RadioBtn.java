package Fundamentos_Iniciales_II.ChangeListener;
import javax.swing.*;
import javax.swing.event.*;
/**
 * @author Angel Saul Pascual Camacho
 * @version 24 - 01 - 2021
 */
public class Event_RadioBtn extends JFrame implements ChangeListener{

    private JRadioButton Rd1 = new JRadioButton("Btn 1");
    private JRadioButton Rd2 = new JRadioButton("Btn 2");
    private JRadioButton Rd3 = new JRadioButton("Btn 3");

    public Event_RadioBtn(){
      setLayout(null);

      ButtonGroup Bg = new ButtonGroup();

      Rd1.setBounds(10,10,100,30);
      Rd2.setBounds(10,40,100,30);
      Rd3.setBounds(10,70,100,30);

      /*INDICAMOS QUE TENDRA UNA ACCION, THIS INDICA QUE LA ACCION SE DEFINE
        MAS ADELANTE Y NO AHI MISMO*/
      Rd1.addChangeListener(this);
      Rd2.addChangeListener(this);
      Rd3.addChangeListener(this);

      add(Rd1); add(Rd2); add(Rd3);
      Bg.add(Rd1); Bg.add(Rd2); Bg.add(Rd3);

    }

    public static void main(String[] args) {
      Event_RadioBtn EventRD = new Event_RadioBtn();
      EventRD.setBounds(0,0,300,300);
      EventRD.setLocationRelativeTo(null);
      EventRD.setResizable(false);
      EventRD.setVisible(true);
    }

    //METODO A AGREAR
    @Override //INDICA QUE SOBRE-ESCRIBIMOS EL METODO
    public void stateChanged(ChangeEvent e) {
      //e ES LA VARIABLE QUE ALMACINA LOS EVENTOS O ACCIONES
      if(e.getSource()==Rd1){
        setTitle("Radio 1");
      }
      if (e.getSource()==Rd2) {
        setTitle("Radio 2");
      }
      if (e.getSource()==Rd3) {
        setTitle("Radio 3");
      }
    }

}
