package Jogo;

public class Ashe extends TipoAtirador implements IHeroi {
	
	public Ashe(String nickname,Item item) {
		super(nickname, "Ashe", 200, 200, 100, 500, 0, item);
    }
	
    public Ashe(String nickname,Item item,String estilo,String cor) {
        super(nickname, "Ashe", 200, 200, 100, 500, 0, item, estilo, cor);
    }

	@Override
	public void atacar() {
	}

	@Override
	public void esquivar() {
	}

	@Override
	public void usarHabilidadePrincipal() {
		
		
	}

	@Override
	public void usarHabilidadeSecundaria() {
		
		
	}
}
