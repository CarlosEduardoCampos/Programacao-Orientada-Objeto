package modelo;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		PreparedStatement stmt = null;
		
		if(modo == 0)
		{
			try {
				stmt = conn.prepareStatement("INSERT INTO tb_Aluno(matricula, nome, email, idade) Value(?,?,?,?)");
				stmt.setString(1, getMatricula());
				stmt.setString(2, getNome());
				stmt.setString(3, getEmail());
				stmt.setInt(4, getIdade());
			}
			catch (SQLException e) {
				JOptionPane.showMessageDialog(
					null, "Erro ao preparar comando INSERT no banco!"+ e.getMessage()
				);
			}
		}
		else {
			try {
				stmt = conn.prepareStatement("UPDATE tb_Aluno SET codigo=?, matricula=?, nome=?, email=?, idade=?");
				stmt.setInt(1,1);
				stmt.setString(2, getMatricula());
				stmt.setString(3, getNome());
				stmt.setString(4, getEmail());
				stmt.setInt(5, getIdade());
			}
			catch (SQLException e) {
				JOptionPane.showMessageDialog(
					null, "Erro ao preparar comando INSERT no banco!"+ e.getMessage()
				);
			}
		}
		
		try{
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
	
	public Aluno getDadosForm(int idAnt, Integer operacao)
	{
		String sql = "";
        String op = "";
        String ordenacao = "";
        ResultSet res = null;
        Statement st = null;
        //
        switch(operacao){
            case 0: 
                op = ">"; 
                ordenacao = " order by id asc ";
                break;
            case 1: 
                op = "<"; 
                ordenacao = " order by id desc ";
                break;
        }
		//
		String sql1 = "SELECT * FROM tb_Aluno WHERE codigo="+ op + " " + idAnt + ordenacao + " limit 1";
		try {
			st = conn.createStatement();
		}
		catch (SQLException e) {
			JOptionPane.showMessageDialog(
				null, "Erro ao preparar comando SELECT no banco!"+ e.getMessage()
			);
		}
		
		try {
			res = st.executeQuery(sql1);
			//
			Aluno aluno = new Aluno();
			//posiciona resultset na proxima posição
			if(res != null)
			{
				while(res.next())
				{
					//Alimenta objeto com dados do banco
					aluno.setCodigo(res.getString("codigo"));
					aluno.setMatricula(res.getString("matricula"));
					aluno.setNome(res.getString("nome"));
					aluno.setIdade(res.getInt("idade"));
					//
				}
			}
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
	public void setCodigo(String codigo) {
		this.codigo = Integer.parseInt(codigo);
	}
}
