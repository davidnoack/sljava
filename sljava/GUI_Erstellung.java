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
import java.io.*;


public class GUI_Erstellung extends JFrame {

    private JMenuBar menuBar;
    private JButton btnHitliste;
    private JButton btnRezepte;
    private JButton btnMenue;
    public JLabel lblHitliste;
    public JLabel lblHitlistePfad;
    private JLabel lblRezept;
    private JLabel lblRezeptPfad;
    private Desktop desktop;

    //Constructor 
    public GUI_Erstellung(){

        this.setTitle("Speiseplanerzeugung");
        this.setSize(600,200);
        this.setResizable(false);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(600,200));
        
        contentPane.setBackground(new Color(192,192,192));

        desktop = Desktop.getDesktop();
        
        btnHitliste = new JButton();
        btnHitliste.setBounds(5,42,140,35);
        btnHitliste.setBackground(new Color(214,217,223));
        btnHitliste.setForeground(new Color(0,0,0));
        btnHitliste.setEnabled(true);
        btnHitliste.setFont(new Font("sansserif",0,12));
        btnHitliste.setText("Hitliste anzeigen");
        btnHitliste.setVisible(true);
        btnHitliste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});

        btnMenue = new JButton();
        btnMenue.setBounds(5,79,140,35);
        btnMenue.setBackground(new Color(214,217,223));
        btnMenue.setForeground(new Color(0,0,0));
        btnMenue.setEnabled(true);
        btnMenue.setFont(new Font("sansserif",0,12));
        btnMenue.setText("Menü erzeugen");
        btnMenue.setVisible(true);
        btnMenue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});
        
        btnRezepte = new JButton();
        btnRezepte.setBounds(5,5,140,35);
        btnRezepte.setBackground(new Color(214,217,223));
        btnRezepte.setForeground(new Color(0,0,0));
        btnRezepte.setEnabled(true);
        btnRezepte.setFont(new Font("sansserif",0,12));
        btnRezepte.setText("Rezepte anzeigen");
        btnRezepte.setVisible(true);
        btnRezepte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});

        lblHitliste = new JLabel();
        lblHitliste.setBounds(150,42,55,35);
        lblHitliste.setBackground(new Color(214,217,223));
        lblHitliste.setForeground(new Color(0,0,0));
        lblHitliste.setEnabled(true);
        lblHitliste.setFont(new Font("sansserif",0,12));
        lblHitliste.setText("Hitliste: ");
        lblHitliste.setVisible(true);

        lblHitlistePfad = new JLabel();
        lblHitlistePfad.setBounds(210,42,300,35);
        lblHitlistePfad.setBackground(new Color(214,217,223));
        lblHitlistePfad.setForeground(new Color(0,0,0));
        lblHitlistePfad.setEnabled(true);
        lblHitlistePfad.setFont(new Font("sansserif",0,12));
        lblHitlistePfad.setText("C:/Users/Janis.DESKTOP-7S89D1B/Downloads");
        lblHitlistePfad.setVisible(true);
        
        lblRezept = new JLabel();
        lblRezept.setBounds(150,5,55,35);
        lblRezept.setBackground(new Color(214,217,223));
        lblRezept.setForeground(new Color(0,0,0));
        lblRezept.setEnabled(true);
        lblRezept.setFont(new Font("sansserif",0,12));
        lblRezept.setText("Rezepte: ");
        lblRezept.setVisible(true);

        lblRezeptPfad = new JLabel();
        lblRezeptPfad.setBounds(210,5,300,35);
        lblRezeptPfad.setBackground(new Color(214,217,223));
        lblRezeptPfad.setForeground(new Color(0,0,0));
        lblRezeptPfad.setEnabled(true);
        lblRezeptPfad.setFont(new Font("sansserif",0,12));
        lblRezeptPfad.setText("C:/Users/Janis.DESKTOP-7S89D1B/Downloads");
        lblRezeptPfad.setVisible(true);
        
        //adding components to contentPane panel
        contentPane.add(btnHitliste);
        contentPane.add(btnRezepte);
        contentPane.add(btnMenue);
        contentPane.add(lblHitliste);
        contentPane.add(lblRezept);
        contentPane.add(lblHitlistePfad);
        contentPane.add(lblRezeptPfad);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu dateien = new JMenu("Dateien");
        JMenu einstellungen = new JMenu("Einstellungen");
        JMenu hilfe = new JMenu("Hilfe");
        JMenuItem rezepte = new JMenuItem("Rezepte");
        JMenuItem hitliste = new JMenuItem("Hitliste");
        JMenuItem anzeigen = new JMenuItem("Anzeigen");
        JMenuItem info = new JMenuItem("Info");
        JMenuItem beenden = new JMenuItem("Beenden ");
        
        //Setings action for menu item
		//Call defined method
		rezepte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});
		hitliste.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});
		anzeigen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});
		info.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});
		beenden.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				act(evt);
			}
		});
        
        dateien.add(rezepte);
        dateien.add(hitliste);
        
        hilfe.add(info);
        hilfe.addSeparator();
        hilfe.add(beenden);

        einstellungen.add(anzeigen);
        
        menuBar.add(dateien);
        menuBar.add(einstellungen);
        menuBar.add(hilfe);
    }

     public static void main(String[] args){
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new GUI_Erstellung();
            }
        });
    }
    
	 private void act(ActionEvent evts) {    	     
	    String s = evts.toString();
	    String[] ss = s.split("text=");
	    String[] sss = ss[1].split(",");
	    String ssss = sss[0];
	    switch(ssss){ 
        case "menu": 
            System.out.println("Menue erstellen");
            break;
        case "rezepte": 
            System.out.println("Rezepte anzeigen");
            break;
        case "Hitliste anzeigen": 
            System.out.println("Hitliste anzeigen");
            try{
                desktop.open(new File("C:/Users/Janis.DESKTOP-7S89D1B/Desktop/hitliste.txt"));
            }catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            break;
        case "rezeptpfad": 
            System.out.println("Rezeptpfad wechseln");   
            break;
        case "hitlistenpfad": 
            System.out.println("Hitlistenpfad wechseln");
            break;
        case "einstellungen": 
            System.out.println("Einstellungen anzeigen");  
            break;
        case "info": 
            System.out.println("Info anzeigen"); 
            break;
        case "beenden":
            System.out.println("Beenden der Applikation"); 
            System.exit(0);
        default: 
            System.out.println("Eingabe nicht vorhanden!"); 
        } 
    } 
}