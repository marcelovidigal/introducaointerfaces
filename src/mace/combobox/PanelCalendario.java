package mace.combobox;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings({ "unchecked", "rawtypes" })
public class PanelCalendario extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private String[] meses = {	"Janeiro", "Fevereiro", "Marco", "Abril",
								"Maio", "Junho", "Julho", "Agosto",
								"Setembro", "Outubro", "Novembro", "Dezembro"};
	
	private JComboBox comboBoxAno = new JComboBox();
	private JComboBox comboBoxMes = new JComboBox(meses);
	private JComboBox comboBoxDia = new JComboBox();
	private JLabel labelAno = new JLabel("Ano ");
	private JLabel labelMes = new JLabel("Mes ");
	private JLabel labelDia = new JLabel("Dia ");
	private JLabel vazio = new JLabel("");
	private int anoInicial;
	private int anoFinal;
	
	public PanelCalendario() {
		this.setLayout(new GridLayout(4, 2));
		
		anoInicial = 2004;
		anoFinal = 2007;
		
		inicializarComboBox();
		
		this.add(labelDia);
		this.add(comboBoxDia);
		this.add(labelMes);
		this.add(comboBoxMes);
		this.add(labelAno);
		this.add(comboBoxAno);
		this.add(vazio);
		
		comboBoxAno.setEditable(true);
		ListenerCalendario listenerCalendario = new ListenerCalendario();
		comboBoxAno.setActionCommand("alteracaoano");
		comboBoxAno.addActionListener(listenerCalendario);
		comboBoxMes.setActionCommand("alteracaomes");
		comboBoxMes.addActionListener(listenerCalendario);
	}
	
	private void inicializarComboBox() {
		for (int ano = anoInicial; ano <= anoFinal; ano++) {
			comboBoxAno.addItem(Integer.toString(ano));
		}
		
		for (int dia = 1; dia <= 31; dia++) {
			comboBoxDia.addItem(Integer.toString(dia));
		}
		
		comboBoxMes.setMaximumRowCount(12);
		comboBoxDia.setMaximumRowCount(10);
		comboBoxAno.setMaximumRowCount(4);
	}
	
	private void setTamahoListaDia(int tamanho) {
		
		int tamanhoAtual = comboBoxDia.getItemCount();
		
		if (tamanhoAtual < tamanho) {
			for (int i = tamanhoAtual + 1; i <= tamanho; i++) {
				comboBoxDia.addItem(Integer.toString(i));
			}
		} else if (tamanhoAtual > tamanho) {
			for (int i = tamanhoAtual - 1; i >= tamanho; i--) {
				comboBoxDia.removeItemAt(i);
			}
		}
	}
	
	public String getData() {
		return ((String) comboBoxDia.getSelectedItem() + "." + (String) comboBoxMes.getSelectedItem() + " " + (String) comboBoxAno.getSelectedItem());
	}
	
	class ListenerCalendario implements ActionListener {
		
		public void actionPerformed(ActionEvent evt) {
			
			String actionCommand = evt.getActionCommand();
			
			int ano = Integer.parseInt(((String) comboBoxAno.getSelectedItem()).trim());
			int mes = comboBoxMes.getSelectedIndex();
			
			if ((ano > 2099) || (ano < 1901)) {
				ano = 2000;
				comboBoxAno.setSelectedItem("2000");
			}
			
			if (actionCommand.equals("alteracaoano")) {
				if ((ano % 4 == 0) && (mes == 1)) {
					setTamahoListaDia(29);
				}
			} else if (actionCommand.equals("alteracaomes")) {
				if ((mes == 0) || (mes == 2) || (mes == 4) || (mes == 6) || (mes == 7) || (mes == 9) || (mes == 11)) {
					setTamahoListaDia(31);
				} else if (mes == 1) {
					if (ano % 4 == 0) {
						setTamahoListaDia(29);
					} else {
						setTamahoListaDia(28);
					}
				} else {
					setTamahoListaDia(30);
				}
			}
		}
	}
	
}