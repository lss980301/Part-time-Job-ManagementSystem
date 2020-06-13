package gui;

import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Parttimejob.ParttimeJobinput;
import manager.ParttimeJobManager;

public class ParttimejobViewer extends JPanel {

	WindowFrame frame;
	
	ParttimeJobManager parttimeJobManager;
	
	public ParttimejobViewer(WindowFrame frame, ParttimeJobManager parttimeJobManager) {
		this.frame = frame;
		this.parttimeJobManager = parttimeJobManager;
		
		System.out.println("***" + parttimeJobManager.size() + "***");
		
		DefaultTableModel model = new DefaultTableModel();
		model.addColumn("ID");
		model.addColumn("Name");
		model.addColumn("Time");
		model.addColumn("Hours");
		model.addColumn("Wage");
		
		for (int i=0; i < parttimeJobManager.size(); i++) {
			Vector row = new Vector();
			ParttimeJobinput pi = parttimeJobManager.get(i);
			row.add(pi.getID());
			row.add(pi.getName());
			row.add(pi.getTime());
			row.add(pi.getHours());
			row.add(pi.getWage());
			model.addRow(row);
		}
		
		JTable table = new JTable(model);
		JScrollPane sp = new JScrollPane(table); 
		
		this.add(sp);
	}
	
}
