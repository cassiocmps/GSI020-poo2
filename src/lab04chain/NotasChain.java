package lab04chain;

public abstract class NotasChain {
	protected NotasChain next;
	protected Integer valor;
	
	public NotasChain(Integer nota) {
		next = null;
		this.valor = nota;
	}
	
	public void setNext(NotasChain nota) {
		if (next == null) 
			next = nota;
		else 
			next.setNext(nota);
	}
	
	public void tentarEfetuarPagamento(Integer quantia){
		if (quantia >= this.valor)
			efetuaPagamento(quantia);
		else {
			if (next == null)
				System.out.println("Não há notas para retornar.\n"
						+ "Quantia que não pode ser retirada: " + quantia.toString());
			else 
				next.tentarEfetuarPagamento(quantia);
		}
	}
	
	protected abstract void efetuaPagamento(Integer valor) ;
}
