package aula04;
// class do progrmaprincipal
public class App04 {
    public static void main(String[] args) {
        Pessoa usuario = new Pessoa(" Nome1 ", " EmailAlgumaCoisa@email.com ", "123.456.789-00", 30, 12, 9999);
        Funcionario colaborador = new Funcionario(" Nome2 "," EmailAlgumaCoisa@email.com ", "123.456.789-00",  30, 12, 9999, 30, 12, 9999, 1100);
        //
        System.out.println(colaborador.toString());
        //
        colaborador.setNome(" Nome do Funcionário ");
        //
        System.out.println(colaborador.toString());
    }
}
