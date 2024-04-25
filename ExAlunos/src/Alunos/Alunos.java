package Alunos;

public class Alunos {

	int ra;
	String name;
	boolean matriculado; 



	
	public int getRa() {
		return ra;
	}
	
	
	
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	
	
	public String getName() {
		return name;
	}
	
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public boolean isMatriculado() {
		return matriculado;
	}
	
	
	
	public void setMatriculado(boolean matriculado) {
		this.matriculado = matriculado;
	}
	
	
	
	public Alunos(int ra, String name,boolean matriculado) {
		this.ra = ra;
		this.name = name;
		this.matriculado = matriculado;
	}
	
	public void imprimir() {
		System.out.println("RA: "+ this.ra);
		System.out.println("Nome: "+ this.name);
		System.out.println("Matricula: "+ this.matriculado);
	}
}