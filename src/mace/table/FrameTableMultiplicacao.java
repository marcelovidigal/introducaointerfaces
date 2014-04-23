package mace.table;

import javax.swing.JScrollPane;
import javax.swing.JTable;

import mace.framesimples.FrameSimples;

public class FrameTableMultiplicacao extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	public FrameTableMultiplicacao(int linhas, int colunas) {
		ModeloTableMultiplicacao modeloTabelaMultiplicacao = new ModeloTableMultiplicacao(linhas, colunas);
		JTable table = new JTable(modeloTabelaMultiplicacao);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane = new JScrollPane(table);
		this.setSize(350, 250);
		this.getContentPane().add(scrollPane);
	}
	
	public static void main(String[] args) {
		FrameTableMultiplicacao frameTableMultiplicacao = new FrameTableMultiplicacao(30, 30);
		frameTableMultiplicacao.exibir("Tabela Multiplicacao");
	}
	
}