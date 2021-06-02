package exemplo01;

public class TesteStatic {
    public int atributo1;
    public int atributo2;
    //
    public static int ATRIBUTO3;
    //
    public void exibirAtributos(String nomeObjeto)
    {
        String res = "Objeto: "    + nomeObjeto + "\n" +
                     "Atributo1: " + atributo1  + "\n" +
                     "Atributo2: " + atributo2  + "\n" +
                     "Atributo3: " + ATRIBUTO3  + "\n" ;
        //
        System.out.println(res);
    }
}