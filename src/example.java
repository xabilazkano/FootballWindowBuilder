import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Dialog.ModalExclusionType;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JToggleButton;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DebugGraphics;
import java.awt.Color;

public class example extends JFrame {

	private JPanel contentPane;
	private JRadioButton rdbtnNewRadioButton;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtNameOfThe;
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
					example frame = new example();
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
	public example() {
		setAlwaysOnTop(true);
		setTitle("First example");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 452);
		contentPane = new JPanel();
		contentPane.setDebugGraphicsOptions(DebugGraphics.NONE_OPTION);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWhatToAdd = new JLabel("What to add");
		lblWhatToAdd.setBounds(10, 11, 100, 14);
		contentPane.add(lblWhatToAdd);
		
		rdbtnNewRadioButton = new JRadioButton("Player");
		rdbtnNewRadioButton.setBounds(10, 32, 109, 23);
		rdbtnNewRadioButton.setSelected(true);
		buttonGroup.add(rdbtnNewRadioButton);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Team");
		rdbtnNewRadioButton_1.setBounds(135, 32, 109, 23);
		buttonGroup.add(rdbtnNewRadioButton_1);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Match");
		rdbtnNewRadioButton_2.setBounds(246, 32, 109, 23);
		buttonGroup.add(rdbtnNewRadioButton_2);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JLabel lblProperties = new JLabel("Properties");
		lblProperties.setBounds(10, 85, 74, 14);
		contentPane.add(lblProperties);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 110, 46, 14);
		contentPane.add(lblName);
		
		txtNameOfThe = new JTextField();
		txtNameOfThe.setBounds(78, 107, 218, 20);
		txtNameOfThe.setToolTipText("Name of the player or team");
		contentPane.add(txtNameOfThe);
		txtNameOfThe.setColumns(10);
		
		JLabel lblSurnames = new JLabel("Surnames");
		lblSurnames.setBounds(10, 149, 59, 14);
		contentPane.add(lblSurnames);
		
		textField = new JTextField();
		textField.setBounds(78, 146, 218, 20);
		textField.setToolTipText("Surnames of the player");
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setBounds(10, 187, 46, 14);
		contentPane.add(lblAge);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Age of the player");
		textField_1.setBounds(78, 184, 218, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTeam = new JLabel("Team");
		lblTeam.setBounds(10, 224, 46, 14);
		contentPane.add(lblTeam);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Current team of the player");
		textField_2.setBounds(78, 221, 218, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Correctly added");
				System.exit(0);
				
			}
		});
		btnSubmit.setBounds(166, 365, 89, 23);
		contentPane.add(btnSubmit);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("English");
		comboBox.addItem("French");
		comboBox.addItem("Basque");
		comboBox.addItem("Japanese");
		comboBox.addItem("Mexican");
		comboBox.setBounds(78, 255, 100, 22);
		contentPane.add(comboBox);
		
		JLabel lblNationality = new JLabel("Nationality");
		lblNationality.setBounds(10, 259, 59, 14);
		contentPane.add(lblNationality);
		
		JSlider slider = new JSlider();
		slider.setForeground(Color.GREEN);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		slider.setPaintTicks(true);
		slider.setBounds(123, 304, 200, 38);
		contentPane.add(slider);
		
		JLabel lblPhisicalCondition = new JLabel("Phisical condition");
		lblPhisicalCondition.setBounds(10, 304, 100, 14);
		contentPane.add(lblPhisicalCondition);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnClose.setBounds(319, 365, 89, 23);
		contentPane.add(btnClose);
	}
}
