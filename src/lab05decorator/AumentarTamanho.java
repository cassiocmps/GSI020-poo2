package lab05decorator;

public class AumentarTamanho extends Adicional{
	private Lanche lanche;
	
	public AumentarTamanho(Lanche lanche) {
		this.lanche = lanche;
	}
	
	public String getDescricao() {
		return "Lanche Grande. " + lanche.getDescricao();
	}
	
	public Double calcularPreco() {
		return lanche.calcularPreco() * 2;
	}
}
