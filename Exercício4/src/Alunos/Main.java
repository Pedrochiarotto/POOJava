package Alunos;

public class Main {

	public static void main(String[] args) {
		
		Alunos a = new Alunos(115133, "Pedro", true);
		a.imprimir();
		
		AlunoGrad ag = new AlunoGrad(115122,"Caik",true, 10);
		ag.imprimir();
		
		AlunoPosGrad apg = new AlunoPosGrad(115144, "Raul",false,"Diego Negretto", "Corinthians melhor que Palmeiras");
		apg.imprimir();
	}

}
