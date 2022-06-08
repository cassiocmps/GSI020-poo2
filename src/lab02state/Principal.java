// Autor: Cássio de Souza Campos 12011BSI213
// Data: 19-03-2022
package lab02state;

public class Principal {

	public static void main(String[] args) {
		Mario mario = new Mario();
		System.out.println("Mario criado. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.pegarFlor();
		System.out.println("Mario pegou flor. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.pegarCogumelo();
		System.out.println("Mario pegou cogumelo. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.levarDano();
		System.out.println("Mario levou dano. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.levarDano();
		System.out.println("Mario levou dano. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.pegarPena();
		System.out.println("Mario pegou pena. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.pegarFlor();
		System.out.println("Mario pegou flor. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.pegarCogumelo();
		System.out.println("Mario pegou cogumelo. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());
		
		mario.levarDano();
		System.out.println("Mario levou dano. Estado: " + mario.getEstado().getNome() + ". Pontos: " + mario.getPontos());

	}

}
