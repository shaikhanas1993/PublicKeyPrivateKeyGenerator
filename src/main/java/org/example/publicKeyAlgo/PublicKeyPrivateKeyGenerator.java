package org.example.publicKeyAlgo;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;

public class PublicKeyPrivateKeyGenerator {
    public static void main(String[] args) {
        try {

            // 1. generate public key and private key
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(1024); // key length
            KeyPair keyPair = keyPairGenerator.genKeyPair();
            String privateKeyString = Base64.encodeToString(keyPair.getPrivate().getEncoded(), Base64.DEFAULT);
            String publicKeyString = Base64.encodeToString(keyPair.getPublic().getEncoded(), Base64.DEFAULT);

            // 2. print both keys
            System.out.println("rsa key pair generated\n");
            System.out.println("privateKey\n" + privateKeyString + "\n");
            System.out.println("publicKey\n" + publicKeyString + "\n\n");

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }
}
