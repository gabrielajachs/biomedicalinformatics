package atividade4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Questionario extends JDialog {

	private final JPanel contentPanel = new JPanel();
	
	private JRadioButton rdbtnNeutrofilos;
	private JRadioButton rdbtnMacrofagos;
	private JRadioButton rdbtnNaturalKillers;
	private JRadioButton rdbtnLinfocitosT;
	private JRadioButton rdbtnLinfocitosB;
	private String opcao;
	private static String resposta;
	private static String pergunta;
	private static String[] alternativas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			String[] alt = {"Neutrófilos", "Macrófagos", "Natural Killers", "Linfócitos T", "Linfócitos B"};
			setResposta("4");
			setPergunta("Qual a célula principal do sistema imunológico?");
			setAlternativas(alt);
			Questionario dialog = new Questionario();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Questionario() {
		setBounds(100, 100, 693, 380);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblPergunta = new JLabel("Qual a célula principal do sistema imunológico?");
			lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblPergunta.setBounds(76, 35, 504, 55);
			contentPanel.add(lblPergunta);
		}
		
		rdbtnNeutrofilos = new JRadioButton("Neutrófilos");
		rdbtnNeutrofilos.setBounds(76, 133, 109, 23);
		contentPanel.add(rdbtnNeutrofilos);
		
		rdbtnMacrofagos = new JRadioButton("Macrófagos");
		rdbtnMacrofagos.setBounds(76, 159, 109, 23);
		contentPanel.add(rdbtnMacrofagos);
		ButtonGroup group1 = null;
		group1.add(rdbtnMacrofagos);
		
		rdbtnNaturalKillers = new JRadioButton("Natural Killers");
		rdbtnNaturalKillers.setBounds(76, 185, 109, 23);
		contentPanel.add(rdbtnNaturalKillers);
		
		rdbtnLinfocitosT = new JRadioButton("Linfócitos T");
		rdbtnLinfocitosT.setBounds(76, 211, 109, 23);
		contentPanel.add(rdbtnLinfocitosT);
		
		rdbtnLinfocitosB = new JRadioButton("Linfócitos B");
		rdbtnLinfocitosB.setBounds(76, 237, 109, 23);
		contentPanel.add(rdbtnLinfocitosB);
		
		ButtonGroup group11 = new ButtonGroup();
		group11.add(rdbtnNeutrofilos);
		group11.add(rdbtnNaturalKillers);
		group11.add(rdbtnLinfocitosT);
		group11.add(rdbtnLinfocitosB);
		
		
		JButton btnVerifica = new JButton("Verifica");
		btnVerifica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
                if (rdbtnNeutrofilos.isSelected()) { 
  
                	opcao = "1"; 
                } 
  
                else if (rdbtnMacrofagos.isSelected()) { 
  
                	opcao = "2"; 
                } 
                else if (rdbtnNaturalKillers.isSelected()) { 
                	  
                	opcao = "3"; 
                }  else if (rdbtnLinfocitosT.isSelected()) { 
                	
                	opcao = "4"; 
                }  else if (rdbtnLinfocitosB.isSelected()) { 
  
                	opcao = "5"; 
                } 
                else {
                	opcao = "6";
                }
                
                if(opcao == getResposta()) {
                	opcao = "Correto!";
                }
                else {
                	opcao = "Errado!";
                }
 
                rdbtnNeutrofilos.setEnabled(false);
                rdbtnMacrofagos.setEnabled(false);
                rdbtnNaturalKillers.setEnabled(false);
                rdbtnLinfocitosT.setEnabled(false);
                rdbtnLinfocitosB.setEnabled(false);
                JOptionPane.showMessageDialog(Questionario.this, opcao);

                
             }
		});
		btnVerifica.setBounds(475, 289, 89, 23);
		contentPanel.add(btnVerifica);
	}
	
	
	public static void setResposta(String resp) {
		resposta = resp;
	}
	
	public String getResposta() {
		return resposta;
	}
	
	public static void setPergunta(String perg) {
		pergunta = perg;
	}
	
	public String getPergunta() {
		return pergunta;
	}
	
	public static void setAlternativas(String[] alt) {
		alternativas = alt;
	}
	
	public String[] getAlternativas() {
		return alternativas;
	}
	
}