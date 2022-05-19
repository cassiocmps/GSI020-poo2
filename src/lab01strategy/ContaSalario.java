package lab01strategy;

public class ContaSalario extends Conta {
	public ContaSalario() {
		setRent(new RentabilidadeBaixa());
		setMen(new MensalidadeNormal());
		setMov(new MovimentacaoSimplificada());
		setLim(new LimiteBloqueado());
	}

	@Override
	public String tipoConta() {
		return "Conta Salario";
	}
}
