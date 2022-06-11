package lab05decorator;

public class Salsicha extends Adicional{
	private Lanche lanche;
	
	public Salsicha(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public String getDescricao() {
		return lanche.getDescricao() + ", Salsicha";
	}
	
	public Double calcularPreco() {
		return lanche.calcularPreco() + 2.00;
	}
}
