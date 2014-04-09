package mace.scrolling;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JEditorPane;
import javax.swing.JScrollPane;

import mace.framesimples.FrameSimples;

public class FrameExibicaoTextoScroll extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private JEditorPane panelExibicaoTexto;
	
	public FrameExibicaoTextoScroll(String nomeArquivo) {
		
		panelExibicaoTexto = new JEditorPane();
		JScrollPane scrollPane = new JScrollPane(panelExibicaoTexto);
		
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		File file = new File(nomeArquivo);
		
		try{
			FileReader fileReader = new FileReader(file);
			panelExibicaoTexto.read(fileReader, null);
		} catch(IOException e) {
			System.out.println("Problemas ao abrir ou ler " + file.getName());
		}
	}
	
}