package GUI.Panels;


import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Data_Setup.Position;
import GUI.GUI_Wrapper;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.ParseException;
import java.awt.Font;
import javax.swing.JEditorPane;

@SuppressWarnings("serial")
public class Panel_Algorithm_1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtMac;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Algorithm_1 frame = new Panel_Algorithm_1();
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
	public Panel_Algorithm_1() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 613, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlgorithm = new JLabel("Algorithm 1");
		lblAlgorithm.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblAlgorithm.setForeground(Color.DARK_GRAY);
		lblAlgorithm.setBounds(238, 16, 117, 32);
		contentPane.add(lblAlgorithm);

		txtMac = new JTextField();
		txtMac.setFont(new Font("Segoe UI Semilight", Font.PLAIN, 18));
		txtMac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				txtMac.setText("");
			}
		});
		txtMac.setText("MAC");
		txtMac.setBounds(193, 68, 196, 32);
		contentPane.add(txtMac);
		txtMac.setColumns(10);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String mac = txtMac.getText();
				try {
					Position p = GUI_Wrapper.algo1Short(mac);
					textField.setText(""+p.lat);
					textField_1.setText(""+p.lon);
					textField_2.setText(""+p.alt);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
		btnSubmit.setBounds(238, 116, 115, 29);
		contentPane.add(btnSubmit);

		JLabel lblAlt = new JLabel("Lat");

		lblAlt.setBounds(93, 161, 69, 20);
		contentPane.add(lblAlt);

		JLabel lblLon = new JLabel("Lon");
		lblLon.setBounds(273, 161, 69, 20);
		contentPane.add(lblLon);

		JLabel lblLat = new JLabel("Alt");
		lblLat.setBounds(420, 161, 69, 20);
		contentPane.add(lblLat);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField.setEditable(false);
		textField.setBounds(34, 189, 167, 46);
		contentPane.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(216, 189, 160, 46);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(391, 189, 160, 46);
		contentPane.add(textField_2);

		JButton btnNewButton = new JButton("Export Algorithm 1 (All Data) to CSV File");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					GUI_Wrapper.exportAlgo1();
				} catch (IOException | ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(93, 272, 396, 32);
		contentPane.add(btnNewButton);

		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBackground(Color.DARK_GRAY);
		editorPane.setBounds(216, 48, 151, 4);
		contentPane.add(editorPane);
	}
}
