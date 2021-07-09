package src.Aula64;
/* Tipo generico de class
 todo metodo e placa. <==Herança
*/
public abstract class Veiculo {
    //Atributos
    private String modelo;
    private String placa;

    //Construtor
    public Veiculo(String modelo, String placa)
    {
        this.modelo = modelo;
        this.placa = placa;
    }

    //GET SET
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //Método
    /*
     *Esse metodo não tem logica de programação:
     * - Toda class que herdar essa class e obrigado a criar o método 
     * cacularAluquel(int numDia) e adicionar a lógica.(Regra de negócio)
    */
    public abstract float cacularAluguel(int numDia);
}
