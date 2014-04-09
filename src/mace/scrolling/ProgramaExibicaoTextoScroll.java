package mace.scrolling;

public class ProgramaExibicaoTextoScroll {
	
	// ajuste de caminho se necessario
	private static String caminho = "./src/mace/scrolling/";
	private static String nomeArquivo = "textoteste1.txt";
	
	public static void main(String[] args) {
		FrameExibicaoTextoScroll frameExibicaoTexto = new FrameExibicaoTextoScroll(caminho + nomeArquivo);
		frameExibicaoTexto.exibir("Exibir Texto");
	}
	
}