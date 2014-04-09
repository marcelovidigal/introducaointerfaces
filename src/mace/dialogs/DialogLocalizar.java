package mace.dialogs;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class DialogLocalizar extends JDialog {
	
	private static final long serialVersionUID = 1L;
	
	private JPanel panel = new JPanel();
	private JTextField textFieldLocalizar = new JTextField();
	private JRadioButton radioButtonSim = new JRadioButton("Sim");
	private JRadioButton radioButtonNao = new JRadioButton("Nao");
	private JButton buttonLocalizar = new JButton("Localizar");
	private JButton buttonCancelar = new JButton("Cancelar");
	private ObjetoTransferenciaDados objetoTransferenciaDados;
	private ButtonGroup buttonGroup = new ButtonGroup();
	
	public DialogLocalizar(Frame frame) {
		super(frame, "Localizar", true);
		
		JLabel labelLocalizar = new JLabel("Localizar palavra:");
		JLabel labelCaseSensitive = new JLabel("Case-sensitive?");
		JLabel espacoVazio = new JLabel(); // filler
		
		this.getContentPane().setLayout(new BorderLayout());
		this.setLocation(300, 300);
		this.getContentPane().add(panel, BorderLayout.CENTER);
		
		panel.setLayout(new GridLayout(4, 2, 10, 0));
		panel.add(labelLocalizar);
		panel.add(labelCaseSensitive);
		panel.add(textFieldLocalizar);
		panel.add(radioButtonSim);
		panel.add(espacoVazio);
		panel.add(radioButtonNao);
		panel.add(buttonLocalizar);
		panel.add(buttonCancelar);
		
		buttonGroup.add(radioButtonSim);
		buttonGroup.add(radioButtonNao);
		radioButtonSim.setActionCommand("actionCommandSim");
		radioButtonNao.setActionCommand("actionCommandNao");
		radioButtonSim.setSelected(true);
		radioButtonNao.setSelected(false);
		
		ListenerLocalizar listenerLocalizar = new ListenerLocalizar();
		buttonLocalizar.addActionListener(listenerLocalizar);
		buttonCancelar.addActionListener(listenerLocalizar);
		
		this.pack();
	}
	
	public void exibir(ObjetoTransferenciaDados objetoTransferenciaDados) {
		this.objetoTransferenciaDados = objetoTransferenciaDados;
		this.setVisible(true);
	}
	
	// classe interna
	class ListenerLocalizar implements ActionListener {

		// construtor nao definido, construtor padrao usado
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String textoLocalizar = textFieldLocalizar.getText();
			boolean caseSensitive = (buttonGroup.getSelection().getActionCommand().equals("actionCommandSim"));
			String actionCommand = e.getActionCommand();
			
			if (actionCommand.equals("Cancelar")) {
				objetoTransferenciaDados.setTudo(textoLocalizar, caseSensitive, false);
				
				// note que setVisible e um metodo da classe DialogLocalizar,
				// e nao da classe interna ListenerLocalizar
				setVisible(false);
			} else if (actionCommand.equals("Localizar")) {
				objetoTransferenciaDados.setTudo(textoLocalizar, caseSensitive, true);
				setVisible(false);
			}
		}
	}
	
}