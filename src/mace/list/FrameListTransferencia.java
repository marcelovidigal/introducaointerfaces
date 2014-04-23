package mace.list;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import mace.framesimples.FrameSimples;

public class FrameListTransferencia extends FrameSimples {
	
	private static final long serialVersionUID = 1L;
	
	private JList<String> listEsquerda, listDireita;
	private DefaultListModel<String> defaultListModel;
	JButton buttonTransferencia;
	
	String[] estados = {"Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", 
						"Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", 
						"Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", 
						"Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", 
						"Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", 
						"Santa Catarina", "São Paulo", "Sergipe", "Tocantins"};
	
	public FrameListTransferencia() {
		this.setSize(400, 300);
		
		listEsquerda = new JList<String>(estados);
		defaultListModel = new DefaultListModel<String>();
		listDireita = new JList<String>(defaultListModel);
		
		listEsquerda.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		ListenerTransferencia listenerTransferencia = new ListenerTransferencia();
		listEsquerda.addListSelectionListener(listenerTransferencia);
		
		JPanel panelList = new JPanel();
		panelList.setLayout(new GridLayout(1, 2));
		JScrollPane scrollPaneEsquerda = new JScrollPane(listEsquerda);
		JScrollPane scrollPaneDireita = new JScrollPane(listDireita);
		panelList.add(scrollPaneEsquerda);
		panelList.add(scrollPaneDireita);
		
		this.getContentPane().add(panelList, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		FrameListTransferencia frameListTransferencia = new FrameListTransferencia();
		frameListTransferencia.exibir("Frame com Lista e Transferencia");
	}
	
	// listener como classe interna
	class ListenerTransferencia implements ListSelectionListener {
		
		public ListenerTransferencia() {}
		
		@Override
		public void valueChanged(ListSelectionEvent arg0) {
			if (!arg0.getValueIsAdjusting()) {
				
				String valorSelecionado = (String) listEsquerda.getSelectedValue();
				
				if (defaultListModel.contains(valorSelecionado)) {
					defaultListModel.removeElement(valorSelecionado);
				} else {
					defaultListModel.addElement(valorSelecionado);
				}
			}
		}
	}
	
}