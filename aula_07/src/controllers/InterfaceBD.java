package controllers;

import java.sql.Connection;

public interface InterfaceBD
{
	public Connection conectar();

	public void executar(String SQL);

	public void desconectar(String servidor);
}
