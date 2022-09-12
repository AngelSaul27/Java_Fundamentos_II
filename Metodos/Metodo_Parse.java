package Fundamentos_Iniciales_II.Metodos;
/**
 * @author Angel Saul Pascual Camacho
 * @version 01 - 02 - 2021
 */
public class Metodo_Parse {

    protected static int Entero;
    protected static float flotante;
    protected static double Decimal;
    protected static short EntShort;
    protected static byte EntByte;
    protected static long EntLog;
    protected static String Txt = "10";

    public static void main(String[] args) {

      //Conversion String a Entero
      Entero = Integer.parseInt(Txt);
      System.out.println(Entero);

      //Conversion String a Float
      flotante = Float.parseFloat(Txt);
      System.out.println(flotante);

      //Conversion String a Decimal
      Decimal = Double.parseDouble(Txt);
      System.out.println(Decimal);

      //Conversion String a short
      EntShort = Short.parseShort(Txt);
      System.out.println(EntShort);

      //Conversion String a EntByte
      EntByte = Byte.parseByte(Txt);
      System.out.println(EntByte);

      //Conversion String a Long
      EntLog = Long.parseLong(Txt);
      System.out.println(EntLog);
    }
}
