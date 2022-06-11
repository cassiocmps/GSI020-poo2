package lab05decorator;

public class Picanha extends Lanche{

	public Picanha(){
		this.setDescricao("Lanche de picanha");
	}
	
	@Override
	public Double calcularPreco() {
		return 20.00;
	}
	
}
