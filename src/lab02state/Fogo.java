package lab02state;

public class Fogo extends Estado{

	public Fogo(Mario mario) {
		super(mario);
	}

	@Override
	public void pegarCogumelo() {
		this.getMario().addPontos(1000);
	}

	@Override
	public void pegarFlor() {
		this.getMario().addPontos(1000);
		
	}

	@Override
	public void pegarPena() {
		this.getMario().setEstado(new Capa(getMario()));
		
	}

	@Override
	public void levarDano() {
		this.getMario().setEstado(new Grande(getMario()));
		
	}
	
	@Override
	public String getNome() {
		return "Fogo";
	}

}
