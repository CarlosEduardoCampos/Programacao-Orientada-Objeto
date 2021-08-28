package modelo;

public class BancoDados
{
	//Atributos
	private String dataBase;
	private String localHost;
	private String passWord;
	private String user;
	private int porta;
	
	//Costrutor
	public BancoDados(String host, String dataBase, String user, String passWord, int porta)
	{
		this.localHost = host;
		this.dataBase  = dataBase;
		this.porta	   = porta;
		this.user 	   = user;
		this.passWord  = passWord;
		this.porta     = porta;
	}

	//parametro porta padrão 3306
	//todos os dados menos porta seram passados na chamado do objeto
	public BancoDados(String host, String usuario, String senha, String dataBase)
	{//inicio executavel
		this.localHost= host;
		this.user	  = usuario;
		this.passWord = senha;
		this.dataBase = dataBase;
		this.porta    = 3306;
	}//fim executavel

	//parametro porta padrão 3306
	//parametro usuario padrão root
	//todos os dados menos porta e usuario seram passados na chamada do objeto
	public BancoDados( String host, String senha, String dataBase)
	{//inicio executavel
		this.localHost = host;
		this.user      = "root";
		this.passWord  = senha;
		this.dataBase  = dataBase;
		this.porta     = 3306;
	}//fim executavel

	//parametro porta padrão 3306
	//parametro usuario padrão root
	//parametro senha padrão root
	//Na chamada do objeto e necessario infomar somente host e dataBase
	public BancoDados( String host, String dataBase)
	{//inicio executavel
		this.localHost = host;
		this.user      = "root";
		this.passWord  = "root";
		this.dataBase  = dataBase;
		this.porta     = 3306;
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
	
	//GETS END SETS DATABASE
	public String getDataBase() {
		return dataBase;
	}
	public void setDataBase(String dataBase) {
		this.dataBase = dataBase;
	}

	//Metodos
	public String ToString()
	{
		return (
			"Host:     " + this.localHost +"\n"+
			"Usuario:  " + this.user  +"\n"+
			"Senha:    " + this.passWord    +"\n"+
			"DataBase: " + this.dataBase +"\n"+
			"Porta:    " + this.porta    +"\n"
		);
	}//fim função ToString()	
}
