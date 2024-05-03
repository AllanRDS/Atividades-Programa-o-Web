package teste1;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import javax.security.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String Senha;
		byte[] SenhaByte;
		byte[] SenhaHash;
		
		String SenhaFixa = "Cachorro";
		byte[] SenhaFixaByte;
		byte[] SenhaFixaHash;
		
		
		try {
			MessageDigest sr = MessageDigest.getInstance("MD5");
			String str = sr.toString();
			
			System.out.println("Digite a sua senha : ");
			Senha = input.nextLine();
			
			SenhaByte = Senha.getBytes("UTF-8");
			SenhaHash = sr.digest(SenhaByte);
			
			SenhaFixaByte = SenhaFixa.getBytes("UTF-8");
			SenhaFixaHash = sr.digest(SenhaFixaByte);
			
			if (sr.isEqual(SenhaHash, SenhaFixaHash))
			{
				System.out.println("Senha correta");
			}
			else
			{
				System.out.println("Senha incorreta");
			}
			
			
			System.out.println("Status : " + str);
		}
		
		catch (NoSuchAlgorithmException e)
		{
			System.out.println("Algoritmimo não disponível : " + e);
		}
		
		catch (NullPointerException e)
		{
			System.out.println("Parâmetro nulo : " + e);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
