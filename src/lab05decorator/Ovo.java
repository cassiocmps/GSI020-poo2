package lab05decorator;

public class Ovo extends Adicional{
	private Lanche lanche;
	
	public Ovo(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public String getDescricao() {
		return lanche.getDescricao() + ", Ovo";
	}
	
	public Double calcularPreco() {
		return lanche.calcularPreco() + 1.00;
	}
}
