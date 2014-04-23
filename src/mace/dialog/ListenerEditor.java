package mace.dialog;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerEditor implements ActionListener {
	
	private FrameEditorGenerico frameEditorGenerico;
	
	public ListenerEditor(FrameEditorGenerico frameEditorGenerico) {
		this.frameEditorGenerico = frameEditorGenerico;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String actionCommand = e.getActionCommand();
		
		if (actionCommand.equals("Abrir")) {
			frameEditorGenerico.abrirArquivo();
		} else if(actionCommand.equals("Salvar")) {
			frameEditorGenerico.salvarArquivo();
		} else if(actionCommand.equals("Sair")) {
			frameEditorGenerico.sairEditor();
		} else if(actionCommand.equals("Localizar")) {
			frameEditorGenerico.localizar();
		} else {
			System.out.println("Erro: acao inesperada.");
		}
	}
	
}