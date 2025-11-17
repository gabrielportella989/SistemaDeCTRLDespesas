import java.security.MessageDigest;

public class Criptografia {
    public static String sha256(String texto) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(texto.getBytes());

            StringBuilder sb = new StringBuilder();
            for (byte b : hash) sb.append(String.format("%02x", b));

            return sb.toString();
        } catch (Exception e) {
            return null;
        }
    }
}
