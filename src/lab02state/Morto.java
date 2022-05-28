package lab02state;

public class Morto extends Estado{

	public Morto(Mario mario) {
		super(mario);
		getMario().setPontos(0);
	}

	@Override
	public void pegarCogumelo() {
		// TODO Auto-generated method stub
	}

	@Override
	public void pegarFlor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pegarPena() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void levarDano() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getNome() {
		return "Morto";
	}

}
