package mace.contadorgui;

public class ModeloContador {
	
	private int valor;
	
	// o construtor inicializa o contador para 0
	public ModeloContador() {
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