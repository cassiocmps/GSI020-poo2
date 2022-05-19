package lab01strategy;

public class ContaInvestimento extends Conta {
	public ContaInvestimento() {
		setRent(new RentabilidadeNormal());
		setMen(new MensalidadeBaixa());
		setMov(new MovimentacaoCompleta());
		setLim(new LimiteLiberado());
	}

	@Override
	public String tipoConta() {
		return "Conta Investimento";
	}
}
