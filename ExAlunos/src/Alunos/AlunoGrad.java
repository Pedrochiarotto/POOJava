package Alunos;

public class AlunoGrad extends Alunos {

	double media;


	public double getMedia() {
		return media;
	}


	public void setMedia(double media) {
		this.media = media;
	}
	
	public AlunoGrad(int ra,String name,boolean matriculado, double media) {
		super(ra,name,matriculado);
		this.media = media;
	}
	
	public void imprimir() {
		super.imprimir();
		System.out.println("Media: "+ this.media);
	}
	
}
