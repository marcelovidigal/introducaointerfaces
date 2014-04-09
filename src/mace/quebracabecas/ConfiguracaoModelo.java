package mace.quebracabecas;

public class ConfiguracaoModelo {
	
	private int[][] tabuleiro;
	int numeroLinhas, numeroColunas;
	
	public ConfiguracaoModelo(int[][] tabuleiro) {
		
		numeroLinhas = tabuleiro.length;
		numeroColunas = tabuleiro[0].length;
		this.tabuleiro = new int[numeroLinhas][numeroColunas];
		
		for (int linha = 0; linha < numeroLinhas; linha++) {
			for (int coluna = 0; coluna < numeroColunas; coluna++) {
				this.tabuleiro[linha][coluna] = tabuleiro[linha][coluna];
			}
		}
	}
	
	public int getNumeroBloco(int linha, int coluna) {
		return tabuleiro[linha][coluna];
	}
	
	public String toString() {
		
		String configuracao = "";
		
		for (int linha = 0; linha < numeroLinhas; linha++) {
			for (int coluna = 0; coluna < numeroColunas; coluna++) {
				if (tabuleiro[linha][coluna] < 10) {
					configuracao += " " + tabuleiro[linha][coluna];
				} else {
					configuracao += " " + tabuleiro[linha][coluna];
				}
			}
			
			configuracao += "\n";
		}
		
		configuracao += "\n";
		
		return configuracao;
	}
	
	public boolean equals(ConfiguracaoModelo configuracaoModelo){
		
		boolean resultado = true;
		
		for (int linha = 0; linha < numeroLinhas; linha++) {
			for (int coluna = 0; coluna < numeroColunas; coluna++) {
				if (this.tabuleiro[linha][coluna] != configuracaoModelo.tabuleiro[linha][coluna]) {
					resultado = false;
				}
			}
		}
		
		return resultado;
	}
	
}