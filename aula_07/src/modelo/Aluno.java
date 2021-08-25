package modelo;

public class Aluno extends Pessoa
{
	// Atributos
	public  String matricula;
	
	// Construtor
	public Aluno (){ }
	//
	public  Aluno ( String  nome , String  email , Integer  idade , String  matricula ) {
		super (nome, email, idade);		
		this.matricula = matricula;
	}
	
	// Get Set
	public  String  getMatricula () {
		return  this.matricula;
	}
	
	public  void  setMatricula ( String  matricula ) {
		this.matricula = matricula;
	}
}
