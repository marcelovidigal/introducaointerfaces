package mace.contadorgui;

public class ContadorModeloTeste {
	
	private static boolean passou = true;
	
	public static void main(String[] args) {
		
		ContadorModelo countadorModelo = new ContadorModelo();
		
		checarValor(0, countadorModelo.getValor());
		countadorModelo.incrementar();
		checarValor(1, countadorModelo.getValor());
		countadorModelo.decrementar();
		checarValor(0, countadorModelo.getValor());
		
		for (int i = 0; i < 37; i++) {
			countadorModelo.incrementar();
		}
		
		checarValor(37, countadorModelo.getValor());
		
		for (int i = 0; i < 21; i++) {
			countadorModelo.decrementar();
		}
		
		checarValor(16, countadorModelo.getValor());
		countadorModelo.redefinir();
		checarValor(0, countadorModelo.getValor());
		
		if (passou) {
			System.out.println("Passou no teste.");
		} else {
			System.out.println("Nao passou no teste.");
		}
	}
	
	private static void checarValor(int valorEsperado, int valorObservado) {
		if (valorEsperado == valorObservado) {
			System.out.println("Ambos os valores sao iguais a " + valorEsperado);
		} else {
			System.out.println("ERRO: valor esperado " + valorEsperado + " e valor observado " + valorObservado + " diferentes");
			passou = false;
		}
	}
	
}