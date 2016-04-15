/**
 * @author Johnny Bac
 * @version 1
 * Last Updated by: Johnny Bac
 * Last Date Changed: 4/14/2016 
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

    
                            
    private void initComponents() {

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
        MenuBar = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        FileClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Encrypt/Decrypt");

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

        File.setText("File");

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
                .addContainerGap(250, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OutputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OutputLabel))
                .addGap(62, 62, 62))
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
    }                                                

    private void CaesarianRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        AffineRadioButton.setSelected(false);
        SymbolicRadioButton.setSelected(false);
        MorseRadioButton.setSelected(false);
    }                                                    

    private void DecryptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(MorseRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            morsecipher.setEncryptedMessage(encryptedText);
            morsecipher.decrypt();
            String decryptedText = morsecipher.getMessage();
            OutputField.setText(decryptedText);
        }else if(CaesarianRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            String decryptedText = caesarcipher.caesar_cipher(encryptedText, -4);
            OutputField.setText(decryptedText);
        }else if(AffineRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            affinecipher.setA(5);
            affinecipher.setB(8);
            affinecipher.setEncryptedMessage(encryptedText);
            affinecipher.decrypt();
            String decryptedText = affinecipher.getMessage();
            OutputField.setText(decryptedText);
        }else if(SymbolicRadioButton.isSelected()) {
            String encryptedText = MessageField.getText();
            String decryptedText = symbolcipher.decrypt(encryptedText, 4);
            OutputField.setText(decryptedText);
        }else {
            // do nothing, no radio button was selected
        }
    }                                             

    private void AffineRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        SymbolicRadioButton.setSelected(false);
        MorseRadioButton.setSelected(false);
        CaesarianRadioButton.setSelected(false);
    }                                                 

    private void SymbolicRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        MorseRadioButton.setSelected(false);
        CaesarianRadioButton.setSelected(false);
        AffineRadioButton.setSelected(false);
    }                                                   

    private void EncryptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if(MorseRadioButton.isSelected()) {
            String decryptedText = MessageField.getText();
            morsecipher.setMessage(decryptedText);
            morsecipher.encrypt();
            String encryptedText = morsecipher.getEncryptedMessage();
            OutputField.setText(encryptedText);
        }else if(CaesarianRadioButton.isSelected()) {
            String decryptedText = MessageField.getText();
            String encryptedText = caesarcipher.caesar_cipher(decryptedText, 4);
            OutputField.setText(encryptedText);
        }else if(AffineRadioButton.isSelected()) {
            String decryptedText = MessageField.getText();
            affinecipher.setA(5);
            affinecipher.setB(8);
            affinecipher.setMessage(decryptedText);
            affinecipher.encrypt();
            String encryptedText = affinecipher.getEncryptedMessage();
            OutputField.setText(encryptedText);
        }else if(SymbolicRadioButton.isSelected()) {
            String decryptedText = MessageField.getText();
            String encryptedText = symbolcipher.encrypt(decryptedText, 4);
            OutputField.setText(encryptedText);
        }else {
            // do nothing, no radio button was selected
        }
    }                                             

    //Runs the GUI
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncryptDecryptGUI().setVisible(true);
            }
        });
    }

    //Variables for the GUI                    
    private javax.swing.JRadioButton AffineRadioButton;
    private javax.swing.JRadioButton CaesarianRadioButton;
    private javax.swing.JButton DecryptButton;
    private javax.swing.JButton EncryptButton;
    private javax.swing.JMenu File;
    private javax.swing.JMenuItem FileClose;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JTextField MessageField;
    private javax.swing.JLabel MessageLabel;
    private javax.swing.JRadioButton MorseRadioButton;
    private javax.swing.JTextField OutputField;
    private javax.swing.JLabel OutputLabel;
    private javax.swing.JRadioButton SymbolicRadioButton;
    private Morse morsecipher = new Morse();
    private Affine affinecipher = new Affine();
    private Symbol symbolcipher = new Symbol();
    private Caesar caesarcipher = new Caesar();
    
}
