import java.security.*;
public class Hash {
    String Senha = "Palavra Secreta";
    byte[] senhaHash = new byte[16];

    public byte[] gerarHash() throws Exception
    {
        MessageDigest message = MessageDigest.getInstance("SHA-512");
        senhaHash = message.digest(Senha.getBytes());
        return senhaHash;
    }

}
