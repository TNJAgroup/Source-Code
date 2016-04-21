import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author Johnny Bac
 * @version 2
 * Last Updated by: Johnny Bac
 * Last Date Changed: 4/18/2016 
 *
 * The EncryptDecryptGUI class
 */
public class EncryptDecryptGUI extends javax.swing.JFrame {

    /**
     * Creates new form EncryptDecryptGUI
     */
    public EncryptDecryptGUI() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {

        ErrorWindow = new javax.swing.JDialog();
        ErrorWindowLabel = new javax.swing.JLabel();
        ExitErrorWindowButton = new javax.swing.JButton();
        MessageField = new javax.swing.JTextField();
        MessageLabel = new javax.swing.JLabel();
        AffineRadioButton = new javax.swing.JRadioButton();
        MorseRadioButton = new javax.swing.JRadioButton();
        SymbolicRadioButton = new javax.swing.JRadioButton();
        CaesarianRadioButton = new javax.swing.JRadioButton();
        EncryptButton = new javax.swing.JButton();
        DecryptButton = new javax.swing.JButton();
        OutputField = new javax.swing.JTextField();
        OutputLabel = new javax.swing.JLabel();
        AffinePanel = new javax.swing.JPanel();
        aValueLabel = new javax.swing.JLabel();
        aValueComboBox = new javax.swing.JComboBox<>();
        bValueLabel = new javax.swing.JLabel();
        bValueComboBox = new javax.swing.JComboBox<>();
        SymbolPanel = new javax.swing.JPanel();
        SymbolPanelLabel = new javax.swing.JLabel();
        SymbolShiftField = new javax.swing.JTextField();
        CaesarPanel = new javax.swing.JPanel();
        CaesarPanelLabel = new javax.swing.JLabel();
        CaesarShiftField = new javax.swing.JTextField();
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        FileInfo = new javax.swing.JMenuItem();
        FileClose = new javax.swing.JMenuItem();
        
        CaesarPanel.setVisible(false);
        SymbolPanel.setVisible(false);
        AffinePanel.setVisible(false);

        ErrorWindow.setTitle("Error Message");
        ErrorWindow.setFocusCycleRoot(false);
        ErrorWindow.setModalityType(java.awt.Dialog.ModalityType.DOCUMENT_MODAL);
        ErrorWindow.setResizable(false);
        ErrorWindow.setSize(new java.awt.Dimension(500, 500));

        ErrorWindowLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ErrorWindowLabel.setText("Invalid Morse!");

        ExitErrorWindowButton.setText("Exit");
        ExitErrorWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitErrorWindowButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ErrorWindowLayout = new javax.swing.GroupLayout(ErrorWindow.getContentPane());
        ErrorWindow.getContentPane().setLayout(ErrorWindowLayout);
        ErrorWindowLayout.setHorizontalGroup(
            ErrorWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrorWindowLayout.createSequentialGroup()
                .addGroup(ErrorWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ErrorWindowLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(ErrorWindowLabel))
                    .addGroup(ErrorWindowLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(ExitErrorWindowButton)))
                .addContainerGap(188, Short.MAX_VALUE))
        );
        ErrorWindowLayout.setVerticalGroup(
            ErrorWindowLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErrorWindowLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(ErrorWindowLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(ExitErrorWindowButton)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Encrypt/Decrypt");
        setPreferredSize(new java.awt.Dimension(700, 320));
        setResizable(false);
        setSize(new java.awt.Dimension(700, 320));

        MessageLabel.setText("Message");

        AffineRadioButton.setText("Affine");
        AffineRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AffineRadioButtonActionPerformed(evt);
            }
        });

        MorseRadioButton.setText("Morse");
        MorseRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MorseRadioButtonActionPerformed(evt);
            }
        });

        SymbolicRadioButton.setText("Symbolic");
        SymbolicRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SymbolicRadioButtonActionPerformed(evt);
            }
        });

        CaesarianRadioButton.setText("Caesarian");
        CaesarianRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaesarianRadioButtonActionPerformed(evt);
            }
        });

        EncryptButton.setText("Encrypt");
        EncryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EncryptButtonActionPerformed(evt);
            }
        });

        DecryptButton.setText("Decrypt");
        DecryptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecryptButtonActionPerformed(evt);
            }
        });

        OutputLabel.setText("Output");

        aValueLabel.setText("A value");

        aValueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "3", "5", "7", "9", "11", "15", "17", "19", "21", "23", "25" }));

        bValueLabel.setText("B value");

        bValueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25" }));

        javax.swing.GroupLayout AffinePanelLayout = new javax.swing.GroupLayout(AffinePanel);
        AffinePanel.setLayout(AffinePanelLayout);
        AffinePanelLayout.setHorizontalGroup(
            AffinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AffinePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AffinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AffinePanelLayout.createSequentialGroup()
                        .addComponent(aValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(aValueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(AffinePanelLayout.createSequentialGroup()
                        .addComponent(bValueLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bValueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AffinePanelLayout.setVerticalGroup(
            AffinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AffinePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AffinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(aValueLabel)
                    .addComponent(aValueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AffinePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bValueLabel)
                    .addComponent(bValueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SymbolPanelLabel.setText("Shift");

        javax.swing.GroupLayout SymbolPanelLayout = new javax.swing.GroupLayout(SymbolPanel);
        SymbolPanel.setLayout(SymbolPanelLayout);
        SymbolPanelLayout.setHorizontalGroup(
            SymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SymbolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SymbolPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SymbolShiftField, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addContainerGap())
        );
        SymbolPanelLayout.setVerticalGroup(
            SymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SymbolPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SymbolPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SymbolPanelLabel)
                    .addComponent(SymbolShiftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        CaesarPanelLabel.setText("Shift");

        javax.swing.GroupLayout CaesarPanelLayout = new javax.swing.GroupLayout(CaesarPanel);
        CaesarPanel.setLayout(CaesarPanelLayout);
        CaesarPanelLayout.setHorizontalGroup(
            CaesarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CaesarPanelLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaesarShiftField, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        CaesarPanelLayout.setVerticalGroup(
            CaesarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CaesarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(CaesarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CaesarPanelLabel)
                    .addComponent(CaesarShiftField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        File.setText("File");
        
        FileInfo.setText("Information");
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
		
		FileInfo.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				infoFrame.setVisible(true);
			}
		});
        File.add(FileInfo);
        
        FileClose.setText("Close");
        FileClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileCloseActionPerformed(evt);
            }
        });
        File.add(FileClose);
        

        MenuBar.add(File);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(MessageLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MorseRadioButton)
                            .addComponent(AffineRadioButton)
                            .addComponent(SymbolicRadioButton)
                            .addComponent(CaesarianRadioButton)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(OutputLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(EncryptButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DecryptButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MessageField, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AffinePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CaesarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SymbolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MessageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MessageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AffineRadioButton)
                            .addComponent(EncryptButton)
                            .addComponent(DecryptButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MorseRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SymbolicRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaesarianRadioButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OutputLabel))
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(SymbolPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaesarPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AffinePanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }                       

    private void FileCloseActionPerformed(java.awt.event.ActionEvent evt) {                                          
        this.dispose();
    }                                         

    private void MorseRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        CaesarianRadioButton.setSelected(false);
        AffineRadioButton.setSelected(false);
        SymbolicRadioButton.setSelected(false);
        AffinePanel.setVisible(false);
        SymbolPanel.setVisible(false);
        CaesarPanel.setVisible(false);
    }                                                

    private void CaesarianRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        AffineRadioButton.setSelected(false);
        SymbolicRadioButton.setSelected(false);
        MorseRadioButton.setSelected(false);
        AffinePanel.setVisible(false);
        SymbolPanel.setVisible(false);
        CaesarPanel.setVisible(true);
    }                                                    

    private void DecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	if(MorseRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            morsecipher.setEncryptedMessage(encryptedText);
            try {
            	morsecipher.decrypt();
            } catch (CipherException ex) {
            	ErrorWindow.setVisible(true);
            	ErrorWindowLabel.setText(ex.getMessage());
            	morsecipher.setMessage("");
            }
            String decryptedText = morsecipher.getMessage();
            OutputField.setText(decryptedText);
        }else if(CaesarianRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            int shift = Integer.parseInt(CaesarShiftField.getText());
            String decryptedText = caesarcipher.caesar_cipher(encryptedText, shift * -1);
            OutputField.setText(decryptedText);
        }else if(AffineRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            affinecipher.setA(Integer.parseInt(aValueComboBox.getSelectedItem().toString()));
            affinecipher.setB(Integer.parseInt(bValueComboBox.getSelectedItem().toString()));
            affinecipher.setEncryptedMessage(encryptedText);
            affinecipher.decrypt();
            String decryptedText = affinecipher.getMessage();
            OutputField.setText(decryptedText);
        }else if(SymbolicRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            int shift = Integer.parseInt(SymbolShiftField.getText());
            String decryptedText = symbolcipher.decrypt(encryptedText, shift * -1);
            OutputField.setText(decryptedText);
        }else {
            // do nothing, no radio button was selected
        }
    }                                             

    private void AffineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        SymbolicRadioButton.setSelected(false);
        MorseRadioButton.setSelected(false);
        CaesarianRadioButton.setSelected(false);
        SymbolPanel.setVisible(false);
        AffinePanel.setVisible(true);
        CaesarPanel.setVisible(false);
    }                                                 

    private void SymbolicRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        MorseRadioButton.setSelected(false);
        CaesarianRadioButton.setSelected(false);
        AffineRadioButton.setSelected(false);
        SymbolPanel.setVisible(true);
        AffinePanel.setVisible(false);
        CaesarPanel.setVisible(false);
    }                                                   

    private void EncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	if(MorseRadioButton.isSelected()) {
        	String decryptedText = MessageField.getText();
            morsecipher.setMessage(decryptedText);
            try {
            	morsecipher.encrypt();
            } catch (CipherException ex) {
            	ErrorWindow.setVisible(true);
            	ErrorWindowLabel.setText(ex.getMessage());
            	morsecipher.setEncryptedMessage("");
            }
            String encryptedText = morsecipher.getEncryptedMessage();
            OutputField.setText(encryptedText);
        }else if(CaesarianRadioButton.isSelected()) {
        	String decryptedText = MessageField.getText();
        	int shift = Integer.parseInt(CaesarShiftField.getText());
            String encryptedText = caesarcipher.caesar_cipher(decryptedText, shift);
            OutputField.setText(encryptedText);
        }else if(AffineRadioButton.isSelected()) {
        	String decryptedText = MessageField.getText();
            affinecipher.setA(Integer.parseInt(aValueComboBox.getSelectedItem().toString()));
            affinecipher.setB(Integer.parseInt(bValueComboBox.getSelectedItem().toString()));
            affinecipher.setMessage(decryptedText);
            affinecipher.encrypt();
            String encryptedText = affinecipher.getEncryptedMessage();
            OutputField.setText(encryptedText);
        }else if(SymbolicRadioButton.isSelected()) {
        	String decryptedText = MessageField.getText();
        	int shift = Integer.parseInt(SymbolShiftField.getText());
            String encryptedText = symbolcipher.encrypt(decryptedText, shift);
            OutputField.setText(encryptedText);
        }else {
            // do nothing, no radio button was selected
        }
    }                                             

    private void ExitErrorWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        ErrorWindow.setVisible(false);
    }                                                     

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptDecryptGUI().setVisible(true);
            }
        });
    }

                       
    private javax.swing.JPanel AffinePanel;
    private javax.swing.JRadioButton AffineRadioButton;
    private javax.swing.JPanel CaesarPanel;
    private javax.swing.JLabel CaesarPanelLabel;
    private javax.swing.JTextField CaesarShiftField;
    private javax.swing.JRadioButton CaesarianRadioButton;
    private javax.swing.JButton DecryptButton;
    private javax.swing.JButton EncryptButton;
    private javax.swing.JDialog ErrorWindow;
    private javax.swing.JLabel ErrorWindowLabel;
    private javax.swing.JButton ExitErrorWindowButton;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem FileInfo;
    private javax.swing.JMenuItem FileClose;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField MessageField;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JRadioButton MorseRadioButton;
    private javax.swing.JTextField OutputField;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JPanel SymbolPanel;
    private javax.swing.JLabel SymbolPanelLabel;
    private javax.swing.JTextField SymbolShiftField;
    private javax.swing.JRadioButton SymbolicRadioButton;
    private javax.swing.JComboBox<String> aValueComboBox;
    private javax.swing.JLabel aValueLabel;
    private javax.swing.JComboBox<String> bValueComboBox;
    private javax.swing.JLabel bValueLabel;
    private Morse morsecipher = new Morse();
    private Affine affinecipher = new Affine();
    private Symbol symbolcipher = new Symbol();
    private Caesar caesarcipher = new Caesar();                  
}
