import java.io.*;
class CFG
{
  public static char normalChar[]
  ={ 'a','b','c','d','e','f','g','h','i',
     'j','k','l','m','n','o','p','q','r',
     's','t','u','v','w','x','y','z'};
 
  public static char codedChar[]
 ={'Q','W','E','R','T','Y','U','I','O','P',
   'A','S','D','F','G','H','J','K','L','Z',
   'X','C','V','B','N','M'};
public static String StringEncryption(String s)
{
   String encryptedString="";
   for(int i=0;i< s.length();i++)
       {
        for(int j=0;j<26;j++)
         
          if(s.charAt(i) == normalChar[j])
          {
            encryptedString += codedChar[j];
            break;
          }
            if(s.charAt(i)<'a' || s.charAt(i)>'z')
           {
                    encryptedString += s.charAt(i);
                    break;
          }
       }
  return encryptedString;
}
  
public static String stringDecryption(String s)
    {
        String decryptedString="";
   for(int i=0;i<s.length();i++)
       {
        for(int j=0;j<26;j++)
         
          if(s.charAt(i) == codedChar[j])
          {
            decryptedString += normalChar[j];
            break;
          }
            if(s.charAt(i)<'A' || s.charAt(i)>'Z')
           {
                    decryptedString += s.charAt(i);
                    break;
          }
       }
    return decryptedString;
   }
public static void main(String args[])
    {
        String str = "Apsingkar";
        System.out.println("Plain text: " + str);
        String encryptedString = StringEncryption(str.toLowerCase());
        System.out.println("Encrypted message: " + encryptedString);
        System.out.println("Decrypted message: " + stringDecryption(encryptedString));   
    }
}