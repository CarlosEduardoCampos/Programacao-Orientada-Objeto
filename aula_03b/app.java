public class app {
    public static void main(String[] args) {
        pessoa p = new pessoa();
        //grafando novo usuario:
        p.nome = "Eduardo";
        p.email = "Email@hotmail.com";
        p.telefone = "(37) 999180703";
        //qual omeu id
        int i = p.getId();
        String n = p.getNumTelegram();
        //
        System.out.println(" Programa Java: ");
        //
        p.setSenha(" Nova senha: ");
        //
        int resposta = p.soma(10,10);
        //
        System.out.println(" "+ resposta +" \n");
    }
}