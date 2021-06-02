package exemplo02;

public class Documentos 
{
    // Atributos do Objeto
    private int id;
    private String nome;
    private int status;
    private int assinatura;
    /* Status
        0 - Novo Documentos
        1 - Em processamento
        2 - Aguardando autorização
        3 - Finalizado
    */
    // Atributos státicos
    // final torna as variaveis imutáveis
    public final static int NOVO_DOCUMENTO         = 0; // valor imutável, porém devo declarar o valor
    public final static int Em_PROCESSAMENTO       = 1;
    public final static int AGUARDANDO_AUTORIZACAO = 2;
    public final static int FINALIZANDO            = 3;
    // Métodos construtor
    public Documentos( int id, String nome)
    {
        this.id   = id;
        this.nome = nome;
        this.status = NOVO_DOCUMENTO;
        this.assinatura = Assinatura.NAO_ASSINADO;
    }
    // Métodos get e set
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return this.id;
    }
    public void setNome( String nome)
    {
        this.nome = nome;
    }
    public String getNome()
    {
        return this.nome;
    }
    public void setStatus(int status)
    {
        this.status =status;
    }
    public int getStatus()
    {
        return this.status;
    }
    public void setAssinatura( int assinatura)
    {
        this.assinatura = assinatura;   
    }
    public int getAssinatura()
    {
        return this.assinatura;   
    }
    // Método que imprime o dados
    public void exibirDados(String nomeObjeto)
    {
        String res = "Nome: "       + nomeObjeto      + "\n" +
                     "Id: "         + this.id         + "\n" +
                     "Status: "     + this.status     + "\n" +
                     "Assinatura: " + this.assinatura + "\n" ;
        //
        System.out.println(res);
    }
}
