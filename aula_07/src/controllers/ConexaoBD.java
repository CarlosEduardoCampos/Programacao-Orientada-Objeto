package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.jar.JarException;

import javax.swing.JOptionPane;

import modelo.BancoDados;

public class ConexaoBD implements InterfaceBD
{
	//Atributos de conexa com o banco
	private BancoDados infodata = new BancoDados("localhost", "bd_aula", "root", "pass1386", 3307);
	
	@Override
    public Connection conectar()
	{
		try {//Tentar estabelecer a conex?o
			Connection conn = DriverManager.getConnection(
				"jdbc:mysql:"+
				this.infodata.getLocalHost()+":"+
				this.infodata.getPorta()+"/"+
				this.infodata.getDataBase()+"?serverTimezone=UTC",//linha de conexao
				this.infodata.getUser(),						 //User do MySql
				this.infodata.getPassWord()				        //PassWord do MySql
			);
			return conn;
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(
				null, "Erro ao conectar no banco!"+ e.getMessage()
			);
			return null;
		}
    }

    @Override
    public void executar(String SQL) {

        // TODO Auto-generated method stub
    }

    @Override
    public void desconectar(String servidor) {

        // TODO Auto-generated method stub

    }
}
