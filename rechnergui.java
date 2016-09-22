package klassen;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class rechnergui extends JFrame {

	private JPanel contentPane;
	private JTextField textField_5;
	private JTextField textField_2;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rechnergui frame = new rechnergui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public rechnergui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField_5 = new JTextField();
		textField_5.setBounds(203, 179, -30, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 98, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(32, 63, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Seite B");
		lblNewLabel.setBounds(128, 101, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Seite A");
		lblNewLabel_1.setBounds(128, 66, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Umfang");
		lblNewLabel_2.setBounds(25, 182, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Fl\u00E4che");
		lblNewLabel_3.setBounds(179, 182, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblBerechnungRechteck = new JLabel("Berechnung Rechteck");
		lblBerechnungRechteck.setBounds(155, 11, 111, 14);
		contentPane.add(lblBerechnungRechteck);
		
		JLabel umfang1 = new JLabel("");
		umfang1.setBounds(90, 182, 46, 14);
		contentPane.add(umfang1);
		
		JLabel flaeche1 = new JLabel("");
		flaeche1.setBounds(247, 182, 46, 14);
		contentPane.add(flaeche1);
		
		JButton btnNewButton = new JButton("Berechne!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (textField_1.getText().length() > 0 && textField_2.getText().length() > 0) {
					double seiteA = Double.parseDouble(textField_1.getText());
					double seiteB = Double.parseDouble(textField_2.getText());
					double flaeche = seiteA * seiteB;
					double umfang = 2 * seiteA + 2 * seiteB;
					umfang1.setText(String.valueOf(umfang));
					flaeche1.setText(String.valueOf(flaeche));
					
				}
			}
			
		});

		btnNewButton.setBounds(203, 80, 118, 23);
		contentPane.add(btnNewButton);
		
	}
}
