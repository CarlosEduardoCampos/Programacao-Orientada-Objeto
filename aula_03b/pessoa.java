public class pessoa {
    //Atributos
    public String nome;
    public String telefone;
    public String email;
    //
    private int id;
    private String senha = "123mudar";
    private String numTelegram;
    // Get set
    public void setSenha(String s)
    {
        this.senha = s;
    }
    //
    public void setNumTelegram(String s)
    {
        this.numTelegram = s;
    }
    //
    public String getNumTelegram()
    {
        return this.numTelegram;
    }
    //
    public int getId()
    {
        return this.id;
    }
    public int soma(int x, int y) 
    {
        int soma = x + y;
        return soma;
    }
}
