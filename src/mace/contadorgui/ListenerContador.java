package mace.contadorgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerContador implements ActionListener {
	
	private PanelContador panelContador;
	
	public ListenerContador(PanelContador panelContador) {
		this.panelContador = panelContador;
	}
	
	// esse metodo e chamado pelo sistema
	// o programador tem que adicionar o codigo a ser executado em resposta ao evento
	public void actionPerformed(ActionEvent evt){
		
		// codigo que sera executado em resposta ao evento
		String actionCommand = evt.getActionCommand();
		
		if (actionCommand.equals("Incrementar")) {
			panelContador.incrementar();
		} else if (actionCommand.equals("Decrementar")) {
			panelContador.decrementar();
		} else {
			System.out.println("ERRO: ActionCommand inesperado");	
		}
	}
	
}