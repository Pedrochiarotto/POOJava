package Jogo;

public class LeeSin extends Personagem implements IHeroi {
	private String passiva;
	public LeeSin(String nome, int vida, int forca, int defesa,int velocidade, int magia, String passiva) {
		super(nome,180, 46,39, 10, 0);
		this.setPassiva("Agitação");
	}
	public String getPassiva() {
		return passiva;
	}

	public void setPassiva(String passiva) {
		this.passiva = passiva;
	}

	@Override
	public void atacar() {
		System.out.println("Lee sin atacou com seu hit básico.");
		
	}

	@Override
	public void esquivar() {
		System.out.println("Lee sin se esquivou com a habilidade proteger");
		
	}

	@Override
	public void usarHabilidadePrincipal() {
		System.out.println("Lee sin utilizou sua ultimate Fúria do Dragão."); 
		
	}

	@Override
	public void usarHabilidadeSecundaria() {
		System.out.println("Lee Sin utilizou sua habilidade Onda Sonica.");
		
	}
	public void ExibirPassiva() {
		System.out.println("Passiva: Agitação.");
		System.out.println("Após Lee Sin usar uma habilidade, ele recebe velocidade");
	}

	}
