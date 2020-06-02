package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ParttimejobViewer extends JFrame {

	public ParttimejobViewer() {
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Time");
		model.addColumn("Hours");
		model.addColumn("Wage");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
		this.setSize(400, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
}
