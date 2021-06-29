package aula04;
// herda objeto pessoa, e gerencia os dados de funcionario
public class Funcionario extends Pessoa{
	// Atributos do objetos
    private int contratoDataDia;
    private int contratoDataMes;
    private int contratoDataAno;
    private float salario;
    /// Mètodo costrutor
    public Funcionario(String nome, String email,String cpf, int dataDia, int dataMes, int dataAno, int contratoDataDia, int contratoDataMes, int contratoDataAno, float salario)
    {
    	super(nome,email,cpf,dataDia,dataMes,dataAno);
        this.contratoDataDia = contratoDataDia;
        this.contratoDataMes = contratoDataMes;
        this.contratoDataAno = contratoDataAno;
        this.salario = salario;
    }
    /// Métodos set
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
}
