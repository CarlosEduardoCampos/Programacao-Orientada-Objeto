package Aula06;
/*
 * Essa é uma classe que contêm apenas o 'CONTRTATO' de criação de funções
 * que serão utilizados por quem chamr esta. A classe que utilizar esta
 * interface estará 'COMPROMETIDA' a utilizar/implementar os métodos
 * contidos nela.
*/
public interface InterfaceBD 
{
	public void conectar(String servidor);
	public void executar(String SQL);
	public void desconectar(String servidor);
}
