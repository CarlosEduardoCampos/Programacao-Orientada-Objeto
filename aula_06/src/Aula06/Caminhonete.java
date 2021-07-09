package Aula06;
public class Caminhonete extends Veiculo
{
    private float valorDiario;
    private float fatorRisco;
    
    public Caminhonete(String modelo, String placa, float valorDiario, float fatorRisco)
    {
        super(modelo, placa);
        this.valorDiario = valorDiario;
        this.fatorRisco = fatorRisco;
    }

    public float calcularAluguel(int numDia)
    {
        return this.valorDiario * numDia + this.fatorRisco;
    }
}
