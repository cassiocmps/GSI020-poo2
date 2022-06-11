package lab04chain;

public class Nota extends NotasChain{

	public Nota(Integer valor) {
		super(valor);
	}

	@Override
	protected void efetuaPagamento(Integer quantia) {
		Integer qtdNotas = quantia/valor;
		System.out.println("Notas de " + valor.toString() + ": " + qtdNotas.toString());
		Integer resto = quantia%valor;
		if (next == null)
			System.out.println("Não há notas para retornar.\n"
					+ "Quantia que não pode ser retirada: " + resto.toString());
		else 
			next.tentarEfetuarPagamento(resto);
	}
}
