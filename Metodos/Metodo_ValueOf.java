package Fundamentos_Iniciales_II.Metodos;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Metodo_ValueOf {

  protected static int Entero = 15;
  protected static double Entero2 = 15;
  protected static String Text;

  public static void main(String[] args) {

    //Entero a String//
    Text = String.valueOf(Entero);
    System.out.println(Text);

    //Double a String//
    Text = String.valueOf(Entero2);
    System.out.println(Text);
  }

}
