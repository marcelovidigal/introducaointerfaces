package mace.quebracabecas;

public class MovimentoModelo {
	
	private int direcao;
	private int numeroBloco;
	
	public MovimentoModelo(int direcao, int numeroBloco) {
		this.direcao = direcao;
		this.numeroBloco = numeroBloco;
	}
	
	public int getNumeroBloco() {
		return numeroBloco;
	}
	
	public int getDirecao(){
		return direcao;
	}
	
}