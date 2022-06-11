// Autor: Cássio de Souza Campos 12011BSI213
// Data: 19-03-2022
package lab04chain;

public class Principal {

	public static void main(String[] args) {
		NotasChain caixaEletronico = new Nota(200);
		caixaEletronico.setNext(new Nota(100));
		caixaEletronico.setNext(new Nota(50));
		caixaEletronico.setNext(new Nota(20));
		caixaEletronico.setNext(new Nota(10));
		caixaEletronico.setNext(new Nota(5));
		caixaEletronico.setNext(new Nota(2));
		
		try {
			caixaEletronico.tentarEfetuarPagamento(480);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
