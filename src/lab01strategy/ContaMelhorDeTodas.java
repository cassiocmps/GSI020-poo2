package lab01strategy;

public class ContaMelhorDeTodas extends Conta {
	public ContaMelhorDeTodas() {
		setRent(new RentabilidadeAlta());
		setMen(new MensalidadeBaixa());
		setMov(new MovimentacaoCompleta());
		setLim(new LimiteLiberado());
	}

	@Override
	public String tipoConta() {
		return "Conta Melhor De Todas";
	}
}
