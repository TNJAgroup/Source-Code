import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.*;

import java.io.File;
import java.io.IOException;

public class GameGUI extends JFrame
{
	public GameGUI()
	{
		setTitle("Game");
		setSize(800,500);
		//GridBagLayout layout = new GridBagLayout();
		//setLayout(layout);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBackground(Color.white);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setVisible(true);
		GridBagConstraints menuConstraints = new GridBagConstraints();
		menuConstraints.gridx = 0;
		menuConstraints.gridy = 0;
		menuConstraints.anchor = GridBagConstraints.NORTH;
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem info = new JMenuItem("Information");
		mnFile.add(info);
		
		JMenuItem mntmExitProgram = new JMenuItem("Exit Program");
		mnFile.add(mntmExitProgram);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints panelConstraints = new GridBagConstraints();
		panelConstraints.gridx = 0;
		panelConstraints.gridy = 1;
		add(panel);
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridBagLayout());
		GridBagConstraints mainPanelConstraints = new GridBagConstraints();
		mainPanelConstraints.gridx = 0;
		mainPanelConstraints.gridy = 1;
		//mainPanel.setBackground(Color.white);
		//mainPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		panel.add(mainPanel,mainPanelConstraints);
		
		//First panel that displays choices
		JPanel scrollPanel = new JPanel();
		scrollPanel.setLayout(new GridBagLayout());
		//scrollPanel.setBackground(Color.white);
		//scrollPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		GridBagConstraints scrollpanelConstraints = new GridBagConstraints();
		scrollpanelConstraints.weightx = 0.5;
		scrollpanelConstraints.gridx = 0;
		scrollpanelConstraints.gridy = 1;
		scrollpanelConstraints.insets = new Insets(10,10,10,10);
		mainPanel.add(scrollPanel,scrollpanelConstraints);
		
		JTextField phraseNumberTitle= new JTextField("Phrase Number");
		GridBagConstraints phraseNumberTitleConstraints = new GridBagConstraints();
		//phraseNumberTitle.setBackground(Color.white);
		phraseNumberTitle.setEditable(false);
		phraseNumberTitle.setBorder(BorderFactory.createEmptyBorder());
		phraseNumberTitleConstraints.anchor = GridBagConstraints.WEST;
		phraseNumberTitleConstraints.gridx = 0;
		phraseNumberTitleConstraints.gridy = 0;
		phraseNumberTitleConstraints.insets = new Insets(10,10,10,10);
		scrollPanel.add(phraseNumberTitle, phraseNumberTitleConstraints);
		
		String[] phrase = new String[]{"1","2","3","4","5","6","7","8","9","10"};
		JComboBox<String> phraseNumber= new JComboBox<>(phrase);
		GridBagConstraints phraseNumberConstraints = new GridBagConstraints();
		phraseNumber.setBackground(Color.white);
		phraseNumberConstraints.anchor = GridBagConstraints.WEST;
		phraseNumberConstraints.gridx = 0;
		phraseNumberConstraints.gridy = 1;
		phraseNumberConstraints.ipadx = 100;
		phraseNumberConstraints.insets = new Insets(10,10,10,10);
		scrollPanel.add(phraseNumber, phraseNumberConstraints);
		
		String[] encryptionTypes = new String[]{"Caesarian Shift","Affine Cipher", "Morse Code","Symbolic Cipher"};
		JComboBox<String> encryptionEntry = new JComboBox<>(encryptionTypes);
		GridBagConstraints encryptionEntryConstraints = new GridBagConstraints();
		encryptionEntry.setEditable(false);
		encryptionEntry.setBackground(Color.white);
		encryptionEntryConstraints.weightx = 0.5;
		encryptionEntryConstraints.anchor = GridBagConstraints.WEST;
		encryptionEntryConstraints.gridx = 0;
		encryptionEntryConstraints.gridy = 2;
		encryptionEntryConstraints.ipadx = 100;
		encryptionEntryConstraints.insets = new Insets(10,10,10,10);
		scrollPanel.add(encryptionEntry, encryptionEntryConstraints);
		
		JButton startGame = new JButton("Start Game");
		GridBagConstraints startGameConstraints = new GridBagConstraints();
		startGameConstraints.gridx = 0;
		startGameConstraints.gridy = 3;
		startGameConstraints.insets = new Insets(10,10,10,10);
		scrollPanel.add(startGame, startGameConstraints);
		
		//Second Panel with user internal panels
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new GridBagLayout());
		//secondPanel.setBackground(Color.white);
		//secondPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		GridBagConstraints secondConstraints = new GridBagConstraints();
		secondConstraints.weightx = 0.5;
		secondConstraints.gridx = 1;
		secondConstraints.gridy = 1;
		secondConstraints.insets = new Insets(10,10,10,10);
		mainPanel.add(secondPanel,secondConstraints);
		
		JPanel message = new JPanel();
		message.setLayout(new GridBagLayout());
		//message.setBackground(Color.white);
		message.setBorder(BorderFactory.createEmptyBorder());
		GridBagConstraints messageCosntraints = new GridBagConstraints();
		messageCosntraints.weightx = 0.5;
		messageCosntraints.gridx = 0;
		messageCosntraints.gridy = 0;
		//messageCosntraints.ipadx = 50;
		messageCosntraints.insets = new Insets(10,10,10,10);
		secondPanel.add(message, messageCosntraints);
		
		JTextField encryptedMessage = new JTextField("Encrypted Message");
		GridBagConstraints encryptedMessageConstraints = new GridBagConstraints();
		encryptedMessage.setBackground(Color.white);
		encryptedMessage.setEditable(false);
		encryptedMessageConstraints.anchor = GridBagConstraints.WEST;
		encryptedMessageConstraints.gridx = 0;
		encryptedMessageConstraints.gridy = 0;
		//encryptedMessageConstraints.ipadx = 100;
		encryptedMessageConstraints.insets = new Insets(10,10,10,10);
		message.add(encryptedMessage, encryptedMessageConstraints);
		
		JPanel answerPanel = new JPanel();
		answerPanel.setLayout(new GridBagLayout());
		//answerPanel.setBackground(Color.white);
		answerPanel.setBorder(BorderFactory.createEmptyBorder());
		GridBagConstraints answerPanelConstraints = new GridBagConstraints();
		answerPanelConstraints.weightx = 0.5;
		answerPanelConstraints.gridx = 0;
		answerPanelConstraints.gridy = 1;
		//answerPanelConstraints.ipadx = 50;
		answerPanelConstraints.anchor = GridBagConstraints.WEST;
		secondPanel.add(answerPanel,answerPanelConstraints);
		
		JTextField letter1 = new JTextField();
		GridBagConstraints letter1Constraints = new GridBagConstraints();
		//letter1.setBackground(Color.white);
		//letter1Constraints.anchor = GridBagConstraints.WEST;
		letter1Constraints.weightx = 0.5;
		letter1Constraints.gridx = 0;
		letter1Constraints.gridy = 1;
		letter1Constraints.ipadx = 100;
		letter1Constraints.insets = new Insets(10,10,10,10);
		//answerPanel.add(letter1, letter1Constraints);
		
		JTextField letter2 = new JTextField();
		GridBagConstraints letter2Constraints = new GridBagConstraints();
		letter2.setBackground(Color.white);
		//letter2Constraints.anchor = GridBagConstraints.WEST;
		letter2Constraints.gridx = 0;
		letter2Constraints.gridy = 0;
		letter2Constraints.ipadx = 30;
		letter2Constraints.insets = new Insets(10,100,10,10);
		answerPanel.add(letter2, letter2Constraints);
		
		JTextField letter3 = new JTextField();
		GridBagConstraints letter3Constraints = new GridBagConstraints();
		letter3.setBackground(Color.white);
		//letter3Constraints.anchor = GridBagConstraints.WEST;
		letter3Constraints.gridx = 1;
		letter3Constraints.gridy = 0;
		letter3Constraints.ipadx = 30;
		letter3Constraints.insets = new Insets(10,10,10,10);
		answerPanel.add(letter3, letter3Constraints);
		
		JTextField letter4 = new JTextField();
		GridBagConstraints letter4Constraints = new GridBagConstraints();
		letter4.setBackground(Color.white);
		//letter4Constraints.anchor = GridBagConstraints.WEST;
		letter4Constraints.gridx = 2;
		letter4Constraints.gridy = 0;
		letter4Constraints.ipadx = 30;
		letter4Constraints.insets = new Insets(10,10,10,10);
		answerPanel.add(letter4, letter4Constraints);
		
		JTextField letter5 = new JTextField();
		GridBagConstraints letter5Constraints = new GridBagConstraints();
		letter5.setBackground(Color.white);
		//letter5Constraints.anchor = GridBagConstraints.WEST;
		letter5Constraints.gridx = 3;
		letter5Constraints.gridy = 0;
		letter5Constraints.ipadx = 30;
		letter5Constraints.insets = new Insets(10,10,10,10);
		answerPanel.add(letter5, letter5Constraints);
		
		JTextField letter6 = new JTextField();
		GridBagConstraints letter6Constraints = new GridBagConstraints();
		letter6.setBackground(Color.white);
		//letter6Constraints.anchor = GridBagConstraints.WEST;
		letter6Constraints.gridx = 4;
		letter6Constraints.gridy = 0;
		letter6Constraints.ipadx = 30;
		letter6Constraints.insets = new Insets(10,10,10,10);
		answerPanel.add(letter6, letter6Constraints);
		
		//Third Panel with user choices
		JPanel choicesPanel = new JPanel();
		choicesPanel.setLayout(new GridBagLayout());
		//choicesPanel.setBackground(Color.white);
		//choicesPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		GridBagConstraints choicesConstraints = new GridBagConstraints();
		choicesConstraints.weightx = 0.5;
		choicesConstraints.gridx = 0;
		choicesConstraints.gridy = 2;
		choicesConstraints.ipadx = 340;
		choicesConstraints.insets = new Insets(10,10,10,10);
		panel.add(choicesPanel,choicesConstraints);
		
		JButton checkInput = new JButton("Check Input");
		GridBagConstraints checkInputConstraints = new GridBagConstraints();
		checkInputConstraints.gridx = 0;
		checkInputConstraints.gridy = 0;
		checkInputConstraints.ipady = 20;
		checkInputConstraints.ipadx = 30;
		checkInputConstraints.insets = new Insets(10,10,10,50);
		choicesPanel.add(checkInput, checkInputConstraints);
		
		JButton solve = new JButton("Solve");
		GridBagConstraints solveConstraints = new GridBagConstraints();
		solveConstraints.gridx = 1;
		solveConstraints.gridy = 0;
		solveConstraints.ipady = 20;
		solveConstraints.ipadx = 60;
		solveConstraints.insets = new Insets(10,10,10,50);
		choicesPanel.add(solve, solveConstraints);
		
		JButton hint = new JButton("Hint");
		GridBagConstraints hintConstraints = new GridBagConstraints();
		hintConstraints.gridx = 2;
		hintConstraints.gridy = 0;
		hintConstraints.ipady = 20;
		hintConstraints.ipadx = 60;
		hintConstraints.insets = new Insets(10,10,10,50);
		choicesPanel.add(hint, hintConstraints);
		
		JButton exit = new JButton("Exit");
		GridBagConstraints exitConstraints = new GridBagConstraints();
		exitConstraints.gridx = 3;
		exitConstraints.gridy = 0;
		exitConstraints.ipady = 20;
		exitConstraints.ipadx = 60;
		exitConstraints.insets = new Insets(10,10,10,10);
		choicesPanel.add(exit, exitConstraints);
		
		BufferedImage gamePic = null;
		try 
		{
			gamePic = ImageIO.read(new File("games.jpg"));
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		JLabel game = new JLabel(new ImageIcon(gamePic));
		GridBagConstraints gameConstraints = new GridBagConstraints();
		gameConstraints.gridx = 0;
		gameConstraints.gridy = 0;
		gameConstraints.ipadx = 100;
		panel.add(game, gameConstraints);
		
		JFrame infoFrame = new JFrame();
		infoFrame.setSize(350, 200);
		GridBagLayout infolayout = new GridBagLayout();
		infoFrame.setLayout(infolayout);
		
		JTextField names = new JTextField("Developers:");
		names.setEditable(false);
		names.setBorder(BorderFactory.createEmptyBorder());
		GridBagConstraints namesConstraints = new GridBagConstraints();
		namesConstraints.gridx = 0;
		namesConstraints.gridy = 0;
		infoFrame.add(names,namesConstraints);
		
		JTextField names2 = new JTextField("Taylor Jones, Nick Rigert, Alyssa Crosby, Johnny Bac");
		names2.setEditable(false);
		names2.setBorder(BorderFactory.createEmptyBorder());
		GridBagConstraints names2Constraints = new GridBagConstraints();
		names2Constraints.gridx = 0;
		names2Constraints.gridy = 1;
		infoFrame.add(names2,names2Constraints);
		
		JTextField version = new JTextField("Version: 1.4.7");
		version.setEditable(false);
		version.setBorder(BorderFactory.createEmptyBorder());
		GridBagConstraints versionConstraints = new GridBagConstraints();
		versionConstraints.gridx = 0;
		versionConstraints.gridy = 2;
		infoFrame.add(version,versionConstraints);
		
		info.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				infoFrame.setVisible(true);
			}
		});
		
		mntmExitProgram.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				dispose();
			}
		});
		
		checkInput.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(letter1.getText().equals(Game.getAnswer()))
				{
					letter1.setBackground(Color.green);
				}
				else if(letter1.getText().equals(""))
				{
					
				}
				else
				{
					letter1.setBackground(Color.red);
				}
				
				if(letter2.getText().equals(String.valueOf(Game.getLetter(0))))
				{
					letter2.setBackground(Color.green);
				}
				else if(letter2.getText().equals(""))
				{
					
				}
				else
				{
					letter2.setBackground(Color.red);
				}
				
				if(letter3.getText().equals(String.valueOf(Game.getLetter(1))))
				{
					letter3.setBackground(Color.green);
				}
				else if(letter3.getText().equals(""))
				{
					
				}
				else
				{
					letter3.setBackground(Color.red);
				}
				
				if(letter4.getText().equals(String.valueOf(Game.getLetter(2))))
				{
					letter4.setBackground(Color.green);
				}
				else if(letter4.getText().equals(""))
				{
					
				}
				else
				{
					letter4.setBackground(Color.red);
				}
				
				if(letter5.getText().equals(String.valueOf(Game.getLetter(3))))
				{
					letter5.setBackground(Color.green);
				}
				else if(letter5.getText().equals(""))
				{
					
				}
				else
				{
					letter5.setBackground(Color.red);
				}
				if(letter6.getText().equals(String.valueOf(Game.getLetter(4))))
				{
					letter6.setBackground(Color.green);
				}
				
				else if(letter6.getText().equals(""))
				{
					
				}
				else
				{
					letter6.setBackground(Color.red);
				}				
			}
		});
		
		startGame.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Game.clearArray();
				letter1.setText("");
				letter2.setText("");
				letter3.setText("");
				letter4.setText("");
				letter5.setText("");
				letter6.setText("");
				letter1.setBackground(Color.white);
				letter2.setBackground(Color.white);
				letter3.setBackground(Color.white);
				letter4.setBackground(Color.white);
				letter5.setBackground(Color.white);
				letter6.setBackground(Color.white);
				try {
					Game.loadChoices();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				Game.getWord(Integer.parseInt(String.valueOf(phraseNumber.getSelectedItem()))-1);
				Game.splitWord();
				String choices = String.valueOf(encryptionEntry.getSelectedItem());
				if(choices.equals("Caesarian Shift"))
				{
					String text = Caesar.caesar_cipher(Game.getAnswer(), 5);
					encryptedMessage.setText(text);
				}
				else if(choices.equals("Symbolic Cipher"))
				{
					String text = Symbol.encrypt(Game.getAnswer(), 5);
					encryptedMessage.setText(text);
				}
				else if(choices.equals("Affine Cipher"))
				{
					Affine affinecipher = new Affine();
					affinecipher.setA(5);
					affinecipher.setB(8);
					affinecipher.setMessage(Game.getAnswer());
					affinecipher.encrypt();
					String text = affinecipher.getEncryptedMessage();
					encryptedMessage.setText(text);
				}
				else if(choices.equals("Morse Code"))
				{
					Morse morsecipher = new Morse();
					morsecipher.setMessage(Game.getAnswer());
					try {
						morsecipher.encrypt();
					} catch (CipherException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					String text = morsecipher.getEncryptedMessage();
					encryptedMessage.setText(text);
				}
			}
		});
		
		solve.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				letter1.setText(Game.getAnswer());
				letter1.setBackground(Color.white);
				letter2.setText(String.valueOf(Game.getLetter(0)));
				letter3.setText(String.valueOf(Game.getLetter(1)));
				letter4.setText(String.valueOf(Game.getLetter(2)));
				letter5.setText(String.valueOf(Game.getLetter(3)));
				letter6.setText(String.valueOf(Game.getLetter(4)));
			}
		});
		
		hint.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				letter4.setText(String.valueOf(Game.getLetter(2)));
				
			}
		});
		
		exit.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//setVisible(false);
				dispose();
			}
		});
	}
	
	public static void main(String[] args) 
	{
		JFrame mainframe = new GameGUI();
		mainframe.setVisible(true);
	}
}
