package mace.dialogs;

import java.awt.BorderLayout;
import javax.swing.JEditorPane;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;

import mace.framesimples.FrameSimples;

public class FrameEditorGenerico extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private JEditorPane editorPane;
	
	public FrameEditorGenerico() {
		
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
		System.out.println("Item de menu abrir selecionado.");
	}
	
	public void salvarArquivo(){
		// codigo para salvar um arquivo		
		System.out.println("Item de menu salvar selecionado.");
	}
	
	public void localizar(){
		// codigo para localizacao
		System.out.println("Item de menu localizar selecionado.");
	}
	
	public void sairEditor(){
		// codigo para deixar o editor
		System.out.println("Item de menu sair selecionado.");
	}
	
}