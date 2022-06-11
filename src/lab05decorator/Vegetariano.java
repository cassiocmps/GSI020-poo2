package lab05decorator;

public class Vegetariano extends Lanche{

	public Vegetariano(){
		this.setDescricao("Lanche vegetariano");
	}
	
	@Override
	public Double calcularPreco() {
		return 8.00;
	}
	
}
