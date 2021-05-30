// PRIMEIRA CLASSE:
public class App {
    public static void main(String[] args) throws Exception {
        /* Escreve o texto entre parenteses no console de execução:
        System.out.println(" >>> Hello, World! ");
        */
        //int a = 5; // variavel com valor numerico inteiro
        /* 
        a = 5 + 11;
        ///
        System.out.println(" O valor de a é: " + a);
        ///
        a = a * 2;
        ///
        System.out.println(" O valor de a é: " + a);
        ///
        // Estrutura de decisão:
        if(a < 10)
        {
            System.out.println(" 'a' é menor que 10 ");
        }else{
            System.out.println(" 'a' é maior que 10 ");
        }
    */
    /*
    // Estrutura de repetição: 
        for( int x = 0; x < 10; x++)
        {
            System.out.println(" X >>> " + x);
        }
    */
    // Criação de Array(vetor):
        int[] vetor = new int[10];
        ///
        for(int a = 0; a < vetor.length; a++)
        {
            vetor[a] = a;
        }
        System.out.println(" Array >>> " + vetor[1]);
        /// Array de Array:
        int[][] matriz = new int[2][3];
        int g = 0;
        ///
        for(int i = 0; i < matriz.length; i++)
        {
            System.out.println(" Linha: " + g++);
            ///
            for(int j = 0; j < matriz[i].length; j++)
            {
                matriz[i][j] = i+j;
                ///
                System.out.println(" Valores da coluna:");
                System.out.println(matriz[i][j]);
            }
        }

    }

}
