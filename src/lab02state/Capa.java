package lab02state;

public class Capa extends Estado{

	public Capa(Mario mario) {
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
		this.getMario().addPontos(1000);
		
	}

	@Override
	public void levarDano() {
		this.getMario().setEstado(new Grande(getMario()));
		
	}	
	
	@Override
	public String getNome() {
		return "Capa";
	}

}
