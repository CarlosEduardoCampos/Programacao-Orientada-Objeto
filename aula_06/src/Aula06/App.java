package Aula06;
//
public class App {
    public static void main(String[] args) throws Exception
    {
        //Objetos
    	/*
        Carro car_01 = new Carro("Onix","UUU111",50);
        Motocicleta mot_01 = new  Motocicleta("Titan","TYU234",40,10);
        
        System.out.println(" Veí­culo: " + car_01.getModelo()+
                           " Aluguel: R$" + car_01.calcularAluguel(5));
        //
        System.out.println(" Veí­culo: " + mot_01.getModelo()+
        				   " Aluguel: R$" + mot_01.calcularAluguel(5));
        */
    	Veiculo estoque[];//Vetor class Veiculo
    	estoque = new Veiculo[5];
    	//
    	estoque[0] = new Carro      ("Onix"  , "UUU111", 50);
    	estoque[1] = new Carro      ("Ka"    , "AAA222", 45);
    	estoque[2] = new Motocicleta("Yamaha", "BBB333", 40 , 15 );
    	estoque[3] = new Caminhonete("Fiat"  , "CCC444", 200, 100);
    	estoque[4] = new Motocicleta("Honda" , "DDD555", 50 , 20 );
    	
    	for(Veiculo v : estoque)//clona estoque na variavel v
    	{
    		System.out.println
    		(
    			" Veiculo: "       + v.getModelo()        + "\n" +
    			" Valor diária R$" + v.calcularAluguel(3) + "\n\n"
    		);
    	}
    	
    	//Simulando InterFace:
    	/*
		 * ConexaoMySQL con = new ConexaoMySQL();
	     * con.conectar("servidor");
	     * con.executar("SELECIONE * TABELA_X");
	     * con.desconectar("servidor");
    	*/
    	int qualBD = 0;//0 = MySQL; 1 - SQL Server
    	InterfaceBD conexaoBD; 
    	//
    	if(qualBD == 0)
    	{
    		conexaoBD = new ConexaoMySQL();
    	}else {
    		conexaoBD = new ConexaoSQLServer();
    	}
    	conexaoBD.conectar("servidor");
    	conexaoBD.executar("SELECIONE * TABELA_X");
    	conexaoBD.desconectar("servidor");
    }
}
