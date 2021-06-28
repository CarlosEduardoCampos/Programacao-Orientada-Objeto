package montadora02;

import montadora01.Carro;
import montadora01.toLine;

//
public class fabrica {
    // Método main para iniciar programa:
    public static void main(String[] args)
    {
        toLine linha = new toLine();// linhae um objto toline.
        //
        Carro carroDoJao = new Carro("cor", "marca","modelo","namPro", 0, 0, 0); // carroDoJao é um objeto Carro.
        //
        System.out.println(" Carro do Jão:");
        //
        linha.inLine();
        carroDoJao.inVar();
        linha.fiLine();
        linha.soLine();
        System.out.println(carroDoJao.toString());
        //        
        Carro carroDoTiao = new Carro("cor", "marca","modelo","namPro", 0, 0, 0, 0);// carroDotiao é um objeto Carro.
        //
        System.out.println(" Carro do Tião:");
        //
        linha.inLine();
        carroDoTiao.inVar();
        linha.fiLine();
        linha.soLine();
        System.out.println(carroDoTiao.toString());
        //
        carroDoTiao.calculoViagem();
        //
            /*
                String resposta = " COR: "    + cor    + "\n" +
                                  " MARCA: "  + marca  + "\n" +
                                  " MODELO: " + modelo + "\n" ;
                System.out.println(resposta);
            */
        //
    }
}