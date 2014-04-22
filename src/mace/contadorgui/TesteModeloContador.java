package mace.contadorgui;

public class TesteModeloContador {
	
	private static boolean passou = true;
	
	public static void main(String[] args) {
		
		ModeloContador modeloCountador = new ModeloContador();
		
		checarValor(0, modeloCountador.getValor());
		modeloCountador.incrementar();
		checarValor(1, modeloCountador.getValor());
		modeloCountador.decrementar();
		checarValor(0, modeloCountador.getValor());
		
		for (int i = 0; i < 37; i++) {
			modeloCountador.incrementar();
		}
		
		checarValor(37, modeloCountador.getValor());
		
		for (int i = 0; i < 21; i++) {
			modeloCountador.decrementar();
		}
		
		checarValor(16, modeloCountador.getValor());
		modeloCountador.redefinir();
		checarValor(0, modeloCountador.getValor());
		
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