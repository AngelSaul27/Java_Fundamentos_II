package Fundamentos_Iniciales_II.Metodos;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
 public class Metodo_ToString {

   protected static float flotante = 16;
   protected static double decimal  = 16;
   protected static int Numero = 10;
   protected static String Text;

   public static void main(String[] args) {

     //Conversion Entero a String//
     Text = Integer.toString(Numero);
     System.out.println(Text);

     //Conversion Float a String con encasillamiento//
     Text = Integer.toString((int) flotante);
     System.out.println(Text);
     /*Para este caso se convierte primero a int else {
       flotante y despues a string para ellos agregamos
       (int) indicando la Conversion a entero, es decir el
         flotante pasa como entero y no como double a esto
         se le conoce como encasillamiento
     }*/

     //Conversion Float a String//
     Text = Integer.toString((int) decimal);
     System.out.println(Text);

   }
}
