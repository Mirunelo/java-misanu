package praksaBeta;

import javax.swing.JOptionPane;

public interface GI {

	public default void poruka(String tipPoruke, String poruka) {
		JOptionPane.showMessageDialog(null, poruka, tipPoruke, JOptionPane.INFORMATION_MESSAGE);
	}
	
}
