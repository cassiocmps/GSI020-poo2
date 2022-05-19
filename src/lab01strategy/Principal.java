// Autor: Cássio de Souza Campos 12011BSI213
// Data: 19-03-2022

package lab01strategy;

class Principal {

	public static void main(String[] args) {
		
		Conta contas[] = {
				new ContaCorrente(), 
				new ContaSalario(), 
				new ContaPoupanca(), 
				new ContaInvestimento(),
				new ContaMelhorDeTodas()
				};
		
		for(Conta c : contas) {
			
			System.out.println("Propriedades da " + c.tipoConta()); // c.getClass() fica feio
			c.rentabilidade();
			c.mensalidade();
			c.movimentacao();
			c.limite();
			System.out.println();
			
		}
		

	}

}
