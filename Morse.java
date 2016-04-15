/**
 * @author Johnny Bac
 * @version 2
 * Last Updated by: Johnny Bac
 * Last Date Changed: 4/14/2016 
 *
 * The Morse class
 */

public class Morse extends Encryption {
   private final char[] validMorseChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
                                    'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                                    'Y', 'Z', '.', ',', '?', '!', '\'', '"', ':', '1', '2', '3',
                                    '4', '5', '6', '7', '8', '9', '0'};
   private final String[] morseCode = {".-", "-...", "-.-.", "-..", "-..", ".", "..-.", "--.", "....", 
                                 "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", 
                                 ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", 
                                 ".-.-.-", "--..--", "..--..", "..--.", ".----.", ".-..-.", "---...",
                                 ".----", "..---", "...--", "....-", ".....", "-....", "--...", "---..",
                                 "----.", "-----"}; 
   public Morse() {
	   super();
   }
   
   public void encrypt() {
      String unencryptedTemp = this.getMessage();
      String encryptedTemp = "";
      
      unencryptedTemp.toUpperCase();
      for(int i = 0; i < unencryptedTemp.length(); i++) {
         for(int j = 0; j < validMorseChars.length; j++) {
            if(validMorseChars[j] == unencryptedTemp.charAt(i)) {
              encryptedTemp = encryptedTemp + morseCode[j] + " ";
            }else if(unencryptedTemp.charAt(i) == ' ') {
              encryptedTemp = encryptedTemp + "| ";
            }else {
               //invalid character
               System.out.println("Input Error");
            }
         }
      }
      this.setEncryptedMessage(encryptedTemp);
      
   }
   
   public void decrypt() {
      String encryptedTemp = this.getEncryptedMessage();
      char[] encryptedChars = new char[encryptedTemp.length()];
      String morseLetter = "";
      String morseWord = "";
      //Puts all the characters in the encrypted 
      encryptedTemp.getChars(0, encryptedTemp.length(), encryptedChars, 0);
      String unencryptedTemp = "";
      for(int i = 0; i < encryptedChars.length; i++) {
         if(encryptedChars[i] == ' ') {
        	 morseWord = morseWord + decryptHelper(morseLetter);
        	 morseLetter = "";
         }else if(encryptedChars[i] == '|') {
        	 unencryptedTemp = unencryptedTemp + morseWord;
        	 morseWord = "";
         }else if(encryptedChars[i] == '.' || encryptedChars[i] == '-') {
        	 morseLetter = morseLetter + encryptedChars[i];
         }else {
        	 System.out.println("Input Error");
         }
      }
      this.setMessage(unencryptedTemp);
   }
   
   private char decryptHelper(String morseLetter) {
	   for(int i = 0; i < morseCode.length; i++) {
		   if(morseCode[i].equals(morseLetter)) {
			   return validMorseChars[i];
		   }
	   }
	   return ' ';
   }
   
}