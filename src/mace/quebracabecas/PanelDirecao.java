package mace.quebracabecas;

import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class PanelDirecao extends JPanel {
	
	private JRadioButton radioButtonParaCima, radioButtonParaBaixo, radioButtonParaEsquerda, radioButtonParaDireita;
	private ButtonGroup buttonGroup;
	
	public PanelDirecao() {
		this.setLayout(new GridLayout(4, 1));
		
		radioButtonParaCima = new JRadioButton("Para Cima");
		radioButtonParaBaixo = new JRadioButton("Para Baixo");
		radioButtonParaEsquerda = new JRadioButton("Para Esquerda");
		radioButtonParaDireita = new JRadioButton("Para Direita");
		
		radioButtonParaCima.setActionCommand("paracima");
		radioButtonParaBaixo.setActionCommand("parabaixo");
		radioButtonParaEsquerda.setActionCommand("paraesquerda");
		radioButtonParaDireita.setActionCommand("paradireita");
		
		buttonGroup = new ButtonGroup();
		buttonGroup.add(radioButtonParaCima);
		buttonGroup.add(radioButtonParaBaixo);
		buttonGroup.add(radioButtonParaEsquerda);
		buttonGroup.add(radioButtonParaDireita);
		
		radioButtonParaCima.setSelected(true);
		
		this.add(radioButtonParaCima);
		this.add(radioButtonParaBaixo);
		this.add(radioButtonParaEsquerda);
		this.add(radioButtonParaBaixo);
	}
	
	public int getDirecao() {
		
		String actionCommand = buttonGroup.getSelection().getActionCommand();
		
		int resultado = 0;
		
		if (actionCommand.equals("paracima")) {
			resultado = Constantes.DIRECAO_SUPERIOR;
		} else if (actionCommand.equals("parabaixo")) {
			resultado = Constantes.DIRECAO_INFERIOR;
		} else if (actionCommand.equals("paradireita")) {
			resultado = Constantes.DIRECAO_DIREITA;
		} else if (actionCommand.equals("paraesquerda")) {
			resultado = Constantes.DIRECAO_ESQUERDA;
		}
		
		return resultado;
	}
	
}