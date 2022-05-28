package lab02state;

public class Grande extends Estado{

	public Grande(Mario mario) {
		super(mario);
	}

	@Override
	public void pegarCogumelo() {
		this.getMario().addPontos(1000);
	}

	@Override
	public void pegarFlor() {
		this.getMario().setEstado(new Fogo(getMario()));
		
	}

	@Override
	public void pegarPena() {
		this.getMario().setEstado(new Capa(getMario()));
		
	}

	@Override
	public void levarDano() {
		this.getMario().setEstado(new Pequeno(getMario()));
		
	}
	
	@Override
	public String getNome() {
		return "Grande";
	}

}
