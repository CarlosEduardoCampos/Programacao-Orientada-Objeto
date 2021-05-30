package montadora;
//
public class fabrica {
    // Método main para iniciar programa:
    public static void main(String[] args)
    {
        // Instaciar objetos:
        toLine linha = new toLine();// linhas personalizadas.
        Carro carroDoJao = new Carro(); // carroDoJao é um objeto.
        Carro carroDoZe = new Carro(); // carroDoZe objeto.
        Carro carroDoTiao = new Carro();
        //
        linha.inLine();
        carroDoJao.andar();
        carroDoJao.parar();
        linha.fiLine();
        // Inserir informações dos objetos carros.
        /*
        System.out.println(" Carro do Jão:");
        //
        linha.inLine();
        carroDoJao.inVar();
        linha.fiLine();
        linha.soLine();
        System.out.println(carroDoJao.toString());// Mostrar informações dos objetos carros.
        //
        System.out.println(" Carro do Zé:");
        //
        linha.inLine();
        carroDoZe.inVar();
        linha.fiLine();
        linha.soLine();
        System.out.println(carroDoZe.toString());
        //
        */
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