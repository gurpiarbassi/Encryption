package com.gurps.encryption.cipher;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSubstitutionCipher {

  @Test
  public void testEncrypt() {
    final String message = "Hello World.";
    SubstitutionCipher cipher = new SubstitutionCipher();
    String encryptedMessage = cipher.encrypt(message);
    
    assertEquals("9((6^^13#13#16^*9124$16^19(13#5%%*92", encryptedMessage);
  }
  
  @Test
  public void testDecrypt() {
    final String encryptedMessage = "9((6^^13#13#16^*9124$16^19(13#5%%*92";
    SubstitutionCipher cipher = new SubstitutionCipher();
    String decryptedMessage = cipher.decrypt(encryptedMessage);
    
    assertEquals("HELLO WORLD.", decryptedMessage);
  }

}
