package mace.contadorgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorListener implements ActionListener {
	
	private ContadorPanel contadorPanel;
	
	public ContadorListener(ContadorPanel contadorPanel) {
		this.contadorPanel = contadorPanel;
	}
	
	// esse metodo e chamado pelo sistema
	// o programador tem que adicionar o codigo a ser executado em resposta ao evento
	public void actionPerformed(ActionEvent evt){
		
		// codigo que sera executado em resposta ao evento
		String actionCommand = evt.getActionCommand();
		
		if (actionCommand.equals("Incrementar")) {
			contadorPanel.incrementar();
		} else if (actionCommand.equals("Decrementar")) {
			contadorPanel.decrementar();
		} else {
			System.out.println("ERRO: ActionCommand inesperado");	
		}
	}
	
}