package lab02state;

public abstract class Estado {
	private Mario mario;
	
	public Estado(Mario mario) {
		this.setMario(mario);
	}
	
	public abstract void pegarCogumelo();
	public abstract void pegarFlor();
	public abstract void pegarPena();
	public abstract void levarDano();
	
	public Mario getMario() {
		return mario;
	}

	public void setMario(Mario mario) {
		this.mario = mario;
	}
	
	public abstract String getNome();
}
