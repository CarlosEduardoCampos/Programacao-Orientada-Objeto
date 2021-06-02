package atividade;
import java.util.Scanner; 

public class AppAtiv {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        String op;
        do{
            // Menu interativo
            System.out.println("\n ............... Menu ............... \n");
            System.out.println("    1 - Polegadas para Centimetros    ");
            System.out.println("    2 - Pes para Centimetros          ");
            System.out.println("    3 - Milhas para Centimetros       ");
            System.out.println("\n .................................... \n");
            //
            System.out.print("OPÇÃO: ");
            op = input.nextLine();
            // Tratamento de opção
            switch (op) {
                case "1":
                    System.out.print(" POLEGADAS: ");
                    int pole = Integer.parseInt(input.nextLine());
                    TrasformarMedida.polegadasEmCentimetros(pole);
                    break;

                case "2":
                    System.out.print(" PÉS: ");
                    int pes = Integer.parseInt(input.nextLine());
                    TrasformarMedida.pesParaCentimetros(pes);
                    break;

                case "3":
                    System.out.print(" MILHAS: ");
                    int mil = Integer.parseInt(input.nextLine());
                    TrasformarMedida.milhasParaQuilometros(mil);
                    break;

                default:
                    System.out.println("\n\n Está opção não existe, tente novamente !!! ");
                    op = "#";
                    break;
            }
        }while(op == "#");
    }
}
