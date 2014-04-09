package mace.texto;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class LeituraEscritaArquivo {
	
	// essa variavel tem que ser definida de acordo com o sistema
	public static String caminho = "./src/mace/texto/";
	
	public LeituraEscritaArquivo(String nomeArquivoLeitura, String nomeArquivoEscrita) {
		
		// buffer para o texto
		char[] buffer = new char[128];
		
		for (int i = 0; i < buffer.length; i++) {
			buffer[i] = '-';
		}
		
		// cria duas variaveis para arquivos
		File arquivoLeitura = new File(caminho + nomeArquivoLeitura);
		File arquivoEscrita = new File(caminho + nomeArquivoEscrita);
		
		// leitura
		if (arquivoLeitura.exists()) {
			try {
				// cria o leitor
				FileReader fileReader = new FileReader(arquivoLeitura);
				
				// le o arquivo e armazena 100 caracteres no buffer iniciando na posicao 5 do buffer
				fileReader.read(buffer, 5, 100);
				
				// fecha o arquivo
				fileReader.close();
			} catch (Exception ex) {
				System.out.println("Problema ao abrir o arquivo " + arquivoLeitura.getName());
			}
		} else {
			System.out.println("Arquivo nao encontrado " + arquivoLeitura.getName());
		}
		
		System.out.println("Buffer>" + buffer.toString() + "<Buffer");
		
		// escrita
		try {
			if (arquivoEscrita.exists()) {
				arquivoEscrita.delete();
			}
			
			if (arquivoEscrita.createNewFile()) {
				
				// cria o escritor
				FileWriter fileWriter = new FileWriter(arquivoEscrita);	
				
				// escreve 40 caracteres do buffer iniciando na posicao 7 do buffer
				fileWriter.write(buffer, 7, 40);
				
				// fecha o arquivo
				fileWriter.close();
			} else {
				System.out.println("O arquivo nao foi criado " + arquivoEscrita.getName());
			}
		} catch (Exception ex) {
			System.out.println("Problema ao abrir o arquivo " + arquivoEscrita.getName());
		}
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		LeituraEscritaArquivo leituraEscritaArquivo = new LeituraEscritaArquivo("textoteste1.txt", "textoteste2.txt");
	}
	
}