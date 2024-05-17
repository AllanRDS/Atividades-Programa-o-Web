
import java.security.SecureRandom;

public class Sal {
     public byte[] gerarSal()
        {
            byte[] sal = new byte[16];
    
            SecureRandom random = new SecureRandom();
            random.nextBytes(sal);

            return sal;

        }
}
