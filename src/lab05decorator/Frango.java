package lab05decorator;

public class Frango extends Lanche{

	public Frango(){
		this.setDescricao("Lanche de frango");
	}
	
	@Override
	public Double calcularPreco() {
		return 10.00;
	}
	
}
