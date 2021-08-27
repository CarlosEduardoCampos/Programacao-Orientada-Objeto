package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controllers.ConexaoBD;

public class Aluno extends Pessoa
{
	// Atributos
	private ConexaoBD conexao;
	private Connection conn;
	public  String matricula;
	
	// Construtor
	public Aluno (){ }
	//
	public  Aluno ( String  nome , String  email , Integer  idade , String  matricula ) {
		super (nome, email, idade);		
		this.matricula = matricula;
		this.conexao = new ConexaoBD();
		this.conn = this.conexao.conectar();
	}
	
	// Get Set
	public  String  getMatricula () {
		return  this.matricula;
	}
	
	public  void  setMatricula ( String  matricula ) {
		this.matricula = matricula;
	}
	
	public void salvarDadosForm(int modo)
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
		}
		catch (SQLException e)
		{
			JOptionPane.showMessageDialog(
				null, "Erro ao executar comando INSERT ou UPDATE no banco!"+ e.getMessage()
			);
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
			aluno.setId(id);
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
}
