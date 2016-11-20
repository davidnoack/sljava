/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_Kantine extends JFrame {

	private JButton btnAuswahl;
	private JComboBox cboAuswahl;
	private JLabel lblAuswahl;

	//Constructor 
	public GUI_Kantine(){

		this.setTitle("GUI_Kantine");
		this.setSize(193,88);
		//menu generate method

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(193,88));
		contentPane.setBackground(new Color(192,192,192));


		btnAuswahl = new JButton();
		btnAuswahl.setBounds(98,40,90,35);
		btnAuswahl.setBackground(new Color(214,217,223));
		btnAuswahl.setForeground(new Color(0,0,0));
		btnAuswahl.setEnabled(true);
		btnAuswahl.setFont(new Font("sansserif",0,12));
		btnAuswahl.setText("Weiter");
		btnAuswahl.setVisible(true);

		cboAuswahl = new JComboBox();
		cboAuswahl.setBounds(4,40,90,35);
		cboAuswahl.setBackground(new Color(214,217,223));
		cboAuswahl.setForeground(new Color(0,0,0));
		cboAuswahl.setEnabled(true);
		cboAuswahl.setFont(new Font("sansserif",0,12));
		cboAuswahl.setVisible(true);

		lblAuswahl = new JLabel();
		lblAuswahl.setBounds(6,7,179,29);
		lblAuswahl.setBackground(new Color(214,217,223));
		lblAuswahl.setForeground(new Color(0,0,0));
		lblAuswahl.setEnabled(true);
		lblAuswahl.setFont(new Font("sansserif",0,12));
		lblAuswahl.setText("Suchen Sie eine Kantine aus:");
		lblAuswahl.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(btnAuswahl);
		contentPane.add(cboAuswahl);
		contentPane.add(lblAuswahl);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_Kantine();
			}
		});
	}

}