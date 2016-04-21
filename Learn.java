import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Component;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JMenuBar;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Learn {
	JFrame frmCryptographyTrainer;
	private ButtonGroup buttonGroup = new ButtonGroup();
	final JLabel lblSym = new JLabel("Pick a cipher to learn more!");
	//final JLabel lblPic = new JLabel("intro.jpg");
	ImageIcon img;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Learn window = new Learn();
					window.frmCryptographyTrainer.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Learn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCryptographyTrainer = new JFrame();
		frmCryptographyTrainer.setResizable(false);
		frmCryptographyTrainer.setTitle("Info");
		frmCryptographyTrainer.setBounds(100, 100, 818, 455);
		frmCryptographyTrainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCryptographyTrainer.getContentPane().setLayout(null);
		
		
		JRadioButton btnCaesar = new JRadioButton("Caesar");
		btnCaesar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonModel buttonModel = buttonGroup.getSelection();
				if (buttonModel != null){
					lblSym.setText("<html><body>Caesarian Cipher: <br>"
							+ "The Caesar cipher is one of the earliest <br>"
							+ " known and simplest ciphers. It is a type <br>"
							+ " of substitution cipher in which each <br>"
							+ "letter in the plaintext is 'shifted' <br>"
							+ "a certain number of places down the alphabet. <br>"
							+ "For example, with a shift of 1, A would be replaced by B,<br>"
							+ " B would become C, and so on. <br>"
							+ "See picture 2.</body></html>");
				}
			}
		});
		btnCaesar.setBounds(40, 120, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnCaesar);
		buttonGroup.add(btnCaesar);
		
		JRadioButton btnSymbol = new JRadioButton("Symbol");
		
		btnSymbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonModel buttonModel = buttonGroup.getSelection();
				if (buttonModel != null){
					lblSym.setText("<html><body>Symbol Cipher<br>This cipher uses the numeric<br>and punctuational symbols "
							+ "from <br> the keyboard to output a seemingly jumbled message. <br>"
							+ "For example, # could represent a or 3 could be y.<br>"
							+ "See picture 3.</body></html>");	
					img = new ImageIcon("caesar.png");
				}
			}
		});
		
		//JLabel lblSym = new JLabel("Symbol Cipher");
		lblSym.setFont(new Font("TI Uni", Font.BOLD, 18));
		lblSym.setBounds(400, 50, 362, 300);
		frmCryptographyTrainer.getContentPane().add(lblSym);
		
		btnSymbol.setBounds(40, 160, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnSymbol);
		buttonGroup.add(btnSymbol);
		
		JRadioButton btnAffine = new JRadioButton("Affine Cipher");
		btnAffine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonModel buttonModel = buttonGroup.getSelection();
				if (buttonModel != null){
					lblSym.setText("<html><body>Affine Cipher:<br>"
							+ "The affine cipher is a type of monoalphabetic <br>"
							+ "substitution cipher, wherein each letter in an alphabet<br>"
							+ " is mapped to its numeric equivalent, encrypted using a <br>" 
							+ "simple mathematical function, and converted back to a letter.<br>"
							+ "See picture 4.</body></html>");	
					
				}
			}
		});
		btnAffine.setBounds(40, 200, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnAffine);
		buttonGroup.add(btnAffine);
		
		JRadioButton btnMorse = new JRadioButton("Morse Code");
		btnMorse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ButtonModel buttonModel = buttonGroup.getSelection();
				if (buttonModel != null){
					lblSym.setText("<html><body>Morse Code: <br>"
							+ "An alphabet or code in which letters are represented <br>"
							+ " by combinations of long and short signals of light <br>"
							+ "or sound.  Most commonly used for communication through <br>"
							+ "telegrams before there were telephones.<br>"
							+ "See picture 5.</body></html>");
				}
			}
		});
		btnMorse.setBounds(40, 240, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnMorse);
		buttonGroup.add(btnMorse);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCryptographyTrainer.dispose();
			}
		});
		btnExit.setBounds(40, 314, 92, 43);
		frmCryptographyTrainer.getContentPane().add(btnExit);
		
		BufferedImage symbolPic = null;
		BufferedImage caesarPic = null;
		BufferedImage affinePic = null;
		BufferedImage introPic1 = null;
		BufferedImage morsePic = null;
		try {
			caesarPic = ImageIO.read(new File("CaesarPic.png"));
			affinePic = ImageIO.read(new File("affinePic.png"));
			introPic1 = ImageIO.read(new File("intro.jpg"));
			symbolPic = ImageIO.read(new File("symbolPic.png"));
			morsePic  = ImageIO.read(new File("morse_pic.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		JLabel CaesarPic = new JLabel(new ImageIcon(caesarPic));
		JLabel AffinePic = new JLabel(new ImageIcon(affinePic));
		AffinePic.setLocation(190, 300);
		AffinePic.setSize(210, 96);
		JLabel SymbolPic = new JLabel(new ImageIcon(symbolPic));
		SymbolPic.setLocation(190, 255);;
		SymbolPic.setSize(200,100);
		JLabel IntroPic = new JLabel(new ImageIcon(introPic1));
		IntroPic.setLocation(190, 40);
		IntroPic.setSize(200, 96);
		JLabel morseCPic = new JLabel(new ImageIcon(morsePic));
		morseCPic.setLocation(200, 345);
		morseCPic.setSize(160, 96);
		CaesarPic.setLocation(190, 80);
		CaesarPic.setSize(200, 260);
		frmCryptographyTrainer.getContentPane().add(CaesarPic);
		frmCryptographyTrainer.getContentPane().add(AffinePic);
		frmCryptographyTrainer.getContentPane().add(IntroPic);
		frmCryptographyTrainer.getContentPane().add(morseCPic);
		frmCryptographyTrainer.getContentPane().add(SymbolPic);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 812, 26);
		frmCryptographyTrainer.getContentPane().add(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New...");
		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCryptographyTrainer.dispose();
				
			}
		});
		mnFile.add(mntmNew);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mntmBack.setEnabled(false);
		mnFile.add(mntmBack);
		
		JMenuItem mntmExitProgram = new JMenuItem("Exit Program");
		mntmExitProgram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCryptographyTrainer.dispose();
			}
		});
		mnFile.add(mntmExitProgram);
	}


private void displayActionPerformed(java.awt.event.ActionEvent evt){
	ButtonModel buttonModel = buttonGroup.getSelection();
	if (buttonModel != null){
		String actionCommand = buttonModel.getActionCommand();
}}
	
}
