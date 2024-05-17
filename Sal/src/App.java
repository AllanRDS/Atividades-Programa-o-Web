
import java.security.*;
public class App {
    public static void main(String[] args) throws Exception {
       Sal sal = new Sal();
       Hash hash = new Hash();
       byte[] salHash;
       byte[] senhaHash;

       byte[] HashSal_Hash;

       senhaHash = hash.gerarHash();
       salHash = sal.gerarSal();

       byte[] Hash_Sal = new byte[salHash.length + senhaHash.length];
       System.arraycopy(senhaHash, 0, Hash_Sal, 0, senhaHash.length);
       System.arraycopy(salHash, 0, Hash_Sal, senhaHash.length, salHash.length);

       MessageDigest sr = MessageDigest.getInstance("SHA-512");
       HashSal_Hash = sr.digest(Hash_Sal);

       for (int i = 0; i < HashSal_Hash.length; i++) {
            System.out.println(HashSal_Hash[i]);
       }
    }
}
