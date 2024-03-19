import java.util.Scanner;
public class BruteForce
{
  public static final String ALPHABET ="abcdefghijklmnopqrstuvwxyz";
    
   public static String encryptData(String inputStr,int shiftkey)
   
   {
     
     inputStr=inputStr.toLowerCase();
  
     String encryptStr=""; 
     
     for(int i=0;i<inputStr.length();i++)
         {
             int pos=ALPHABET.indexOf(inputStr.charAt(i));
            
             int encryptPos=(shiftkey+pos)%26;
  
            char encryptChar=ALPHABET.charAt(encryptPos);

             encryptStr += encryptChar;
         }
       return encryptStr;
   }


public static String decryptData(String inputStr,int shiftkey)

{

  inputStr=inputStr.toLowerCase();
  String decryptStrr="";
  for(int key=0;key<=25;key++)
{
    String decryptStr="";
     for(int i=0;i<inputStr.length();i++)
         {
            
             int pos=ALPHABET.indexOf(inputStr.charAt(i));
            
             int decryptPos=(pos-key)%26;
  
             if(decryptPos<0)
             {
               decryptPos=ALPHABET.length()+decryptPos;

             }
                 char decryptChar=ALPHABET.charAt(decryptPos);
                    decryptStr += decryptChar;
         }
     System.out.println("Decrypted DaTA by Brute Force Key ====>>>"+ key +" "+ decryptStr);
         decryptStrr += decryptStr;
}   
  return decryptStrr;   
}
public static void main(String[] args)
{
     Scanner sc=new Scanner(System.in);
       
     System.out.println("Enter a String for Encryption Using Caesar Cipher");
       
     String inputStr=sc.nextLine();
   
     System.out.println("Enter the value by which character in Plaintext get Shifted");
     
    int shiftkey=Integer.valueOf(sc.nextLine());
    
    System.out.println("Encrypted DaTA ====>>>"+encryptData(inputStr,shiftkey));

    System.out.println("\nDecrypted DaTA ====>>>"+decryptData(encryptData(inputStr,shiftkey),shiftkey)+"  ");
  
   sc.close();
}
}