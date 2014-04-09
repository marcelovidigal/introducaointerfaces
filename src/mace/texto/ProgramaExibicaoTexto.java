package mace.texto;

public class ProgramaExibicaoTexto {
	
	// ajuste de caminho se necessario
	private static String caminho = "./src/mace/texto/";
	private static String nomeArquivo = "textoteste1.txt";
	
	public static void main(String[] args) {
		FrameExibicaoTexto frameExibicaoTexto = new FrameExibicaoTexto(caminho + nomeArquivo);
		frameExibicaoTexto.exibir("Exibir Texto");
	}
	
}