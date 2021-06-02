package exemplo02;

public class Impressao
{
    public static void imprimirTexto(String txt)
    {
        System.out.println(" MÉTODO STATIC: " + txt);
    }
    //
    public static void somarDoisValores(int x, int y)
    {
       int soma = x + y;
       System.out.println(" Nosso calculo " + soma); 
    }
    //
    public static void imprimirDoc(Documentos documentos)
    {
        String status = "";
        switch (documentos.getStatus()) {
            case 0:
                status = " Novo Documento ";
                break;

            case 1:
                status = " Em processamento ";
                break;
            
            case 2:
                status = " Aguardando autorização ";
                break;
            
            case 3:
                status = " Aguardando autorização ";
                break;
            default:
                status = " Erro ao agregar valor de status ";
                break;
        }
        //
        String ass;
        switch (documentos.getAssinatura()) {
            case 0:
                ass = " DIRETOR ";
                break;

            case 1:
                ass = " SUPERVISOR ";
                break;
            
            case 2:
                ass = " COORDENADOR ";
                break;
            
            case 4:
                ass = " NãO ASSINADO ";
                break;
            default:
                ass = " Assinatura não registrada ";
                break;
        }
        //
        String res = "Objeto: "     + documentos.getNome() + "\n" +
                     "Id: "         + documentos.getId()   + "\n" +
                     "Status: "     + status               + "\n" +
                     "Assinatura: " + ass                  + "\n" ;
        //
        System.out.println(res);
    }
}
