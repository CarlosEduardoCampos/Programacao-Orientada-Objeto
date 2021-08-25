package controllers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import modelo.BancoDados;

public class ConexaoBD implements InterfaceBD
{
	private BancoDados servidor = null;
	//
	public ConexaoBD(BancoDados infoData) {
		// TODO Auto-generated constructor stub
		this.servidor = infoData;
	}

	@Override
    public Connection conectar()
	{
		try
		{
			return
			(
				DriverManager.getConnection
				(
					"jdbc:mysql://localhost/bd_aula",
					this.servidor.getUser(),
					this.servidor.getPassWord()
				)
			);
        } catch (SQLException e) {
            throw new RuntimeException(e);
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

	@Override
	public Connection conectar(BancoDados servidor) {
		// TODO Auto-generated method stub
		return null;
	}
}
