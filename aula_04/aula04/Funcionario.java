package aula04;
import java.util.Scanner;
// herda objeto pessoa, e gerencia os dados de funcionario
public class Funcionario extends Pessoa{
	// Inicia objetos
	Scanner input = new Scanner(System.in);
	// Atributos do objetos
    private int contratoDataDia;
    private int contratoDataMes;
    private int contratoDataAno;
    private float salario;
    /// Mètodo costrutor
    public Funcionario(String nome, String email,String cpf, int dataDia, int dataMes, int dataAno, int contratoDataDia, int contratoDataMes, int contratoDataAno, float salario)
    {
    	super(nome,email,cpf,dataDia,dataMes,dataAno);// linha obrigatorias para super class
        this.contratoDataDia = contratoDataDia;
        this.contratoDataMes = contratoDataMes;
        this.contratoDataAno = contratoDataAno;
        this.salario = salario;
    }
    // Métodos set
    public void setContratoDataDia(int contratoDataDia)
    {
        this.contratoDataDia = contratoDataDia;
    }
    public void setContratoDataMes(int contratoDataMes)
    {
        this.contratoDataMes = contratoDataMes;
    }
    public void setContratoDataAno(int contratoDataAno)
    {
        this.contratoDataAno = contratoDataAno;
    }
    public void setSalario(float salario)
    {
        this.salario = salario;
    }
    /// Metodo get
    public int getContratoDataDia()
    {
        return this.contratoDataDia;
    }
    public int getContratoDataMes()
    {
        return this.contratoDataMes;
    }
    public int getContratoDataAno()
    {
        return this.contratoDataAno;
    }
    public float getSalario()
    {
        return this.salario;
    }
    public String toString()
    {
    	return "\n>>> Funcionarios : \n"
    		 + " CPF          =  "  + this.getCpf()   + "\n" 
    		 + " Nome         =  "  + this.getNome()  + "\n"
    		 + " E-mail       =  "  + this.getEmail() + "\n"
    		 + " Naceu em     =  "  + this.getNaciDataDia() + " / "
								   + this.getNaciDataMes() + " / "
								   + this.getNaciDataAno() + "\n"
			 + " Cotratado em =  "  + this.getContratoDataDia() + " / "
					 			   + this.getContratoDataMes() + " / "
					 			   + this.getContratoDataAno() + "\n" 
			 + " Salario      =  R$ " + this.getSalario();
    }
    // Métodos que prenche todos os dados do objeto funcionario
    public void setTodosDadosFuncionario()
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
    	for(int i = 0; i < 2; i++)
    	{
    		if(i == 0) {System.out.println(" Data de nacimeto: ");}
    		//
    		else {System.out.println("Data de contratação: ");}
    		//
    		System.out.print(" DIA: ");
    		dataDia = Integer.parseInt(input.nextLine());
    		System.out.print(" MES: ");
            dataMes = Integer.parseInt(input.nextLine());
            System.out.print(" ANO: ");
            dataAno = Integer.parseInt(input.nextLine());
            //
            if(i == 0)
            {
            	setNaciDataDia(dataDia);
                setNaciDataMes(dataMes);
                setNaciDataAno(dataAno);
            }
            else {
            	setContratoDataDia(dataDia);
            	setContratoDataDia(dataMes);
            	setContratoDataDia(dataAno);
            }
            
    	}
    	System.out.print(" SALARIO: ");
        float salario = Integer.parseInt(input.nextLine());
        setSalario(salario);
    }
}
