package mace.quebracabeca;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ListenerQuebraCabeca extends MouseAdapter {
	
	private PanelDirecao panelDirecao;
	private PanelQuebraCabeca panelQuebraCabeca;
	
	ListenerQuebraCabeca(PanelQuebraCabeca panelQuebraCabeca, PanelDirecao panelDirecao) {
		this.panelDirecao = panelDirecao;
		this.panelQuebraCabeca = panelQuebraCabeca;
	}
	
	public void mouseClicked(MouseEvent mouseEvent) {
		
		int x = mouseEvent.getX();
		int y = mouseEvent.getY();
		
		int numeroBloco = panelQuebraCabeca.getNumeroBlocoNasCoordenadas(x, y);
		
		// constroi o movimento
		ModeloMovimento modeloMovimento = new ModeloMovimento(panelDirecao.getDirecao(), numeroBloco);
		
		// requisita a realizacao de um movimento no painel do quebra-cabeca
		// note que o listener do quebra-cabeca nao sabe como realizar o movimento
		panelQuebraCabeca.mover(modeloMovimento);
	}
	
}