import java.util.*;

class EncryptDecrypt{
	public void Encrypt(String input, char Alphabet[], String[] CipherText){
		String s =" ";
		char ch[] = input.toCharArray();
		for(int i=0; i<ch.length; i++){
			for(int j=0; j<Alphabet.length; j++){
				if(ch[i]==Alphabet[j]){
					s=s+CipherText[j];
				}
			}
		}
		System.out.println("After Encryption "+s);

	}
	public void Decrypt(String input1, char Alphabet[], String[] CipherText){
		String s1 ="";
		String []splt = input1.split(" ");
		for(int i=0; i<splt.length; i++){
			for(int j=0; j<CipherText.length; j++){
				if(splt[i].equals(CipherText[j])){
					s1=s1+Alphabet[j];
				}
			}
		}
		System.out.println("After Decryption: "+s1);
	}

}
public class MorseEncryptDecryptApp{
	public static void main(String x[]){
		
		char[] Aplphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
			 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z',
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

		String [] CipherText = {"..-",".--","--.","---","..."};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string to encrypt : ");
		String input = sc.nextLine();
 
		EncryptDecrypt obj = new EncryptDecrypt();
		obj.Encrypt(input, Aplphabet, CipherText);
		
		System.out.println("Enter string to decrypt: ");
		String input1 = sc.nextLine();
		obj.Decrypt(input1, Aplphabet, CipherText);
	}
}