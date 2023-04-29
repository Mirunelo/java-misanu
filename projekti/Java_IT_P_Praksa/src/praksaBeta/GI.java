package praksaBeta;

import javax.swing.JOptionPane;

public interface GI {

	public default void poruka(String string1, String string2) {
		JOptionPane.showMessageDialog(null, string2, string1, JOptionPane.INFORMATION_MESSAGE);
	}
	
}
