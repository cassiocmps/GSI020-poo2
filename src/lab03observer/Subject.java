package lab03observer;

public interface Subject {
	public void registrarCliente(Observer homeBroker);
	public void removerCliente(Observer homeBroker);
	public void notificarClientes();
}
