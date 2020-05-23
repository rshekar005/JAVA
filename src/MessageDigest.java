
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Formatter;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class MessageDigest {
private static final String HMAC_SHA_1 = "HmacSHA1";
private static final String HMAC_SHA_256 = "HmacSHA256";

private static String toHexString(byte[] bytes)
{
Formatter formatter = new Formatter();
for (byte b : bytes)
{
formatter.format("%02x", b);
}
return formatter.toString();
}
public static String getHMAC_sha1(String data, String key) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
return calculateHMAC(data, key, HMAC_SHA_1);
}

public static String getHMAC_sha256(String data, String key) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
return calculateHMAC(data, key, HMAC_SHA_256);
}

private static String calculateHMAC(String data, String key, String algo) throws SignatureException, NoSuchAlgorithmException, InvalidKeyException {
SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(), algo);
Mac mac = Mac.getInstance(algo);
mac.init(secretKeySpec);
return toHexString(mac.doFinal(data.getBytes()));
}

public static void main(String[] args) throws Exception {
System.out.println("SHA1 ------> " + getHMAC_sha1("5e7bb2ff6016bd6a379a2fcd+client_id_j6kV25MAYNUg7u0Xy3eI0tvFirTsmoPWfaGhcHDQ", "client_secret_6yG4kfLwRpreIKNQaW8JOhBAFqnPd9cjTmgbsZ7z"));
System.out.println("SHA256 ----> " + getHMAC_sha256("5e7bb2ff6016bd6a379a2fcd+client_id_j6kV25MAYNUg7u0Xy3eI0tvFirTsmoPWfaGhcHDQ", "client_secret_6yG4kfLwRpreIKNQaW8JOhBAFqnPd9cjTmgbsZ7z"));



//AWS QA
// client_id_j6kV25MAYNUg7u0Xy3eI0tvFirTsmoPWfaGhcHDQ
//client_secret_6yG4kfLwRpreIKNQaW8JOhBAFqnPd9cjTmgbsZ7z


//SIT
// client_id_0K9bTcgnGHOkzyhX7560wZaBrYPxSQtVNUfLdmjI|client_secret_i5l41AsY6aeBDr0SpWPFKN72uoJ80XbjECVQn3Mq
//client_id_0K9bTcgnGHOkzyhX7560wZaBrYPxSQtVNUfLdmjI|client_secret_i5l41AsY6aeBDr0SpWPFKN72uoJ80XbjECVQn3Mq


// System.out.println("SHA1 ------> " + getHMAC_sha1("5d44e71aeb1dbcb580be5c56+client_id_0K9bTcgnGHOkzyhX7560wZaBrYPxSQtVNUfLdmjI", "client_secret_i5l41AsY6aeBDr0SpWPFKN72uoJ80XbjECVQn3Mq"));
// System.out.println("SHA256 ----> " + getHMAC_sha256("5d44e71aeb1dbcb580be5c56+client_id_0K9bTcgnGHOkzyhX7560wZaBrYPxSQtVNUfLdmjI", "client_secret_i5l41AsY6aeBDr0SpWPFKN72uoJ80XbjECVQn3Mq"));

}

}