package Aula06;
/*
 * Essa � uma classe que cont�m apenas o 'CONTRTATO' de cria��o de fun��es
 * que ser�o utilizados por quem chamr esta. A classe que utilizar esta
 * interface estar� 'COMPROMETIDA' a utilizar/implementar os m�todos
 * contidos nela.
*/
public interface InterfaceBD 
{
	public void conectar(String servidor);
	public void executar(String SQL);
	public void desconectar(String servidor);
}
