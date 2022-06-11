package lab05decorator;

public class Queijo extends Adicional{
	private Lanche lanche;
	
	public Queijo(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public String getDescricao() {
		return lanche.getDescricao() + ", Queijo";
	}
	
	public Double calcularPreco() {
		return lanche.calcularPreco() + 2.50;
	}
}
