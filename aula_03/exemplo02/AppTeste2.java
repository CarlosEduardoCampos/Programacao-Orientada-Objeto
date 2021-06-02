package exemplo02;

public class AppTeste2 {
    public static void main(String[] args) 
    {
        Documentos d1, d2, d3;
        //
        d1 = new Documentos( 1, "Teste1");
        d2 = new Documentos( 2, "Teste2");
        d3 = new Documentos( 3, "Teste3");
        //
        d1.exibirDados("d1");
        // alterando objeto
        d1.setStatus(Documentos.AGUARDANDO_AUTORIZACAO);
        d1.setAssinatura(Assinatura.DIRETOR);
        //
        //d2.exibirDados("d2");
        d1.exibirDados("d1");
        //
        Impressao.imprimirTexto(" Nosso testo na tela!");
        Impressao.somarDoisValores(10, 8);
        Impressao.imprimirDoc(d1);
    }
}
