package com.gurps.encryption.cipher;

import java.util.HashMap;
import java.util.Map;

/**
 * Very basic substitution cipher that simply replaces each character in a string with another
 * String. If the character is not found then it substitutes a '*91' instead.
 * 
 * @author gurps.bassi
 *
 */
public class SubstitutionCipher {

  private static Map <String, String> substitutionMap = new HashMap<>();
  
  static {
    substitutionMap.put("A", "2@");
    substitutionMap.put("B", "3#");
    substitutionMap.put("C", "4$");
    substitutionMap.put("D", "5%");
    substitutionMap.put("E", "6^");
    substitutionMap.put("F", "7&");
    substitutionMap.put("G", "8*");
    substitutionMap.put("H", "9(");
    substitutionMap.put("I", "10)");
    substitutionMap.put("J", "11!");
    substitutionMap.put("K", "12@");
    substitutionMap.put("L", "13#");
    substitutionMap.put("M", "14$");
    substitutionMap.put("N", "15%");
    substitutionMap.put("O", "16^");
    substitutionMap.put("P", "17&");
    substitutionMap.put("Q", "18*");
    substitutionMap.put("R", "19(");
    substitutionMap.put("S", "20)");
    substitutionMap.put("T", "21!");
    substitutionMap.put("U", "22@");
    substitutionMap.put("V", "23#");
    substitutionMap.put("W", "24$");
    substitutionMap.put("X", "25%");
    substitutionMap.put("Y", "26^");
    substitutionMap.put("Z", "27&");
}
      
  public String encryptChar(char c){
    String cipherChar = substitutionMap.get((c + "").toUpperCase());
    if(cipherChar == null){
      //default to *91.
      cipherChar = "*91";
    }
    
    return cipherChar;
  }
  
  public String encrypt(String message){
    if(message == null || message.length() == 0){
      return "";
    }
    
    StringBuilder output = new StringBuilder();
    
    message.chars().forEach(i -> output.append(encryptChar((char)i)));
    return output.toString();
  }
}
