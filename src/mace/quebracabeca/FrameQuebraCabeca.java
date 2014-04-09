package mace.quebracabeca;

import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;

import javax.swing.JFrame;

import com.sun.glass.events.WindowEvent;

public class FrameQuebraCabeca extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private PanelDirecao panelDirecao;
	private PanelQuebraCabeca panelQuebraCabeca;
	
	// construtor
	public FrameQuebraCabeca(int linhas, int colunas) {
		
		this.setLocation(200, 200);
		this.setTitle("Quebra-cabeca");
		
		ModeloTabuleiro modeloTabuleiro = new ModeloTabuleiro(linhas, colunas);
		panelQuebraCabeca = new PanelQuebraCabeca(modeloTabuleiro);
		panelDirecao = new PanelDirecao();
		
		getContentPane().add(panelQuebraCabeca, BorderLayout.CENTER);
		getContentPane().add(panelDirecao, BorderLayout.EAST);
		
		ListenerQuebraCabeca listenerQuebraCabeca = new ListenerQuebraCabeca(panelQuebraCabeca, panelDirecao);
		panelQuebraCabeca.addMouseListener(listenerQuebraCabeca);
		
		// corrige a finalizacao da aplicacao
		// quando clicava no simbolo "fechar" apenas o frame desaparecia, mas o processo principal permanecia rodando
		addWindowListener(new WindowAdapter() {
			@SuppressWarnings("unused")
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		pack();
	}
	
	public void exibir() {
		this.setVisible(true);
	}
	
	public void esconder() {
		this.setVisible(false);
	}
	
}