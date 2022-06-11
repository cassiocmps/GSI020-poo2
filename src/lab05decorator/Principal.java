// Autor: Cássio de Souza Campos 12011BSI213
// Data: 19-03-2022
package lab05decorator;

public class Principal {

	public static void main(String[] args) {
		
		Lanche veg = new Vegetariano();
		veg = new Queijo(veg);
		veg = new AumentarTamanho(veg);
		System.out.println(veg.getDescricao());
		System.out.println("Valor Total: " + veg.calcularPreco().toString());
		
		Lanche frango = new Frango();
		frango = new Queijo(frango);
		frango = new Salsicha(frango);
		frango = new Salsicha(frango);
		frango = new Ovo(frango);
		System.out.println(frango.getDescricao());
		System.out.println("Valor Total: " + frango.calcularPreco().toString());
		
		Lanche picanha = new Picanha();
		picanha = new Queijo(picanha);
		picanha = new Ovo(picanha);
		picanha = new AumentarTamanho(picanha);
		System.out.println(picanha.getDescricao());
		System.out.println("Valor Total: " + picanha.calcularPreco().toString());
	}

}
