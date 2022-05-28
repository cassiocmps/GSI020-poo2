package lab02state;

public class Pequeno extends Estado{

	public Pequeno(Mario mario) {
		super(mario);
	}

	@Override
	public void pegarCogumelo() {
		this.getMario().setEstado(new Grande(getMario()));
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
		this.getMario().setEstado(new Morto(getMario()));
		
	}
	
	@Override
	public String getNome() {
		return "Pequeno";
	}
}
