package mace.menu;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import mace.framesimples.FrameSimples;

public class FrameMenu extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private JLabel labelMensagem;
	private JMenuItem itemTeste;
	
	public FrameMenu() {
		
		labelMensagem = new JLabel("Nenhum menu selecionado.", JLabel.CENTER);
		
		// cria uma barra de menus e adiciona ela ao frame
		JMenuBar barraMenu = new JMenuBar();
		this.setJMenuBar(barraMenu);
		
		// cria e adiciona os menus
		JMenu primeiroMenu = new JMenu("Menu 1");
		JMenu segundoMenu = new JMenu("Menu 2");
		barraMenu.add(primeiroMenu);
		barraMenu.add(segundoMenu);
		
		// cria os itens do menu e os adiciona aos menus
		JMenuItem primeiroItem = new JMenuItem("Item 1");
		itemTeste = new JMenuItem("Teste");
		JMenuItem itemSair = new JMenuItem("Sair");
		JMenuItem itemHabilitar = new JMenuItem("Habilitar Teste");
		JMenuItem itemDesabilitar = new JMenuItem("Desabilitar Teste");
		
		primeiroMenu.add(primeiroItem);
		primeiroMenu.add(itemTeste);
		primeiroMenu.addSeparator();
		primeiroMenu.add(itemSair);
		
		segundoMenu.add(itemHabilitar);
		segundoMenu.add(itemDesabilitar);
		
		// cria um listener e adiciona ao menu de itens
		ListenerMenu listenerMenu = new ListenerMenu(this);
		primeiroItem.addActionListener(listenerMenu);
		itemTeste.addActionListener(listenerMenu);
		itemSair.addActionListener(listenerMenu);
		itemHabilitar.addActionListener(listenerMenu);
		itemDesabilitar.addActionListener(listenerMenu);
		
		// adiciona o label ao frame
		this.getContentPane().add(labelMensagem, BorderLayout.CENTER);
	}
	
	// metodo para definir o testo do label
	public void setTexto(String texto){
		labelMensagem.setText(texto);
	}
	
	// metodo para habilitar o label
	public void habilitarTeste(){
		itemTeste.setEnabled(true);
	}
	
	// metodo para desabilitar o label
	public void desabilitarTeste(){
		itemTeste.setEnabled(false);
	}
	
}