  import java.util.*;
  public class C4PP11 {
  
  public static void main(String[]args) {
    
    String encryptedMessage="";
    String decryptedMessage="";
    Scanner s = new Scanner(System.in);
    
    System.out.println("enter the message"+" so it can be encrypted");
    encryptedMessage = s.nextLine();
    System.out.println("the encrypted message is "+encryptedMessage);
    
    for (int key=1; key<100; key++){
      
      for(int index=0; index<encryptedMessage.length();index++) {
          
          char encryptedletter= encryptedMessage.charAt(index);
          char decryptedLetter;//case sensitive
          
          if(((int)encryptedletter+key)>126) {
            
            decryptedLetter=(char)(32+(encryptedletter+key-127)); }
              
              else {
                
                decryptedLetter=(char)(encryptedletter+key);} 
              
                decryptedMessage+=decryptedLetter; } 
            
            System.out.println("Decrypted Message at key"+key+" is "+decryptedMessage);
            
            decryptedMessage=""; 
        }
      }
    }     
             