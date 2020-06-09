package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.ParttimejobAdder;
import gui.ParttimejobViewer;
import gui.WindowFrame;

public class ButtonAddListener implements ActionListener {

	WindowFrame frame;
	
	public ButtonAddListener(WindowFrame frame) {
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton) e.getSource();
		ParttimejobAdder adder = frame.getParttimejobadder();
		frame.setupPanel(adder);
	}

}
