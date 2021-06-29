package aula04;
// herda objeto pessoa, e gerencia os dados de funcionario
public class Funcionario {
    private int contratoDataDia;
    private int contratoDataMes;
    private int contratoDataAno;
    private float salario;
    //
    public Funcionario(int contratoDataDia, int contratoDataMes, int contratoDataAno, float salario)
    {
        this.contratoDataDia = contratoDataDia;
        this.contratoDataMes = contratoDataMes;
        this.contratoDataAno = contratoDataAno;
        this.salario = salario;
    }
    /// Metodos set
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
