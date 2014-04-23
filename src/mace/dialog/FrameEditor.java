package mace.dialog;

import java.awt.BorderLayout;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.StringTokenizer;

import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

public class FrameEditor extends FrameEditorGenerico {
	
	private static final long serialVersionUID = 1L;
	
	private JEditorPane editorPane;
	private JFileChooser fileChooser;
	private File file;
	private ObjetoTransferenciaDados objetoTransferenciaDados;
	private DialogLocalizar dialogLocalizar;
	
	private String caminhoInicio = "testeeditor.txt";
	
	public FrameEditor() {
		
		editorPane = new JEditorPane();
		JScrollPane scrollPane = new JScrollPane(editorPane);
		
		this.getContentPane().add(scrollPane, BorderLayout.CENTER);
		
		// cria uma barra de menu, menus e itens menus
		JMenuBar menuBar = new JMenuBar();
		
		this.setJMenuBar(menuBar);
		
		JMenu menuArquivo = new JMenu("Arquivo");
		JMenu menuFerramentas = new JMenu("Ferramentas");
		
		menuBar.add(menuArquivo);
		menuBar.add(menuFerramentas);
		
		JMenuItem itemAbrir = new JMenuItem("Abrir");
		JMenuItem itemSalvar = new JMenuItem("Salvar");
		JMenuItem itemSair = new JMenuItem("Sair");
		JMenuItem itemLocalizar = new JMenuItem("Localizar");
		
		menuArquivo.add(itemAbrir);
		menuArquivo.add(itemSalvar);
		menuArquivo.addSeparator();
		menuArquivo.add(itemSair);
		menuArquivo.add(itemLocalizar);
		
		// cria um listener e adiciona aos itens do menu
		ListenerEditor listenerEditor = new ListenerEditor(this);
		
		itemAbrir.addActionListener(listenerEditor);
		itemSalvar.addActionListener(listenerEditor);
		itemSair.addActionListener(listenerEditor);
		itemLocalizar.addActionListener(listenerEditor);
	}
	
	public void abrirArquivo(){
		// codigo para carregar um arquivo
		
		if (fileChooser == null) {
			fileChooser = new JFileChooser(caminhoInicio);
		}
		
		int retorno = fileChooser.showOpenDialog(this);
		
		if (retorno == JFileChooser.APPROVE_OPTION) {
			
			file = fileChooser.getSelectedFile();

			try{
				FileReader fileReader = new FileReader(file);
				editorPane.read(fileReader, null);
				fileReader.close();
			} catch(IOException e) {
				System.out.println("Problemas na abertura ou leitura " + file.getName());
			}
		}
		
		System.out.println("Item de menu abrir selecionado.");
	}
	
	public void salvarArquivo(){
		// codigo para salvar um arquivo
		
		try {
			file = new File(caminhoInicio);
			
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(editorPane.getText());
			fileWriter.close();
		} catch(IOException e) {
			System.out.println("Problemas ao escrever " + file.getName());
		}
		
		editorPane.setText("");
		
		System.out.println("Item de menu salvar selecionado.");
	}
	
	public void localizar(){
		// codigo para localizacao
		
		if (dialogLocalizar == null) {
			dialogLocalizar  = new DialogLocalizar(this);
			objetoTransferenciaDados = new ObjetoTransferenciaDados();
		}
		
		dialogLocalizar.exibir(objetoTransferenciaDados);
		
		if (objetoTransferenciaDados.getLocaliza() && (objetoTransferenciaDados.getTextoLocalizar().length() > 0)) {
			contarPalavras(objetoTransferenciaDados.getTextoLocalizar(), objetoTransferenciaDados.getCaseSensitive());
		}
		
		System.out.println("Item de menu localizar selecionado.");
	}
	
	public void contarPalavras(String palavra, boolean caseSensitive) {
		
		String texto = editorPane.getText();
		int total = 0;
		StringTokenizer stringTokenizer = new StringTokenizer(texto, " \n\t,.;");
		
		while (stringTokenizer.hasMoreTokens()) {
			if (caseSensitive) {
				if (stringTokenizer.nextToken().equals(palavra)) {
					total++;
				}
			} else {
				if (stringTokenizer.nextToken().equalsIgnoreCase(palavra)) {
					total++;
				}
			}
		}
		
		String resultado =  "Palavra \"" + palavra + "\" aparece " + total + " vezes.";
		JOptionPane.showMessageDialog(this, resultado, "Resultado da consulta ", JOptionPane.INFORMATION_MESSAGE);
		
	}
	
	public void sairEditor(){
		// codigo para deixar o editor
		
		System.exit(0);
		
		System.out.println("Item de menu sair selecionado.");
	}
	
}