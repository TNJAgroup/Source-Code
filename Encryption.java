/**
 * @author Johnny Bac
 * @version 2
 * Last updated by: Johnny Bac
 * Last Date Changed: 4/14/2016
 * 
 * Encryption class provides the encrypt and decrypt methods for its subclasses 
 * and allows the user to get and set both the encryoted and unencrypted message.
 */

public abstract class Encryption {
   private String message;
   private String encryptedMessage;
   
   /**
    * Default constructor that sets the data field empty
    */
   public Encryption() {
      message = "";
      encryptedMessage = "";
   }
   
   /**
    * Constructor that allows for the message and encryptedMessage to be set
    * @param aMessage
    * @param aEncryptedMessage
    */
   public Encryption(String aMessage, String aEncryptedMessage) {
      message = aMessage;
      encryptedMessage = aEncryptedMessage;
   }
   
   /**
    * Gets the unencrypted message.
    * @return the unencrypted message.
    */
   public String getMessage() {
      return message;
   }
   
   /**
    * Sets the message.  The message should not be encrypted.
    * @param aMessage The unencrypted message to be set.
    */
   public void setMessage(String aMessage) {
      message = aMessage;
   }
   
   /**
    * Gets the encrypted message
    * @return the encrypted message
    */
   public String getEncryptedMessage() {
      return encryptedMessage;
   }
   
   /**
    * Sets the encrypted message.
    * @param aEncryptedMessage The encrypted message to be set
    */
   public void setEncryptedMessage(String aEncryptedMessage) {
      encryptedMessage = aEncryptedMessage;
   }
   
   /**
    * Abstract method that encrypts the message. Must be implemented 
    * in all subclasses!
    * 
    * encrypt should call setEncryptedMessage
    */
   public abstract void encrypt();
   
   /**
    * Abstract method that decrypts the message. Must be implemented 
    * in all subclasses!
    * 
    * decrypt should call setMessage
    */
   public abstract void decrypt();
}