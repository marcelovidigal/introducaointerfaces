package mace.table;

import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class ModeloTablePedidos extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	
	private String[] nomesColunas = {"Produto", "Imagem", "Preco", "Quantidade", "Total"};
	private String[] produtos = {"Circulo", "Triangulo", "Retangulo"};
	private String[] nomesImagens = {"circ.png", "tria.png", "rect.png"};
	private int[] quantidades = {0, 0, 0};
	private double[] precos = {10.00, 12.00, 12.50};
	private static final String caminho = "./src/mace/tabelas/";
	public boolean[] bv = {true, false, true};
	
	public ModeloTablePedidos() {}
	
	// implementacao dos metodos abstratos
	@Override
	public int getColumnCount() {
		return nomesColunas.length;
	}
	
	@Override
	public int getRowCount() {
		return produtos.length + 1;
	}
	
	@Override
	public Object getValueAt(int linha, int coluna) {
		
		Object resultado = new Object();
		
		if (linha < produtos.length) {
			switch(coluna) {
				case 0:
					resultado = produtos[linha];
					break;
				case 1:
					resultado = new ImageIcon(caminho + nomesImagens[linha]);
					break;
				case 2:
					resultado = new Double(precos[linha]);
					break;
				case 3:
					resultado = new Integer(quantidades[linha]);
					break;
				case 4:
					int quantidade = ((Integer) getValueAt(linha, 3)).intValue();
					double preco = ((Double) getValueAt(linha, 2)).doubleValue();
					resultado = new Double(quantidade * preco);
					break;
			}
		} else {
			switch(coluna) {
				case 0: 
					resultado = new String("SOMA");
					break;
				case 1: 
					resultado = new Object();
					break;
				case 2: 
					resultado = new Double(0.0);
					break;
				case 3: 
					resultado = new Integer(0);
					break;
				case 4: 
					double soma = 0.0;
					
					for (int i = 0; i < produtos.length; i++) {
						soma += ((Double) getValueAt(i, 4)).doubleValue();
					}
					
					resultado = new Double(soma);
					break;
			}
		}
		
		return resultado;
	}
	
	public String getColumnName(int coluna) {
		return(nomesColunas[coluna]);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int coluna) {
		return getValueAt(0, coluna).getClass();
	}
	
	// celulas na coluna 3 podem ser editadas
	public boolean isCellEditable(int linha, int coluna) {
		return (coluna == 3);
	}
	
	public void setValueAt(Object object, int linha, int coluna) {
		if (coluna == 3) {
			quantidades[linha] = ((Integer) object).intValue();
		}
		
		this.fireTableDataChanged();
	}
	
}