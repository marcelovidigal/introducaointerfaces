package mace.quebracabecas;

public class ModeloMovimento {
	
	private int direcao;
	private int numeroBloco;
	
	public ModeloMovimento(int direcao, int numeroBloco) {
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