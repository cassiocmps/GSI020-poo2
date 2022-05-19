package lab01strategy;

public class ContaPoupanca extends Conta {
	public ContaPoupanca() {
		setRent(new RentabilidadeNormal());
		setMen(new MensalidadeBaixa());
		setMov(new MovimentacaoSimplificada());
		setLim(new LimiteBloqueado());
	}

	@Override
	public String tipoConta() {
		return "Conta Poupanca";
	}
}
