package gui;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ParttimejobViewer extends JPanel {

	WindowFrame frame;
	
	public ParttimejobViewer(WindowFrame frame) {
		this.frame = frame;
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Time");
		model.addColumn("Hours");
		model.addColumn("Wage");
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
	}
	
}
