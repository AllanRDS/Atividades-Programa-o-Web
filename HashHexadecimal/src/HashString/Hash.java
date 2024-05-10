package HashString;
import java.security.MessageDigest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;

import java.util.Scanner;

import javax.swing.text.StringContent;

public class Hash {
    Scanner input = new Scanner(System.in);
		
	String Senha;
	byte[] SenhaHash;
	String SenhaConvertida;
    String Resultado = "";
    

    public String gerarHash () throws Exception
		{
            MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
		    Senha = "senha secreta";
		    SenhaHash = algorithm.digest(Senha.getBytes("UTF-8"));
            for (byte b : SenhaHash) 
            {
                Resultado += String.format("%02X", 0xFF & b);
            }
            System.out.println(Resultado);
			return Resultado;
		}
}
