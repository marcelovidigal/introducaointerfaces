package mace.contadorgui;

public class ContadorModelo {
	
	private int valor;
	
	// o construtor inicializa o contador para 0
	public ContadorModelo() {
		valor = 0;
	}
	
	public void incrementar() {
		valor++;
	}
	
	public void decrementar() {
		valor--;
	}
	
	public void redefinir() {
		valor = 0;
	}
	
	public int getValor() {
		return valor;
	}
	
}