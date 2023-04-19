package novicaLoto;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;

public class Loto extends JFrame {

	/**
	  	@author Novica Zivkovic 
	 */
	
	private static final long serialVersionUID = 4716786777318783824L;
	private JButton btn_Generisi;
	private Random rand;
	
	public int[] linijaX = { 1, 70, 130, 190, 250, 310, 399 };
	public int[] linijaY = { 390, 350, 390, 350, 390, 350, 390 };;	
	// private int mouseX, mouseY; // TODO <-- Promenljive za koordinate misa prilikom pomeranja prozora, implementirati u sledećoj iteraciji

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D graphic2d = (Graphics2D) g;
		graphic2d.setColor(Color.GREEN);
		graphic2d.setBackground(new Color(255, 255, 255, 0));
		graphic2d.setStroke(new BasicStroke(6));
		graphic2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		graphic2d.drawPolyline(linijaX, linijaY, 7);
		
	}

	public Loto() {
		

		setName("WindFrame");
		getContentPane().setName("contentPane");
		
		/** TODO popraviti kod da radi, pomera sadržaj prozora umesto sam prozor
		 * 
		getContentPane().addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				getContentPane().setLocation(e.getX()+e.getX() - mouseX, e.getY() - mouseY); // TODO <-- Ovde je problem getContentPane().
			}
		});
		getContentPane().addMouseListener(new MouseAdapter() { // TODO <-- getContentPane(). je problem, umesto ContentPane treba glavni frame
			@Override
			public void mousePressed(MouseEvent e) {
				mouseX = e.getX();
				mouseY = e.getY();
			}
		}); */
		
		setBackground(new Color(0, 36, 72));
		getContentPane().setBackground(new Color(0, 36, 72));
		setUndecorated(true);
		setTitle("Loto Generator");
		setSize(400, 400);
		setLocationRelativeTo(null); // Centriranje prozora postavljanjem odnosa pozicije prema relativnosti centra
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
		JPanel panel_Gornji = new JPanel();
		panel_Gornji.setOpaque(false);
		panel_Gornji.setBackground(new Color(0, 36, 72));
		panel_Gornji.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Loto Generator 2023 by Novica \u017Divkovi\u0107  ", TitledBorder.LEFT, TitledBorder.TOP, null, new Color(224, 255, 255)));
		FlowLayout fl_panel_Gornji = (FlowLayout) panel_Gornji.getLayout();
		fl_panel_Gornji.setAlignOnBaseline(true);
		getContentPane().add(panel_Gornji);
		
		Box verticalBox = Box.createVerticalBox();
		panel_Gornji.add(verticalBox);
		
		Component verticalStrut_1 = Box.createVerticalStrut(26);
		verticalBox.add(verticalStrut_1);
		
		JLabel label = new JLabel("- - - - - - -");
		label.setSize(new Dimension(0, 48));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(213, 255, 255));
		label.setFont(new Font("Arial Black", Font.PLAIN, 32));
		label.setAlignmentY(0.0f);
		verticalBox.add(label);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalBox.add(verticalStrut);
		
		
		JPanel panel_Donji = new JPanel();
		panel_Donji.setOpaque(false);
		panel_Donji.setBackground(new Color(0, 36, 72));
		panel_Donji.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel_Donji.setPreferredSize(new Dimension(0, 0));
		panel_Donji.setBorder(null);
		getContentPane().add(panel_Donji);
		panel_Donji.setLayout(new GridLayout(0, 1, 0, 0));
		
		Component verticalGlue_2_1 = Box.createVerticalGlue();
		panel_Donji.add(verticalGlue_2_1);
		
		Box horizontalBox = Box.createHorizontalBox();
		horizontalBox.setAlignmentY(Component.CENTER_ALIGNMENT);
		panel_Donji.add(horizontalBox);
		
		Component horizontalGlue_3 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_3);
		
		btn_Generisi = new JButton("Generiši Kombinaciju");
		horizontalBox.add(btn_Generisi);
		btn_Generisi.setMinimumSize(new Dimension(67, 23));
		btn_Generisi.setMaximumSize(new Dimension(67, 23));
		btn_Generisi.setPreferredSize(new Dimension(180, 60));
		btn_Generisi.setSize(new Dimension(180, 60));
		btn_Generisi.setFocusPainted(false);
		

		btn_Generisi.addActionListener(new ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
			
				String rez = "";
				int[] brojevi = new int[7];
				int brojac = 0;
			
				while (brojac < 7) {
					int broj = rand.nextInt(39) + 1;
					boolean Duplikat = false;
				
					for (int i = 0; i < brojac; i++) {
						if (brojevi[i] == broj) {
							Duplikat = true;
							break;
						}
					}
					if (!Duplikat) {
						brojevi[brojac] = broj;
						brojac++;
					}
				}
				for (int i = 0; i < 7; i++) {
					linijaY[i] = 380 - brojevi[i];
					rez = rez + String.valueOf(brojevi[i]);
					if(i != 6)
						rez = rez + " "; // dodaj razmak iza broja osim ako nije rec o poslednjem broju
				}
				label.setText(rez);
				repaint();
			}
		});
		
		Component horizontalGlue_1_1 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_1_1);
		
		JButton btnZatvori = new JButton("Zatvori");
		horizontalBox.add(btnZatvori);
		
		Component horizontalGlue_2 = Box.createHorizontalGlue();
		horizontalBox.add(horizontalGlue_2);
		
		Component verticalStrut_2 = Box.createVerticalStrut(20);
		panel_Donji.add(verticalStrut_2);
		btnZatvori.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				System.exit(0);
			}
		});

		rand = new Random();
	}

	public static void main(String[] args) {
		Loto app = new Loto();
		app.setVisible(true);
	}
}