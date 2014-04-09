package mace.quebracabecas;

public class TabuleiroModelo {
	
	private int numeroLinhas, numeroColunas;
	private int[][] tabuleiro;	// o tabuleiro como um vetor
	private int[] linhaBloco;	// o numero da linha de cada bloco
	private int[] colunaBloco;	// o numero da coluna de cada bloco
	
	public ConfiguracaoModelo getConfiguracaoAtual() {
		return new ConfiguracaoModelo(tabuleiro);
	}
	
	public int getNumeroColunas() {
		return numeroColunas;
	}
	
	public int getNumeroLinhas() {
		return numeroLinhas ;
	}
	
	public TabuleiroModelo(int numeroLinhas, int numeroColunas) {
		this.numeroLinhas = numeroLinhas;
		this.numeroColunas = numeroColunas;
		
		tabuleiro = new int[numeroLinhas][numeroColunas];
		
		linhaBloco = new int[numeroLinhas * numeroColunas];
		colunaBloco = new int[numeroLinhas * numeroColunas];
		
		// inicializa o tabuleiro, os blocos sao 16
		// numerdados em termos de linhas 1,2,... 17
		int bloco = 1;
		
		for (int linha = 0; linha < numeroLinhas; linha++) {
			for (int coluna = 0; coluna < numeroColunas; coluna++) {
				if (bloco < numeroLinhas * numeroColunas) {
					tabuleiro[linha][coluna] = bloco;
					linhaBloco[bloco] = linha;
					colunaBloco[bloco] = coluna;
					bloco++;
				}
			}
		}
		
		// o bloco faltante esta na parte inferior a direita
		tabuleiro[numeroLinhas - 1][numeroColunas - 1] = 0;
		linhaBloco[0] = numeroLinhas - 1;
		colunaBloco[0] = numeroColunas - 1;
	}
	
	public boolean mover(MovimentoModelo movimentoModelo) {
		
		int direcao = movimentoModelo.getDirecao();
		int bloco = movimentoModelo.getNumeroBloco();
		int linha = linhaBloco[bloco];
		int coluna = colunaBloco[bloco];
		
		boolean ok = true;
		
		// an UP move is possible if the missing block
		
		// um movimento para cima e possivel se o bloco faltante
		// esta acima da posicao (linha, coluna), por exemplo, (linha - 1, coluna)
		// especialmente linha tem que ser maior que  0
		// os testes para outras direcoes sao similares
		if (direcao == Constantes.DIRECAO_SUPERIOR) {
			if ((linha > 0) && (tabuleiro[linha - 1][coluna] == 0)) {
				tabuleiro[linha - 1][coluna] = tabuleiro[linha][coluna];
				linhaBloco[bloco]--;
				tabuleiro[linha][coluna] = 0;
				linhaBloco[0]++;
			} else {
				ok = false;
			}
		} else if (direcao == Constantes.DIRECAO_INFERIOR) {
			if ((linha < numeroLinhas - 1) && (tabuleiro[linha + 1][coluna] == 0)) {
				tabuleiro[linha + 1][coluna] = tabuleiro[linha][coluna];
				linhaBloco[bloco]++;
				tabuleiro[linha][coluna] = 0;
				linhaBloco[0]--;
			} else{
				ok = false;
			}
		} else if (direcao == Constantes.DIRECAO_ESQUERDA) {
			if ((coluna > 0) && (tabuleiro[linha][coluna - 1] == 0)) {
				tabuleiro[linha][coluna - 1] = tabuleiro[linha][coluna];
				colunaBloco[bloco]--;
				tabuleiro[linha][coluna] = 0;
				colunaBloco[0]++;
			} else {
				ok = false;
			}
		} else if (direcao == Constantes.DIRECAO_DIREITA) {
			if ((coluna < numeroColunas - 1) && (tabuleiro[linha][coluna + 1] == 0)) {
				tabuleiro[linha][coluna + 1] = tabuleiro[linha][coluna];
				colunaBloco[bloco]++;
				tabuleiro[linha][coluna] = 0;
				colunaBloco[0]--;
			} else {
				ok = false;
			}
		} return ok;
	}
	
}