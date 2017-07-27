import java.io.*;
import java.util.*;
public class encrypt
{
public static final String MK = &quot;abcdefghijklmnopqrstuvwxyz&quot;;
public static String encrypt(String plainText, int shiftKey)
{
plainText = plainText.toLowerCase();
String cipherText = &quot;&quot;;
for (int i = 0; i&lt;plainText.length(); i++)
{
int charPosition = MK.indexOf(plainText.charAt(i));
int keyVal = (shiftKey + charPosition) % 26;
char replaceVal = MK.charAt(keyVal);
cipherText += replaceVal;

}
return cipherText;
}
public static String decrypt(String cipherText, int shiftKey)
{
cipherText = cipherText.toLowerCase();
String plainText = &quot;&quot;;
for (int i = 0; i&lt;cipherText.length(); i++)
{
int charPosition = MK.indexOf(cipherText.charAt(i));
int keyVal = (charPosition - shiftKey) % 26;
if (keyVal&lt; 0)
{
keyVal = MK.length() + keyVal;
}
char replaceVal = MK.charAt(keyVal);
plainText += replaceVal;
}
return plainText;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println(&quot;Enter the String for Encryption: &quot;);
String message = new String();

message = sc.next();
System.out.println(&quot;Encryption message= &quot; + encrypt(message, 10));
System.out.println(&quot;Decryption message= &quot; + decrypt(encrypt(message, 10), 10));
sc.close();
}
}
