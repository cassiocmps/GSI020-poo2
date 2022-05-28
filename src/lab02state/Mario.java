package lab02state;

public class Mario {
	private Estado estado;
	private Integer pontos;
	
	public Mario() {
		this.estado = new Pequeno(this);
		this.pontos = 0;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getPontos() {
		return pontos.toString();
	}
	
	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public void addPontos(int pontos) {
		this.pontos += pontos;
	}
	
	public void pegarCogumelo() {
		this.estado.pegarCogumelo();
	}
	
	public void pegarFlor() {
		this.estado.pegarFlor();
	}
	
	public void pegarPena() {
		this.estado.pegarPena();
	}
	
	public void levarDano() {
		this.estado.levarDano();
	}

}
