package lab01strategy;

public class ContaCorrente extends Conta {
	public ContaCorrente() {
		setRent(new RentabilidadeBaixa());
		setMen(new MensalidadeNormal());
		setMov(new MovimentacaoCompleta());
		setLim(new LimiteLiberado());
	}

	@Override
	public String tipoConta() {
		return "Conta Corrente";
	}
	

}
