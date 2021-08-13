package modelo;

public class BancoDados
{
	//Atributos
	private String localHost;
	private String passWord;
	private String user;
	private int porta;
	
	//Costrutor
	public BancoDados(String localHost, int porta, String user, String passWord)
	{
		this.localHost = localHost;
		this.porta = porta;
		this.user = user;
		this.passWord = passWord;
	}
	
	//GETS END SETS HOST
	public String getLocalHost() {
		return localHost;
	}
	public void setHost(String host) {
		this.localHost = host;
	}
	
	//GETS END SETS PORTA
	public int getPorta() {
		return porta;
	}
	public void setPorta(int porta) {
		this.porta = porta;
	}
	
	//GETS END SETS USER
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	
	//GETS END SETS PASSWORD
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	@SuppressWarnings("unused")
	public void conexao()
	{
		//Atributos 
		String host = getLocalHost();
		String passWord = getPassWord();
		String user = getUser();
		int porta = getPorta();
	}
	
	public void Executar()
	{
		
	}
	
	public void desconectar()
	{
		
	}
}
