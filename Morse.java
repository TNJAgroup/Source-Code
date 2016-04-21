/**
 * @author Johnny Bac
 * @version 3
 * Last Updated by: Johnny Bac
 * Last Date Changed: 4/17/2016 
 *
 * The Morse class takes a text message and converts it to morse code and also
 * takes morse code and converts it back to text message.
 */

public class Morse extends Encryption {
   private final char[] validMorseChars = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 
                                    'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                                    'Y', 'Z', '.', ',', '?', '!', '\'', '\"', ':', '1', '2', '3',
                                    '4', '5', '6', '7', '8', '9', '0'};
   private final String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", 
                                 ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", 
                                 "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".-.-.-", 
                                 "--..--", "..--..", "..--.", ".----.", ".-..-.", "---...", ".----",
                                 "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                                 "-----"}; 
   /**
    * Default constructor that sets the data field empty.
    */
   public Morse() {
	   super();
   }
   
   /**
    * 
    * @param aMessage an unencrypted message
    * @param aEncryptedMessage an encrypted message in morse code
    */
   public Morse(String aMessage, String aEncryptedMessage) {
	   super(aMessage, aEncryptedMessage);
   }
   
   /**
    * encrypt() takes the unencrypted message stored in the data field and converts it to Morse code and stores it in the
    * encrypted message data field.  
    * @throws CipherException if a invalid character was provided in the message
    */
   public void encrypt() throws CipherException {
	   
	  String unencryptedTemp = this.getMessage();
      String encryptedTemp = "";
      boolean flag = false;
      
      unencryptedTemp = unencryptedTemp.toUpperCase();
      for(int i = 0; i < unencryptedTemp.length(); i++) {
         for(int j = 0; j < validMorseChars.length; j++) {
        	 if(validMorseChars[j] == unencryptedTemp.charAt(i)) {
        		 encryptedTemp = encryptedTemp + morseCode[j];
        		 if(unencryptedTemp.length() != i + 1) {
        			 encryptedTemp = encryptedTemp + " ";
        		 }
        		 flag = true;
            }else if(unencryptedTemp.charAt(i) == ' ') {
            	if(!flag) {
	              encryptedTemp = encryptedTemp + "|";
	              if(unencryptedTemp.length() != i + 1) {
	            	  encryptedTemp = encryptedTemp + " ";
	              }
	              flag = true;
	            }
            }else {
               //Does nothing, goes through the loop to check for the
               //next character to compare to the message.
            }
         }
         //If the flag is false, that current character in the string is invalid
         if(!flag) {
        	 throw new CipherException("Invalid character! Cannot convert to Morse Code!");
         }
         flag = false;
      }
      this.setEncryptedMessage(encryptedTemp);
      
   }
   
   /**
    * Decrypts a morse code message that is stored in encryptedMessage and stores in message
    * the corresponding unencrypted message.
    * @throws CipherException if invalid morse code was provided
    */
   public void decrypt() throws CipherException{
      String encryptedTemp = this.getEncryptedMessage();
      char[] encryptedChars = new char[encryptedTemp.length()];
      //This flag is used to detect invalid morse code
      boolean flag = false;
      //Stores one morse code at a time
      String morseWord = "";
      //The resulting decrypted message gets stored here
      String unencryptedTemp = "";
      //An index for encryptedChars
      int index = 0;
      
      //Puts all the characters in the encryptedTemp into an array of chars
      encryptedTemp.getChars(0, encryptedTemp.length(), encryptedChars, 0);
      
      //Loops through the each character in the morse code message until the last character
      while(index < encryptedChars.length) {
    	  morseWord = "";
    	  flag = false;
    	  
    	  //Goes through the array of chars and stops once it hits a space or a |
    	  //At the end of the loop a single morse code will be stored in morseWord
	      while(index < encryptedChars.length && encryptedChars[index] != ' ' && encryptedChars[index] != '|') {
	    	  morseWord = morseWord + encryptedChars[index];
	    	  index++;
	      }
	      
	      //If there is nothing in morseWord, the flag needs to be set to true as there is no morse code that can be invalid
	      if(morseWord.equals("")) {
	    	  flag = true;
	      }
	      
	      //Finds the corresponding character for the morse code stored in morseWord
	      if(!morseWord.equals("")) {
		      for(int i = 0; i < morseCode.length; i++) {
		    	  if(morseCode[i].equals(morseWord)) {
		    		  unencryptedTemp = unencryptedTemp + validMorseChars[i];
		    		  flag = true;
		    	  }
		      }
	      }
	     
	      //If there was no match, then invalid morse was provided and an exception will be thrown
	      if(!flag) {
	    	  throw new CipherException("Invalid Morse Code! Make sure to only enter valid morse!");
	      }
	      
	      
	      if(index < encryptedChars.length && encryptedChars[index] == ' ') {
	    	  index++;
	      }
	      
	      if(index < encryptedChars.length && encryptedChars[index] == '|') {
	    	  unencryptedTemp = unencryptedTemp + " ";
	    	  index++;
	      }
	      
      }
      this.setMessage(unencryptedTemp);
      
   }
   
   
   
}
