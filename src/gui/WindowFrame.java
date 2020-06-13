package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

import manager.ParttimeJobManager;

public class WindowFrame extends JFrame{

	ParttimeJobManager parttimeJobManager;
	MenuSelection menuselection;
	ParttimejobAdder parttimejobadder;
	ParttimejobViewer parttimejobviewer;

	public WindowFrame(ParttimeJobManager parttimeJobManager) {
		this.setSize(500, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("My Frame");

		this.parttimeJobManager = parttimeJobManager;
		this.menuselection = new MenuSelection(this);
		this.parttimejobadder = new ParttimejobAdder(this);
		this.parttimejobviewer = new ParttimejobViewer(this, this.parttimeJobManager);
	
		this.setupPanel(menuselection);

		this.setVisible(true);
	}

	public void setupPanel(JPanel panel) {
		this.getContentPane().removeAll();
		this.getContentPane().add(panel);
		this.revalidate();
		this.repaint();
	}

	public MenuSelection getMenuselection() {
		return menuselection;
	}

	public void setMenuselection(MenuSelection menuselection) {
		this.menuselection = menuselection;
	}

	public ParttimejobAdder getParttimejobadder() {
		return parttimejobadder;
	}

	public void setParttimejobadder(ParttimejobAdder parttimejobadder) {
		this.parttimejobadder = parttimejobadder;
	}

	public ParttimejobViewer getParttimejobviewer() {
		return parttimejobviewer;
	}

	public void setParttimejobviewer(ParttimejobViewer parttimejobviewer) {
		this.parttimejobviewer = parttimejobviewer;
	}

}
