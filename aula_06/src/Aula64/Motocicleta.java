package src.Aula64;

//Na locadora o aluguelde motocicleta tem desconto de x% n diária
public class Motocicleta extends Veiculo
{   
    //Atributos
    private float valorDiaria;
    private float valorDesconto;

    //Construtor
    public Motocicleta(String modelo, String placa, float valorDiaria, float valorDesconto)
    {
        super(modelo, placa);
        this.valorDiaria = valorDiaria;
        this.valorDesconto = valorDesconto;
    }

    //GET SET
    public float getValorDiaria() {
        return valorDiaria;
    }
    public float getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    //Método
    public float calcularAluguel(int numDia)
    {
        return this.valorDiaria * numDia - (this.valorDiaria * numDia * 10 / 100);
    }
}
