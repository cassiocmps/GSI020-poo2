// Autor: Cássio de Souza Campos 12011BSI213
// Data: 19-03-2022
package lab03observer;

public class Principal {

	public static void main(String[] args) {
		Servidor serv = new Servidor();
		Observer hb1 = new HomeBroker(serv);
		Observer hb2 = new HomeBroker(serv);
		Observer hb3 = new HomeBroker(serv);
		Observer hb4 = new HomeBroker(serv);
		
		serv.setValores("Petrobras: 20.54\nVale: 30.01\nOCX: 47.59”\n");
		System.out.println("=====================================\n");
		serv.setValores("Petrobras: 56.54\nVale: 2.01\nOCX: 41.59”\n");
	}

}
