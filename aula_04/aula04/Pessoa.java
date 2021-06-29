package aula04;
// objeto para gerenciamento dos dados de pessoa
public class Pessoa {
    // Atributos do objeto
    private String nome;
    private String email;
    private String cpf;
    private int naciDataDia;
    private int naciDataMes;
    private int naciDataAno;
    //
    public Pessoa(String nome, String email, String cpf, int naciDataDia, int naciDataMes, int naciDataAno)
    {
        this.nome = nome;
        this.email = email;
        this.naciDataDia = naciDataDia;
        this.naciDataMes = naciDataMes;
        this.naciDataAno = naciDataAno;
        this.cpf = cpf;
    }
    /// Métodos set
    public void setEmail(String email){
        this.email = email;
    }
    public void setNome(String nome) {
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
    public String getNome() {
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
    public String toString()
    {
    	return ">>> Pessoas : "
    		 + " Nome      =  " + this.getNome()  + "\n"
    		 + " E-mail    =  " + this.getEmail() + "\n"
    		 + " Nacido em =  " + this.naciDataDia
    		 					+ this.naciDataMes
    		 					+ this.naciDataAno;
    }
    // Método que recebe os dados de todas as fariaveis
    /*
    public void setTodosDados()
    {
    	
    }
    */
}
