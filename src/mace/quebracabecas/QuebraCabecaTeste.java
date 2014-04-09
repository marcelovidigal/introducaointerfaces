package mace.quebracabecas;

public class QuebraCabecaTeste {
	
	private static boolean passou;
	
	public static void main(String[] args){
		
		passou = true;
		
		// gera um modelo e imprime como texto
		ModeloTabuleiro modeloTabuleiro = new ModeloTabuleiro(4, 4);
		ModeloConfiguracao configuracaoAtual, configuracaoEsperada;
		configuracaoAtual = modeloTabuleiro.getConfiguracaoAtual();
		configuracaoEsperada = new ModeloConfiguracao(new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}});
		verificar(configuracaoAtual, configuracaoEsperada);
		
		// realiza um movimento
		System.out.println("Move bloco 15 a direita");
		ModeloMovimento modeloMovimento1 = new ModeloMovimento(Constantes.DIRECAO_DIREITA, 15);
		
		if (!modeloTabuleiro.mover(modeloMovimento1)) {
			System.out.println("Movimento ilegal!");
		}
		
		configuracaoAtual = modeloTabuleiro.getConfiguracaoAtual();
		configuracaoEsperada = new ModeloConfiguracao(new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 0, 15}});
		verificar(configuracaoAtual, configuracaoEsperada);
		
		// realiza outro movimento
		System.out.println("Move bloco 5 para cima");
		ModeloMovimento modeloMovimento2 = new ModeloMovimento(Constantes.DIRECAO_SUPERIOR, 5);
		
		if (!modeloTabuleiro.mover(modeloMovimento2)) {
			System.out.println("Movimento ilegal!");
		}
		
		configuracaoAtual = modeloTabuleiro.getConfiguracaoAtual();
		configuracaoEsperada = new ModeloConfiguracao(new int[][] {{1, 2, 3, 4}, {5, 6, 7,8 }, {9, 10, 11, 12}, {13, 14, 0, 15}});
		verificar(configuracaoAtual, configuracaoEsperada);
		
		// exibe o resultado dos testes
		if (passou) {
			System.out.println("Passou nos testes");
		} else {
			System.out.println("Nao passou nos testes");
		}
	}
	
	private static void verificar(ModeloConfiguracao configuracao1, ModeloConfiguracao configuracao2) {
		if (configuracao1.equals(configuracao2)) {
			System.out.println("Configuracao ok:");
			System.out.println(configuracao1.toString());
		} else {
			System.out.println("Configuracoes esperada e atual nao conferem");
			System.out.println(configuracao2.toString());
			System.out.println(configuracao1.toString());
			
			passou = false;
		}
	}
}