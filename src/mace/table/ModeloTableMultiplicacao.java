package mace.table;

import javax.swing.table.AbstractTableModel;

public class ModeloTableMultiplicacao extends AbstractTableModel {
	
	private static final long serialVersionUID = 1L;
	
	private int numeroLinhas, numeroColunas;
	
	public ModeloTableMultiplicacao(int linhas, int colunas) {
		numeroLinhas = linhas;
		numeroColunas = colunas;
	}
	
	// implementacao dos metodos abstratos
	@Override
	public int getColumnCount() {
		return numeroColunas;
	}

	@Override
	public int getRowCount() {
		return numeroLinhas;
	}

	@Override
	public Object getValueAt(int arg0, int arg1) {
		return new Integer(arg0 * arg1);
	}
	
	// overriding alguns metodos
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Class getColumnClass(int coluna){
		return getValueAt(0, coluna).getClass();
	}
	
	public String getColumnName(int coluna){
		return "Col " + coluna;
	}
	
}