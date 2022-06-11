package lab03observer;

import java.util.ArrayList;

public class Servidor implements Subject{

	private String Valores;
	public ArrayList<Observer> clientes;
	
	public Servidor() {
		clientes = new ArrayList<Observer>();
	}

	@Override
	public void registrarCliente(Observer homeBroker) {
		clientes.add(homeBroker);	
	}

	@Override
	public void removerCliente(Observer homeBroker) {
		int i = clientes.indexOf(homeBroker);
		if (i >= 0) 
			clientes.remove(i);
	}
	
	public void setValores(String valores) {
		Valores = valores;
		notificarClientes();
	}
	
	@Override
	public void notificarClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			Observer homeBroker = (Observer)clientes.get(i);
			homeBroker.atualizar(Valores);
		}
	}
	
	public String getValores() {
		return Valores;
	}
}
