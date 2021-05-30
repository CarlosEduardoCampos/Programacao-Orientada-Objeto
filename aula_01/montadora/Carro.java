package montadora;
import java.util.Scanner; 
//
public class Carro
{
    private String cor;
    private String marca;
    private String modelo;
    private String namPro;
    private String numPort;
    private String velMax;
    // Intaciar objetos:
    Scanner input = new Scanner(System.in);
    // Método:
    protected void andar()
    {
        ligar();
        System.out.println("\tCarro Andando ");
    }
    protected void parar()
    {
        System.out.println("\tCarro Parado ");
    }
    private void ligar()
    {
        System.out.println("\tCarro Ligado ");
    }
    // Métodos GETs e SETs:
    // variável
    public String getCor()
    {
        return this.cor;
    }
    public void setCor(String cor)
    {
        this.cor = cor;
    }
    // Métodos GETs e SETs:
    // variável
    public String getMarca()
    {
        return this.marca;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    // Métodos GETs e SETs:
    // variável
    public String getModelo()
    {
        return this.modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    // Métodos GETs e SETs:
    // variável
    public String getNumPort()
    {
        return this.numPort;
    }
    public void setNumPort(String numPort)
    {
        this.numPort = numPort ;
    }
    // Métodos GETs e SETs:
    // variável
    public String getVelMax()
    {
        return this.velMax;
    }
    public void setVelMax(String velMax)
    {
        this.velMax = velMax ;
    }
        // Métodos GETs e SETs:
    // variável
    public String getNamPro()
    {
        return this.namPro;
    }
    public void setNamPro(String namPro)
    {
        this.namPro = namPro;
    }
    // Método de cadastro da informação.
    public void inVar() // Recebe caracteristicas do carro.
    {
        System.out.print(" Cor do carro: ");
        cor = input.nextLine();
        setCor(cor);
        //
        System.out.print(" Marca do carro: ");
        marca = input.nextLine();
        setMarca(marca);
        //
        System.out.print(" Modelo do carro: ");
        modelo = input.nextLine();
        setModelo(modelo);
        //
        System.out.print(" Numero de Portas do carro: ");
        numPort = input.nextLine();
        //
        System.out.print(" Velocidade Maxima do carro: ");
        velMax = input.nextLine();
        //
        System.out.print(" Nome do Proprietario do carro: ");
        namPro = input.nextLine();
    }
    // Métodos print informações.
    // Mostra caracteristicas do carro.
    public String toString() // função padrão que retorna seu conteudo.
    {
        /*
            String resposta = " COR: "    + cor    + "\n" +
                              " MARCA: "  + marca  + "\n" +
                              " MODELO: " + modelo + "\n" ;
            return resposta;
         */
        return "\tPROPRIETARIO "       + namPro  + "\n" +
               " COR: "                + cor     + "\n" +
               " MARCA: "              + marca   + "\n" +
               " MODELO: "             + modelo  + "\n" +
               " VELOCIDADE MAXIMA: "  + velMax  + "\n" +
               " NUMERO DE PORTAS: "   + numPort + "\n" ;
               
    }
}