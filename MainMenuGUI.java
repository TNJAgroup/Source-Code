import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.*;
import java.awt.*;


public class MainMenuGUI {
	
	private JFrame frmCryptographyTrainer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainMenuGUI window = new MainMenuGUI();
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
	public MainMenuGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCryptographyTrainer = new JFrame();
		frmCryptographyTrainer.setResizable(false);
		frmCryptographyTrainer.setTitle("Cryptography Trainer");
		frmCryptographyTrainer.setBounds(100, 100, 818, 455);
		frmCryptographyTrainer.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCryptographyTrainer.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Encrypt/Decrypt");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setBounds(46, 314, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnNewButton);
		
		JButton btnLearnAboutCiphers = new JButton("Cipher Learning");
		btnLearnAboutCiphers.setBounds(237, 314, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnLearnAboutCiphers);
		
		JButton btnPlayGame = new JButton("Play Game");
		btnPlayGame.setBounds(430, 314, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnPlayGame);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frmCryptographyTrainer.dispose();
			}
		});
		btnExit.setBounds(619, 314, 146, 53);
		frmCryptographyTrainer.getContentPane().add(btnExit);
		
		JLabel lblWelcomeTo = new JLabel("Welcome to Cryptography Trainer!");
		lblWelcomeTo.setFont(new Font("TI Uni", Font.BOLD, 18));
		lblWelcomeTo.setBounds(219, 44, 362, 41);
		frmCryptographyTrainer.getContentPane().add(lblWelcomeTo);
		
		JLabel lblMainMenu = new JLabel("Main Menu");
		lblMainMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMainMenu.setFont(new Font("TI Uni", Font.BOLD, 18));
		lblMainMenu.setBounds(219, 101, 362, 41);
		frmCryptographyTrainer.getContentPane().add(lblMainMenu);
		
		BufferedImage edPic = null;
		BufferedImage learnPic = null;
		BufferedImage gamePic = null;
		BufferedImage exitPic = null;
		try {
			edPic = ImageIO.read(new File("ctmm.jpg"));
			learnPic = ImageIO.read(new File("lacmm.jpg"));
			gamePic = ImageIO.read(new File("gmm.png"));
			exitPic = ImageIO.read(new File("dbmm.png"));
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		JLabel encryptDecryptPic = new JLabel(new ImageIcon(edPic));
		JLabel learnCipherPic = new JLabel(new ImageIcon(learnPic));
		learnCipherPic.setLocation(246, 194);
		learnCipherPic.setSize(126, 96);
		JLabel playGamePic = new JLabel(new ImageIcon(gamePic));
		playGamePic.setLocation(440, 194);
		playGamePic.setSize(126, 96);
		JLabel exitButtonPic = new JLabel(new ImageIcon(exitPic));
		exitButtonPic.setLocation(628, 194);
		exitButtonPic.setSize(126, 96);
		encryptDecryptPic.setLocation(56, 194);
		encryptDecryptPic.setSize(126, 96);
		frmCryptographyTrainer.getContentPane().add(encryptDecryptPic);
		frmCryptographyTrainer.getContentPane().add(learnCipherPic);
		frmCryptographyTrainer.getContentPane().add(playGamePic);
		frmCryptographyTrainer.getContentPane().add(exitButtonPic);
		
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
		
		btnPlayGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame gameGUI = new GameGUI();
				gameGUI.setVisible(true);
			}
		});
		
		btnLearnAboutCiphers.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Learn window = new Learn();
				window.frmCryptographyTrainer.setVisible(true);
			}
		});
		
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new EncryptDecryptGUI().setVisible(true);
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
}
