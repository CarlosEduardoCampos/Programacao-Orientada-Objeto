package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controllers.ConexaoBD;

public class Aluno
{
	// Atributos
	private ConexaoBD conexao;
	private Connection conn;
	//
	private Integer codigo;
	private String  nome ;
	private String  email;
	private Integer idade;
	public  String matricula;
	
	// Construtor
	public Aluno (){ }
	//
	public  Aluno ( String codigo, String  nome , String  email , String  idade , String  matricula )
	{
		this.codigo    = Integer.parseInt(codigo);
		this.nome      = nome;
		this.email     = email;
		this.idade     = Integer.parseInt(idade);
		this.matricula = matricula;
		//
		this.conexao = new ConexaoBD();
		this.conn = this.conexao.conectar();
	}
	// Get Set
	public  String  getNome () {
		return nome;
	}

	public  void  setNome ( String  nome ) {
		this . nome = nome;
	}
	// Get Set
	public  String  getEmail () {
		return email;
	}

	public  void  setEmail ( String  email ) {
		this . email = email;
	}
	// Get Set
	public  Integer  getIdade () {
		return idade;
	}

	public  void  setIdade ( Integer  idade ) {
		this . idade = idade;
	}
	// Get Set
	public  String  getMatricula () {
		return  this.matricula;
	}
	
	public  void  setMatricula ( String  matricula ) {
		this.matricula = matricula;
	}
	
	public boolean salvarDadosForm(int modo)
	{
		String sql = "";
		if(modo == 0)
		{
			sql = "INSERT INTO tb_aula("+
				this.getMatricula()  +","+
				this.getNome()       +","+
				this.getEmail()      +","+
				this.getIdade()		 +");";
		}
		else {
			sql = "UPDATE tb_aula SET"+
				"nome="  +this.getNome()       +","+
				"email=" +this.getEmail()      +","+
				"idade=" +this.getIdade()	   +","+
				"WHERE matricula="  +this.getMatricula()  +";";
		}
		
		try{
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.execute();
			return true;
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(
				null, "Erro ao executar comando INSERT ou UPDATE no banco!"+ e.getMessage()
			);
			return false;
		}
	}
	
	public Aluno getDadosForm(int id)
	{
		String sql = "SELECT * FROM bd_aula WHERE id = ?";
		
		try {
			PreparedStatement stmt = this.conn.prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
			//
			Aluno aluno = new Aluno();
			//posiciona resultset na primeira posição
			rs.first();
			//Alimenta objeto com dados do banco
			aluno.setCodigo(id);
			aluno.setMatricula(rs.getString("matricula"));
			aluno.setNome(rs.getString("nome"));
			aluno.setIdade(rs.getInt("idade"));
			//
			return aluno;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(
				null, "Erro ao executar comando SELECT no banco!"+ e.getMessage()
			);
			return null;
		}
		
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
}
