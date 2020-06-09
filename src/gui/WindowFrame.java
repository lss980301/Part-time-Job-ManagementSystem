package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowFrame extends JFrame{
	
	MenuSelection menuselection;
	ParttimejobAdder parttimejobadder;
	ParttimejobViewer parttimejobviewer;
	
	public WindowFrame() {
		this.menuselection = new MenuSelection(this);
		this.parttimejobadder = new ParttimejobAdder(this);
		this.parttimejobviewer = new ParttimejobViewer(this);
		
		this.setSize(450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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
