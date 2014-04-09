package mace.texto;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JEditorPane;

import mace.framesimples.FrameSimples;

public class FrameExibicaoTexto extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private JEditorPane editorPane;
	
	public FrameExibicaoTexto(String nomeArquivo) {
		
		editorPane = new JEditorPane();
		this.getContentPane().add(editorPane, BorderLayout.CENTER);
		this.setSize(200,160);
		
		File arquivoLeitura = new File(nomeArquivo);
		
		try {
			FileReader fileReader = new FileReader(arquivoLeitura);
			editorPane.read(fileReader, null);
		} catch(IOException e) {
			System.out.println("Problemas ao abrir ou ler " + arquivoLeitura.getPath());
		}
	}
	
}