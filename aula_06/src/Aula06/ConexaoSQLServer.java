package Aula06;

public class ConexaoSQLServer implements InterfaceBD
{
	@Override
	public void conectar(String servidor)
	{
		System.out.println(" SQLServer conectar: " + servidor + "\n");
	}
	@Override
	public void executar(String SQL)
	{
		System.out.println(" SQLServer executar: " + SQL + "\n");
	}
	@Override
	public void desconectar(String servidor)
	{
		System.out.println(" SQlLerver desconectar: " + servidor + "\n");
	}
}
