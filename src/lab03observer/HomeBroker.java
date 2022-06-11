package lab03observer;

public class HomeBroker implements Observer, ExibirInformacoes {

	private String Valores;
	private Subject Servidor;
	
	public HomeBroker(Subject Servidor) {
		this.Servidor = Servidor;
		this.Servidor.registrarCliente(this);
	}
	
	@Override
	public void atualizar(String valores) {
		this.Valores = valores;
		exibir();
	}

	@Override
	public void exibir() {
		System.out.println("Homebroker de codigo " + this.hashCode() + ". Novos Valores: ");
		System.out.println(this.Valores);
	}
}
