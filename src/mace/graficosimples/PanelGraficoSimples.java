package mace.graficosimples;


import java.awt.*;
import javax.swing.JPanel;

public class PanelGraficoSimples extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public PanelGraficoSimples() {
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(300, 300));
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.black);
		g.drawLine(10, 10, 100, 100);
		g.setColor(Color.red);
		g.drawLine(10, 100, 100, 10);
		g.setColor(Color.green);
		g.drawOval(120, 60, 70, 40);
		g.setColor(Color.yellow);
		g.fillOval(230, 150, 30, 30);
		g.setColor(Color.red);
		g.fillOval(245, 150, 30, 30);
		g.setColor(Color.black);
		g.fillOval(238, 160, 30, 30);
		g.setColor(Color.cyan);
		g.fillOval(10, 120, 100, 60);
		g.setColor(this.getBackground());
		g.fillOval(50, 140, 100, 60);
		g.setColor(Color.blue);
		g.drawString("Texto.", 100, 200);
	}
	
}