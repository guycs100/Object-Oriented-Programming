package GUI.Panels;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import Algorithms.Mac_Hashmap;
import GUI.GUI_Wrapper;
import Memory.Data_Structures;

import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JEditorPane;
import java.awt.Color;

@SuppressWarnings("serial")
public class Panel_Algorithm_2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtMac;
	private JTextField txtMac_1;
	private JTextField txtMac_2;
	private JTextField txtSignal;
	private JTextField txtSignal_1;
	private JTextField txtSignal_2;
	private JTextField textField_5;
	private JTextField textField_1;
	private JTextField textField_2;
	private JLabel lblMac;
	private JLabel lblSignal;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnAddCombFile;
	private JButton btnSubmit;
	private JEditorPane editorPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel_Algorithm_2 frame = new Panel_Algorithm_2();
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
	public Panel_Algorithm_2() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 548, 685);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblAlgorithm = new JLabel("Algorithm 2");
		lblAlgorithm.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlgorithm.setFont(new Font("Segoe UI Semilight", Font.BOLD, 20));
		lblAlgorithm.setBounds(173, 16, 152, 35);
		contentPane.add(lblAlgorithm);

		textField = new JTextField();
		textField.setBounds(15, 107, 499, 26);
		contentPane.add(textField);
		textField.setColumns(10);


		txtMac = new JTextField();
		txtMac.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMac.setText("");

			}
		});
		txtMac.setText("MAC 1");
		txtMac.setBounds(37, 200, 146, 26);
		contentPane.add(txtMac);
		txtMac.setColumns(10);
		txtMac.setEnabled(false);
		txtMac.setVisible(true);
		txtMac.setEditable(false);
		JRadioButton jradio2 = new JRadioButton("Three Mac and Signal Input");
		jradio2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jradio2.isSelected())
				{

					textField.setEnabled(false);
					txtMac.setEnabled(true);
					txtMac_1.setEnabled(true);
					txtMac_2.setEnabled(true);			
					txtSignal.setEnabled(true);
					txtSignal_1.setEnabled(true);
					txtSignal_2.setEnabled(true);

					textField.setEditable(false);
					txtMac.setEditable(true);
					txtMac_1.setEditable(true);
					txtMac_2.setEditable(true);
					txtSignal.setEditable(true);
					txtSignal_1.setEditable(true);
					txtSignal_2.setEditable(true);

					txtMac.setText("MAC 1");
					txtMac_1.setText("MAC 2");
					txtMac_2.setText("MAC 3");
					txtSignal.setText("Signal 1");
					txtSignal_1.setText("Signal 2");
					txtSignal_2.setText("Signal 3");




				}
			}
		});
		jradio2.setBounds(15, 145, 252, 29);
		contentPane.add(jradio2);

		jradio2.setActionCommand("enable");
		jradio2.setEnabled(true);


		JRadioButton jradio = new JRadioButton("String Line From \"nogps\" File Input");
		jradio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jradio.isSelected())
				{

					textField.setEnabled(true);
					txtMac.setEnabled(false);
					txtMac_1.setEnabled(false);
					txtMac_2.setEnabled(false);

					txtSignal.setEnabled(false);
					txtSignal_1.setEnabled(false);
					txtSignal_2.setEnabled(false);

					textField.setEditable(true);
					txtMac.setEditable(false);
					txtMac_1.setEditable(false);
					txtMac_2.setEditable(false);
					txtSignal.setEditable(false);
					txtSignal_1.setEditable(false);
					txtSignal_2.setEditable(false);

					txtMac.setText("MAC 1");
					txtMac_1.setText("MAC 2");
					txtMac_2.setText("MAC 3");
					txtSignal.setText("Signal 1");
					txtSignal_1.setText("Signal 2");
					txtSignal_2.setText("Signal 3");

				}

			}
		});
		jradio.setBounds(15, 66, 293, 29);
		contentPane.add(jradio);
		jradio.setSelected(true);

		jradio.setActionCommand("enable");
		jradio.setEnabled(true);

		ButtonGroup bt=new ButtonGroup();
		bt.add(jradio);
		bt.add(jradio2);




		txtMac_1 = new JTextField();
		txtMac_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMac_1.setText("");
			}
		});
		txtMac_1.setText("MAC 2");
		txtMac_1.setColumns(10);
		txtMac_1.setBounds(37, 242, 146, 26);
		contentPane.add(txtMac_1);
		txtMac_1.setEnabled(false);
		txtMac_1.setVisible(true);
		txtMac_1.setEditable(false);
		txtMac_2 = new JTextField();

		txtMac_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtMac_2.setText("");
			}
		});
		txtMac_2.setText("MAC 3");
		txtMac_2.setColumns(10);
		txtMac_2.setBounds(37, 284, 146, 26);
		contentPane.add(txtMac_2);
		txtMac_2.setEnabled(false);
		txtMac_2.setVisible(true);
		txtMac_2.setEditable(false);
		txtSignal = new JTextField();
		txtSignal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtSignal.setText("");
			}
		});
		txtSignal.setText("Signal 1");
		txtSignal.setColumns(10);
		txtSignal.setBounds(267, 200, 146, 26);
		contentPane.add(txtSignal);
		txtSignal.setEnabled(false);
		txtSignal.setVisible(true);
		txtSignal.setEditable(false);
		txtSignal_1 = new JTextField();
		txtSignal_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtSignal_1.setText("");
			}
		});
		txtSignal_1.setText("Signal 2");
		txtSignal_1.setColumns(10);
		txtSignal_1.setBounds(267, 242, 146, 26);
		contentPane.add(txtSignal_1);
		txtSignal_1.setEnabled(false);
		txtSignal_1.setVisible(true);
		txtSignal_1.setEditable(false);
		txtSignal_2 = new JTextField();

		txtSignal_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				txtSignal_2.setText("");
			}
		});
		txtSignal_2.setText("Signal 3");
		txtSignal_2.setColumns(10);
		txtSignal_2.setBounds(267, 284, 146, 26);
		contentPane.add(txtSignal_2);
		txtSignal_2.setEnabled(false);
		txtSignal_2.setVisible(true);
		txtSignal_2.setEditable(false);

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBounds(191, 369, 134, 26);
		contentPane.add(textField_5);

		JLabel lblLat = new JLabel("Lat");
		lblLat.setBounds(66, 342, 69, 20);
		contentPane.add(lblLat);

		JLabel lblLon = new JLabel("Lon");
		lblLon.setBounds(240, 342, 69, 20);
		contentPane.add(lblLon);

		JLabel lblAlt = new JLabel("Alt");
		lblAlt.setBounds(409, 342, 69, 20);
		contentPane.add(lblAlt);

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(15, 369, 134, 26);
		contentPane.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(359, 369, 134, 26);
		contentPane.add(textField_2);

		lblMac = new JLabel("MAC");
		lblMac.setBounds(77, 174, 69, 20);
		contentPane.add(lblMac);

		lblSignal = new JLabel("Signal");
		lblSignal.setBounds(311, 174, 69, 20);
		contentPane.add(lblSignal);

		btnNewButton = new JButton("Export Algorithm 2 (All Data) to CSV File");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					GUI_Wrapper.exportAlgo2();
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(48, 544, 411, 29);
		contentPane.add(btnNewButton);

		btnNewButton_1 = new JButton("Add nogps File");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent args0) {

				try {
					GUI_Wrapper.chooseCSVFile("nogpsfile");
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Browse button to select directory


			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {


			}
		});


		btnNewButton_1.setBounds(78, 499, 170, 29);
		contentPane.add(btnNewButton_1);

		btnAddCombFile = new JButton("Add comb File");
		btnAddCombFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent args0) {
				try {
					GUI_Wrapper.chooseCSVFile("combfile");
				} catch (IOException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// Browse button to select directory


			}
		});
		btnAddCombFile.setBounds(263, 499, 181, 29);
		contentPane.add(btnAddCombFile);

		btnSubmit = new JButton("Submit");
		btnSubmit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(jradio2.isSelected()) {
					String m1 = txtMac.getText();
					String m2 = txtMac_1.getText();
					String m3 = txtMac_2.getText();
					String s1 = txtSignal.getText();
					String s2 = txtSignal_1.getText();
					String s3 = txtSignal_2.getText();


					ArrayList<String> Allm_Alls = new ArrayList<String>();

					Allm_Alls.add(m1);
					Allm_Alls.add(s1);
					Allm_Alls.add(m2);
					Allm_Alls.add(s2);
					Allm_Alls.add(m3);
					Allm_Alls.add(s3);


					try {
						GUI_Wrapper.algo2Short(Allm_Alls);
						textField_2.setText(""+Data_Structures.final_algo2_data.get(0).alt);
						textField_5.setText(""+Data_Structures.final_algo2_data.get(0).lon);
						textField_1.setText(""+Data_Structures.final_algo2_data.get(0).lat);
						Data_Structures.final_algo2_data.clear();
						Mac_Hashmap.hash.clear();
					} catch (IOException | ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
				else if(jradio.isSelected()) {

					String line = textField.getText();
					try {
						GUI_Wrapper.algo2Line(line);
						textField_2.setText(""+Data_Structures.final_algo2_data.get(0).alt);
						textField_5.setText(""+Data_Structures.final_algo2_data.get(0).lon);
						textField_1.setText(""+Data_Structures.final_algo2_data.get(0).lat);
						Data_Structures.final_algo2_data.clear();
						Mac_Hashmap.hash.clear();
					} catch (IOException | ParseException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}


				}
			}
		});

		btnSubmit.setBounds(164, 437, 197, 29);
		contentPane.add(btnSubmit);

		editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBackground(Color.DARK_GRAY);
		editorPane.setBounds(173, 49, 152, 2);
		contentPane.add(editorPane);

	}
}
