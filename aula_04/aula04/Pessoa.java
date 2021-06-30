package aula04;
import java.util.Scanner;
// objeto para gerenciamento dos dados de pessoa
public class Pessoa {
	// Inicia objetos
	Scanner input = new Scanner(System.in);
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
    	return "\n>>> Pessoas : \n"
    		+ " CPF         =  "   + this.getCpf()   + "\n" 
       		+ " Nome        =  "   + this.getNome()  + "\n"
       		+ " E-mail      =  "   + this.getEmail() + "\n"
       		+ " Naceu em    =  "   + this.getNaciDataDia() + " / "
   								   + this.getNaciDataMes() + " / "
   								   + this.getNaciDataAno() + " \n ";
    }
    // Método que recebe os dados do objeto Pessoa
    public void setTodosDadosPessoa()
    {
    	System.out.print("\n");
    	//
    	System.out.print(" CPF: ");
    	String cpf  = input.nextLine();
    	setCpf(cpf);
    	//
    	System.out.print(" NOME: ");
    	String nome = input.nextLine();
    	setNome(nome);
    	//
    	System.out.print(" E-MAIL: ");
    	String email = input.nextLine();
    	setEmail(email);
    	//
    	int dataDia;
    	int dataMes;
    	int dataAno;
		//
		System.out.print(" DIA: ");
		dataDia = Integer.parseInt(input.nextLine());
		System.out.print(" MES: ");
        dataMes = Integer.parseInt(input.nextLine());
        System.out.print(" ANO: ");
        dataAno = Integer.parseInt(input.nextLine());
        //
    	setNaciDataDia(dataDia);
        setNaciDataMes(dataMes);
        setNaciDataAno(dataAno);
    }
}
