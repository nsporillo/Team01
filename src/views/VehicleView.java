package views;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import models.Vehicle;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;

public class VehicleView extends JFrame {

	private JPanel contentPane;
	private Vehicle vehicle;
	
	private JTextField vinField;
	private JTextField makeField;
	private JTextField yearField;
	private JTextField modelField;
	private JTextField priceField;
	private JTextField extColorField;
	private JTextField transmissionField;
	private JTextField trimField;
	private JTextField engineField;

	/**
	 * Create the frame.
	 */
	public VehicleView() {
		setTitle("Vehicle View");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 500, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 464, 335);
		contentPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		JLabel lblVin = new JLabel("VIN:");
		panel.add(lblVin);
		
		vinField = new JTextField();
		panel.add(vinField);
		vinField.setColumns(10);
		vinField.setEditable(false);
		
		JLabel lblMake = new JLabel("Make: ");
		panel.add(lblMake);
		
		makeField = new JTextField();
		panel.add(makeField);
		makeField.setColumns(10);
		makeField.setEditable(false);
		
		JLabel lblYear = new JLabel("Year:");
		panel.add(lblYear);
		
		yearField = new JTextField();
		panel.add(yearField);
		yearField.setEditable(false);
		yearField.setColumns(10);
		
		JLabel lblModel = new JLabel("Model: ");
		panel.add(lblModel);
		
		modelField = new JTextField();
		panel.add(modelField);
		modelField.setEditable(false);
		modelField.setColumns(10);
		
		JLabel lblPrice = new JLabel("Price:");
		panel.add(lblPrice);
		
		priceField = new JTextField();
		panel.add(priceField);
		priceField.setEditable(false);
		priceField.setColumns(10);
		
		JLabel lblExteriorColor = new JLabel("Color:");
		panel.add(lblExteriorColor);
		
		extColorField = new JTextField();
		panel.add(extColorField);
		extColorField.setEditable(false);
		extColorField.setColumns(10);
		
		JLabel lblTransmission = new JLabel("Transmission:");
		panel.add(lblTransmission);
		
		transmissionField = new JTextField();
		panel.add(transmissionField);
		transmissionField.setToolTipText("Vehicle Transmission");
		transmissionField.setEditable(false);
		transmissionField.setColumns(10);
		
		JLabel lblEngine = new JLabel("Engine: ");
		panel.add(lblEngine);
		
		engineField = new JTextField();
		panel.add(engineField);
		engineField.setEditable(false);
		engineField.setColumns(10);
		
		JLabel lblTrim = new JLabel("Bodystyle:");
		panel.add(lblTrim);
		
		trimField = new JTextField();
		panel.add(trimField);
		trimField.setToolTipText("Vehicle Trim type");
		trimField.setEditable(false);
		trimField.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(5, 150, 444, 2);
		contentPane.add(separator);
		
		JButton btnNewButton = new JButton("View Owner/Dealer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//TODO: Open either customer view if the car is owned by a customer
				//TODO: Or a dealer view if the car isnt sold yet
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(10, 357, 464, 93);
		contentPane.add(btnNewButton);
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
		this.vinField.setText(vehicle.getVin());
		this.makeField.setText(vehicle.getModel().getBrandName());
		this.engineField.setText(vehicle.getOption().getEngine());
		this.modelField.setText(vehicle.getModel().getBodyStyle());
		this.priceField.setText(String.valueOf(vehicle.getPrice()));
		
	}
}
