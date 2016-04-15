/**
 * @author Johnny Bac
 * @version 2
 * Last Updated by: Johnny Bac
 * Last Date Changed: 4/14/2016 
 *
 * The Affine class
 */
public class Affine extends Encryption {
   //Must be coprime with m
   private int a;
   //can be an arbitrary number
   private int b;
   
   private final int m = 26;
   private final char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
		   						'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
	    						'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
   /**
    * 
    */
   public Affine() {
	   super();
	   a = 1;
	   b = 1;
   }
   
   public void setA(int aValue) {
	   a = aValue;
   }
   
   public void setB(int bValue) {
	   b = bValue;
   }
   
   public int getA() {
	   return a;
   }
   
   public int getB() {
	   return b;
   }
   
   public void encrypt() {
      String temp = this.getMessage();
      temp.toLowerCase();
      String result = "";
      for(int i = 0; i < temp.length(); i++) {
    	  for(int j = 0; j < alphabet.length; j++) {
    		  if(temp.charAt(i) == alphabet[j]) {
    			  int newLetterIndex = (a * j + b) % m;
    			  result = result + alphabet[newLetterIndex];
    		  }
    	  }
    	  if(temp.charAt(i) == ' ') {
    		  result = result + ' ';
    	  }
      }
      this.setEncryptedMessage(result);
   }
   
   public void decrypt() {
      String temp = this.getEncryptedMessage();
      temp.toLowerCase();
      String result = "";
      for(int i = 0; i < temp.length(); i++) {
    	  for(int j = 0; j < alphabet.length; j++) {
    		  if(temp.charAt(i) == alphabet[j]) {
    			  int newLetterIndex = (int)((((double)(1 / a)) * ((double)(j - b))) % m);
    			  result = result + alphabet[newLetterIndex];
    		  }
    	  }
    	  if(temp.charAt(i) == ' ') {
    		  result = result + ' ';
    	  }
      }
      this.setMessage(result);
   }
   
}