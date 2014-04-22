package mace.contadorgui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelContador extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private ModeloContador contador;
	private JLabel labelValor;
	
	public PanelContador() {
		
		contador = new ModeloContador();
		
		BorderLayout borderLayout = new BorderLayout();
		this.setLayout(borderLayout);
		
		JButton buttonIncrementar = new JButton("Incrementar");
		JButton buttonDecrementar = new JButton("Decrementar");
		labelValor = new JLabel("" + contador.getValor(), SwingConstants.CENTER);
		
		this.add(buttonIncrementar, BorderLayout.WEST);
		this.add(buttonDecrementar, BorderLayout.EAST);
		this.add(labelValor, BorderLayout.CENTER);
		
		// as proximas tres linhas irao ser usadas para incorporar o listener
		ListenerContador listenerContador = new ListenerContador(this);
		buttonIncrementar.addActionListener(listenerContador);
		buttonDecrementar.addActionListener(listenerContador);
	}
	
	public void incrementar() {
		contador.incrementar();
		labelValor.setText("" + contador.getValor());
	}
	
	public void decrementar() {
		contador.decrementar();
		labelValor.setText("" + contador.getValor());
	}
	
}