package mace.menus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerMenu implements ActionListener {
	
	private FrameMenu frameMenu;
	
	public ListenerMenu(FrameMenu frameMenu) {
		this.frameMenu = frameMenu;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		String actionCommand = arg0.getActionCommand();
		
		if (actionCommand.equals("Item 1")) {
			frameMenu.setTexto("Item 1 selecionado");
		} else if (actionCommand.equals("Teste")) {
			frameMenu.setTexto("Item Test selected");
		} else if(actionCommand.equals("Sair")){
			System.exit(0);
		} else if (actionCommand.equals("Habilitar Teste")){
			frameMenu.habilitarTeste();
			frameMenu.setTexto("Item \"Teste\" no Menu 1 habilitado.");
		} else if (actionCommand.equals("Desabilitar Teste")){
			frameMenu.desabilitarTeste();
			frameMenu.setTexto("Item \"Test\" no Menu 1 desabilitado.");
		} else{
			System.out.println("ERRO: comando desconhecido.");
		}
	}
	
}