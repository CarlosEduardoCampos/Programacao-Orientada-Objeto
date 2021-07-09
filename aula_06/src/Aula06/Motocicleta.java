package Aula06;
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
    ///Valor da diaria
    public float getValorDiaria() {
        return valorDiaria;
    }
    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }
    ///Valor do Desconto (%)
    public float getValorDesconto() {
        return valorDesconto;
    }
    public void setValorDesconto(float valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public float calcularAluguel(int numDia)
    {
        return this.valorDiaria * numDia - (this.valorDiaria * numDia * (this.valorDesconto / 100));
    }
}
