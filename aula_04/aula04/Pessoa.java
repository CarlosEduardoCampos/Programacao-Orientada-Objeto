package aula04;
// objeto para gerenciamento dos dados de pessoa
public class Pessoa {
    // Atributos do objeto
    private String email;
    private String nome;
    private String cpf;
    private int naciDataDia;
    private int naciDataMes;
    private int naciDataAno;
    //
    public Pessoa(String email, String nome, String cpf, int naciDataDia, int naciDataMes, int naciDataAno)
    {
        this.email = email;
        this.nome = nome;
        this.naciDataDia = naciDataDia;
        this.naciDataMes = naciDataMes;
        this.naciDataAno = naciDataAno;
        this.cpf = cpf;
    }
    /// Métodos set
    public void setEmail(String email){
        this.email = email;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNaciDataDia(int naciDataDia)
    {
        this.naciDataDia = naciDataDia;
    }
    public void setNaciDataMes(int naciDataMes)
    {
        this.naciDataMes = naciDataMes;
    }
    public void setNaciDataAno(int naciDataAno)
    {
        this.naciDataAno = naciDataAno;
    }
    /// Método get
    public String getEmail(){
        return this.email;
    }
    public String getnome() {
        return this.nome;
    }
    public String getCpf() {
        return this.cpf;
    }
    public int getNaciDataDia()
    {
        return this.naciDataDia;
    }
    public int getNaciDataMes()
    {
        return this.naciDataMes;
    }
    public int getNaciDataAno()
    {
        return this.naciDataAno;
    }
}
