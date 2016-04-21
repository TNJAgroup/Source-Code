/**
 * @author Johnny Bac
 * @version 3
 * Last Updated by: Johnny Bac
 * Last Date Changed: 4/17/2016 
 *
 * The Affine class take an A value and a B value and then encrypts a text message based on those values by shifting to
 * another index based on the Affine encryption algorithm.
 */
public class Affine extends Encryption {
   //Must be co-prime with m
   private int a;
   //can be an arbitrary number, 0 - 25 with the standard English alphabet
   private int b;
   
   private final int m = 26;
   private final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
		   						'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
	    						'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
   /**
    * Default constructor that sets the A and B values to its default starting values
    */
   public Affine() {
	   super();
	   a = 1;
	   b = 0;
   }
   
   /**
    * Sets A to a new A value
    * @param aValue Is the new A value to be set
    */
   public void setA(int aValue) {
	   a = aValue;
   }
   
   /**
    * Sets B to a new B value
    * @param bValue Is the new B value to be set
    */
   public void setB(int bValue) {
	   b = bValue;
   }
   
   /**
    * Gets the A value
    * @return the A value
    */
   public int getA() {
	   return a;
   }
   
   /**
    * Gets the B value
    * @return the B value
    */
   public int getB() {
	   return b;
   }
   
   /**
    * Encrypts the text message stored in message using the algorithm
    * encryptedMessage = (ax + b) mod m, where x is the index of the alphabet.
    */
   public void encrypt() {
      String temp = this.getMessage();
      temp = temp.toLowerCase();
      String result = "";
      //The flag gets set to true if the character in the string matches a letter in the alphabet
      boolean flag = false;
      for(int i = 0; i < temp.length(); i++) {
    	  flag = false;
    	  for(int j = 0; j < alphabet.length; j++) {
    		  if(temp.charAt(i) == alphabet[j]) {
    			  int newLetterIndex = (a * j + b) % m;
    			  result = result + alphabet[newLetterIndex];
    			  flag = true;
    		  }
    	  }
    	  if(!flag) {
    		  result = result + temp.charAt(i);
    	  }
      }
      this.setEncryptedMessage(result);
   }
   
   /**
    * Decrypts the text message stored in encryptedMessage using the algorithm
    * message = a^-1(x - b) mod m, where x is the index of the alphabet.
    */
   public void decrypt() {
      String temp = this.getEncryptedMessage();
      temp = temp.toLowerCase();
      String result = "";
      //The flag is true if the current character in the string being looked at matches a letter in the alphabet
      boolean flag = false;
      int inverseA = 0;
      //Loops through numbers 1 - 25, until the inverse of the A value is found
      for(int i = 1; i < 26; i++) {
    	  if((i * a) % m == 1) {
    		  inverseA = i;
    	  }
      }
      
      //Loops through the entire string and decrypts each character in the string
      for(int i = 0; i < temp.length(); i++) {
    	  flag = false;
    	  for(int j = 0; j < alphabet.length; j++) {
    		  if(temp.charAt(i) == alphabet[j]) {
    			  int newLetterIndex = (inverseA * (j - b)) % m;
    			  if(newLetterIndex < 0) {
    				  newLetterIndex = newLetterIndex * -1;
    				  newLetterIndex = m - newLetterIndex;
    			  }
    			  if(newLetterIndex == m) {
    				  newLetterIndex = 0;
    			  }
    			  result = result + alphabet[newLetterIndex];
    			  flag = true;
    		  }
    	  }
    	  if(!flag) {
    		  result = result + temp.charAt(i);
    	  }
      }
      this.setMessage(result);
   }
   
}