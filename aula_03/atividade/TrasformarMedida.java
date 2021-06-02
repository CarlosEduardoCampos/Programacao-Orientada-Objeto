package atividade;
import java.util.Scanner;
//
public class TrasformarMedida {
    static Scanner input = new Scanner(System.in);
    // 
    public static final double POL_TO_CM = 2.54;
    public static final double PES_TO_CM = 30.48;
    public static final double MIL_TO_KM = 1.609;
    //
    static double calcular;
    // Método transforma polegadas em centimetros
    public static void polegadasEmCentimetros(int polegadas)
    {
        calcular = polegadas*POL_TO_CM;
        System.out.println("\n "+ polegadas +" polegadas é iqual a "+ calcular + " centimetros \n");
    }
    // Método transforma pés para centimetros
    public static void pesParaCentimetros(int pes)
    {
        calcular = pes*PES_TO_CM;
        System.out.println("\n "+ pes +" pés é iqual a "+ calcular + " centimetros \n");
    }
    // Método transforma milhas para quilometros
    public static void milhasParaQuilometros(int milhas)
    {
        calcular = milhas*MIL_TO_KM;
        System.out.println("\n "+ milhas +" milhas é iqual a "+ calcular + " quilometros \n");
    }
}
