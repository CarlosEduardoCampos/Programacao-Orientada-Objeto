package montadora01;

import montadora02.Carro;
import montadora02.toLine;

//
public class fabrica {
    // Método main para iniciar programa:
    public static void main(String[] args)
    {
        // Instaciar objetos:
        toLine linha = new toLine();// linhas personalizadas.
        Carro carroDoJao = new Carro(); // carroDoJao é um objeto.
        Carro carroDoZe = new Carro(); // carroDoZe objeto.
        //
        linha.inLine();
        carroDoJao.andar();
        carroDoJao.parar();
        linha.fiLine();
        // Inserir informações dos carros.
        System.out.println(" Carro do Jão:");
        //
        linha.inLine();
        carroDoJao.inVar();
        linha.fiLine();
        //
        System.out.println(" Carro do Zé:");
        //
        linha.inLine();
        carroDoZe.inVar();
        linha.fiLine();
        //
        linha.soLine();
        System.out.println(carroDoJao.toString());
        linha.soLine();
        System.out.println(carroDoZe.toString());
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