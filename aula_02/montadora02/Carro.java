package montadora02;
import java.util.Scanner; 
//
public class Carro
{
    private String cor;
    private String marca;
    private String namPro;
    private String modelo;
    private int kmRum;
    private int velMax;
    private int litComb;
    private int numPort;
    // Método construtor:
    public Carro(String cor, String marca, String modelo, String namPro, int numPort, int velMax, int litComb, int kmRum)
    {
        this.cor     = cor;
        this.kmRum   = kmRum;
        this.marca   = marca;
        this.velMax  = velMax;
        this.namPro  = namPro;
        this.modelo  = modelo;
        this.litComb = litComb;
        this.numPort = numPort;
    }
    // Método construtor com sobre carga de Métodos:
    public Carro(String cor, String marca, String modelo, String namPro, int numPort, int velMax, int litComb)
    {
        this.cor     = cor;
        this.marca   = marca;
        this.velMax  = velMax;
        this.namPro  = namPro;
        this.modelo  = modelo;
        this.litComb = litComb;
        this.numPort = numPort;
    }
    // Intaciar objetos:
    Scanner input = new Scanner(System.in);
    // Método andar.
    protected void andar()
    {
        ligar();
        System.out.println("\tCarro Andando ");
    }
    // Método parar.
    protected void parar()
    {
        System.out.println("\tCarro Parado ");
    }
    // Método Ligar.
    private void ligar()
    {
        System.out.println("\tCarro Ligado ");
    }
    // Método de  Consumo de Combistivel.
    public int consumoCombustivel(int kmCalculo, int qteLitros)
    {
        int res;
        res = kmCalculo / qteLitros;
        return res;
    }
    public void atualizaKmRum(int km)
    {
        this.kmRum = this.kmRum + km;
    }
    public void atualizaTanque(int qteLitros)
    {
        this.litComb = this.litComb - qteLitros;
    }
    // Método de viagem.
    public void calculoViagem()
    {
        int kmPercorridos;
        int litGasto;
        //
        System.out.println(" Passe as informaçõe de um viagem para que seja calculado o consumo de combustivel: ");
        // recebendo informaçõe para as var.
        System.out.print(" KM PERCORRIDOS NA VIAGEM: ");
        kmPercorridos = Integer.parseInt(input.nextLine());
        //
        System.out.print(" LITROS DE COMBUSTIVEL GASTOS NA VIAGEM: ");
        litGasto = Integer.parseInt(input.nextLine());
        //
        atualizaKmRum(kmPercorridos);
        atualizaTanque(litGasto);
        //
        System.out.println(" DEPOIS DE COMPLETAR A VIAGEM: ");
        System.out.println(toString());
        //
        System.out.println(" CONSUMO DE COMBUSTIVEL: " + consumoCombustivel(kmPercorridos, litGasto) + "Km por litro.");
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
    public int getNumPort()
    {
        return this.numPort;
    }
    public void setNumPort(int numPort)
    {
        this.numPort = numPort ;
    }
    // Métodos GETs e SETs:
    // variável
    public int getVelMax()
    {
        return this.velMax;
    }
    public void setVelMax(int velMax)
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
    // Métodos GETs e SETs:
    // variável
    public int getLitComb()
    {
        return this.litComb;
    }
    public void setLitComb(int litComb)
    {
        this.litComb = litComb ;
    }
    // Métodos GETs e SETs:
    // variável
    public int getKmRum()
    {
        return this.kmRum;
    }
    public void setKmRum(int kmRum)
    {
        this.kmRum = kmRum ;
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
        /* 
        input e um comando que recebe um valor str.
        O comando Integer.parseInt transforma o valor str em valor int.
        */
        System.out.print(" KM rodados do carro: ");
        kmRum = Integer.parseInt(input.nextLine()); // recebendo int no comando input
        //
        System.out.print(" Litros de Combustivel do carro: ");
        litComb =Integer.parseInt(input.nextLine()); // recebendo int no comando input
        //
        System.out.print(" Numero de Portas do carro: ");
        numPort = Integer.parseInt(input.nextLine()); // recebendo int no comando input
        //
        System.out.print(" Velocidade Maxima do carro: ");
        velMax =Integer.parseInt(input.nextLine()); // recebendo int no comando input
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
        return "\tPROPRIETARIO "           + namPro  + "\n" +
               " COR: "                    + cor     + "\n" +
               " MARCA: "                  + marca   + "\n" +
               " MODELO: "                 + modelo  + "\n" +
               " KM RODADOS : "            + kmRum   + "\n" +
               " NUMERO DE PORTAS: "       + numPort + "\n" +
               " VELOCIDADE MAXIMA: "      + velMax  + "\n" +
               " Litros de Combustivel: "  + litComb + "\n" ;  
    }
}