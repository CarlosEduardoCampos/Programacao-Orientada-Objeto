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

	//parametro porta padrão 3306
	//todos os dados menos porta seram passados na chamado do objeto
	public BancoDados(string host, string usuario, string senha, string dataBase)
	{//inicio executavel
		this.host     = host;
		this.usuario  = usuario;
		this.senha    = senha;
		this.dataBase = dataBase;
		this.porta    = 3306;
	}//fim executavel

	//parametro porta padrão 3306
	//parametro usuario padrão root
	//todos os dados menos porta e usuario seram passados na chamada do objeto
	public BancoDados( string host, string senha, string dataBase)
	{//inicio executavel
		this.host     = host;
		this.usuario  = "root";
		this.senha    = senha;
		this.dataBase = dataBase;
		this.porta    = 3306;
	}//fim executavel

	//parametro porta padrão 3306
	//parametro usuario padrão root
	//parametro senha padrão root
	//Na chamada do objeto e necessario infomar somente host e dataBase
	public BancoDados( string host, string dataBase)
	{//inicio executavel
		this.host     = host;
		this.usuario  = "root";
		this.senha    = "root";
		this.dataBase = dataBase;
		this.porta    = 3306;
	}//fim executavel
	
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

	//Metodos
	public string ToString()
	{
		return (
			"Host:     " + this.host     +"\n"+
			"Usuario:  " + this.usuario  +"\n"+
			"Senha:    " + this.senha    +"\n"+
			"DataBase: " + this.dataBase +"\n"+
			"Porta:    " + this.porta    +"\n"
		);
	}//fim função ToString()	
	
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
