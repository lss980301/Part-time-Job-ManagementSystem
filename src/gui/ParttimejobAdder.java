package gui;

import javax.swing.*;

public class ParttimejobAdder extends JPanel {

	WindowFrame frame;
	
	public ParttimejobAdder(WindowFrame frame) {
		this.frame = frame;
		
		JPanel panel = new JPanel();
		panel .setLayout(new SpringLayout());

		JLabel labelID = new JLabel("ID : ", JLabel.TRAILING);
		JTextField fieldID = new JTextField(10);
		labelID.setLabelFor(fieldID);
		panel.add(labelID);
		panel.add(fieldID);

		JLabel labelName = new JLabel("Name : ", JLabel.TRAILING);
		JTextField fieldName = new JTextField(10);
		labelName.setLabelFor(fieldName);
		panel.add(labelName);
		panel.add(fieldName);

		JLabel labelTime = new JLabel("Time : ", JLabel.TRAILING);
		JTextField fieldTime = new JTextField(10);
		labelTime.setLabelFor(fieldTime);
		panel.add(labelTime);
		panel.add(fieldTime);

		JLabel labelHours = new JLabel("Hours : ", JLabel.TRAILING);
		JTextField fieldHours = new JTextField(10);
		labelHours.setLabelFor(fieldHours);
		panel.add(labelHours);
		panel.add(fieldHours);

		JLabel labelWage = new JLabel("Wage : ", JLabel.TRAILING);
		JTextField fieldWage = new JTextField(10);
		labelWage.setLabelFor(fieldWage);
		panel.add(labelWage);
		panel.add(fieldWage);

		panel.add(new JButton("save"));
		panel.add(new JButton("cancel"));

		SpringUtilities.makeCompactGrid(panel, 6, 2, 6, 6, 6, 6);


		this.add(panel);
		this.setVisible(true);
	}

}
