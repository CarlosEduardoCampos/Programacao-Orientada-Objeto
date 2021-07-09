package Aula06;

public class ConexaoMySQL implements InterfaceBD
{
	@Override
	public void conectar(String servidor)
	{
		System.out.println(" MySQL conectar: " + servidor + "\n");
	}
	@Override
	public void executar(String SQL)
	{
		System.out.println(" MySQL executar: " + SQL + "\n");
	}
	@Override
	public void desconectar(String servidor)
	{
		System.out.println(" MySQL desconectar: " + servidor + "\n");
	}
}
