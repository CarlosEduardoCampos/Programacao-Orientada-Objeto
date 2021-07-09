package src.Aula64;
//
public class Carro extends Veiculo
{
    //Atributos
    private float valorDiaria;

    //Costrutor
    public Carro(String modelo, String placa, float valorDiaria)
    {
        super(modelo,placa);
        //
        this.valorDiaria = valorDiaria;

    }
    
    //Método
    public float calcularAluguel(int numDia)
    {
        return this.valorDiaria * numDia;
    }
}
