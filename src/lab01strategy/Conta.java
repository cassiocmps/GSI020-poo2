package lab01strategy;

public abstract class Conta {
	
	private Rentabilidade rent;
	private Mensalidade men;
	private Movimentacao mov;
	private Limite lim;
	
	public void setRent(Rentabilidade rent) {
		this.rent = rent;
	}
	public void setMen(Mensalidade men) {
		this.men = men;
	}
	public void setMov(Movimentacao mov) {
		this.mov = mov;
	}
	public void setLim(Limite lim) {
		this.lim = lim;
	}
	
	public void rentabilidade() {
		rent.rentabilidade();
	}
	public void mensalidade() {
		men.mensalidade();
	}
	public void movimentacao() {
		mov.movimentacao();;
	}
	public void limite() {
		lim.limite();;
	}
	
	public abstract String tipoConta();
	


}
