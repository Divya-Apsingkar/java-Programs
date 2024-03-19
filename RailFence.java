import java.util.Arrays;
class RailFence
{
    public static String EncryptRailFence(String text , int key)
      {
             char[] [] rail = new char[key][text.length()];
              for(int i=0;i<key;i++)
           
                      Arrays.fill(rail[i],'\n');
                      boolean dirDown =false;
                      int row=0 , col=0;
                    for(int i=0;i< text.length();i++)
                      {
                         if(row ==0 || row ==key-1)
                            dirDown =! dirDown;
                          rail[row][col++] = text.charAt(i);
                           if(dirDown)
                             row++;
                           else
                             row--;
                      }
               StringBuilder result = new StringBuilder();
               for(int i=0;i<key;i++)
                  for(int j=0;j<text.length();j++)
                       if(rail[i][j] != '\n')
                        result.append(rail[i][j]);  
                            
            return result.toString();
      }

     public static String DecryptRailFence(String Cipher , int key)
     {
             char[][] rail = new char[key][Cipher.length()];
              for(int i=0;i<key;i++)
               Arrays.fill(rail[i],'\n');
               boolean dirDown =true;
                int row =0, col =0;
               for(int i=0;i< Cipher.length();i++)
                      {
                         if(row ==0)
                            dirDown =true;
                         if(row == key-1)
                            dirDown =false;
                             rail[row][col++]='*';
                           if(dirDown)
                             row++;
                           else
                             row--;
                      }
                  int index =0;
                    for(int i=0;i<key;i++)
                   for(int j=0; j< Cipher.length();j++)
                    if(rail[i][j] =='*' && index<Cipher.length())  
                       rail[i][j] =Cipher.charAt(index++);
                        StringBuilder result = new StringBuilder();
                       row =0;
                       col =0;
                      for(int i=0;i< Cipher.length();i++)
                          {
                          if(row ==0)
                            dirDown =true;
                         if(row == key-1)
                            dirDown =false;
                         if(rail[row][col] !='*')
                         result.append(rail[row][col++]); 
                           if(dirDown)
                             row++;
                           else
                             row--;
                          }
                        return result.toString();
                         
     }

   public static void main(String args[])
       {
       System.out.println(" Encrypted Message: ");
        System.out.println( EncryptRailFence("Apsingkar", 2));
        System.out.println( EncryptRailFence("Divya", 3));
        System.out.println( EncryptRailFence("Avinash", 3));

       System.out.println("\n Decrypted Message: ");
        System.out.println( DecryptRailFence("Asnkrpiga", 2));
        System.out.println( DecryptRailFence("Daiyv", 3));
        System.out.println( DecryptRailFence("Aavnsih", 3));
       }
}