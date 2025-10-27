package org.example.leetcode.solution.learn;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RsaEncrypt {

    private static final String secretKeyString = "MIIBizANBgkqhkiG9w0BAQEFAAOCAXgAMIIBcwKCAWoAgDE2mhMNOP56LvfcYjOdOi+IwBJK3P+mS3mKxK7BtjmbxqmvdvSA1V6ojjogTmGcNuceHwrjCQwTv2R7XJ1q3uq8BJYuMEVmMXD7Y68zZxsFhur8GjdsWZrtUZ6hPwowsXaJl2KCUZGEha55xdY01Wkv45UGW4agKQPQ1+hSdOz3ypfCwCgWNv1MTUii0+Ih363emH/t69OXpaQQmnkVJ42ICS4A+EwPAitqFIoeC69nvSWJ1gFtmm2qOrKrV1Li42WKlLDi8qehGlKQWgmfVTY7MAF8pH+VtfChNyAKw89tfEoUVSJEbX7z2c2rCv/2uURlFl+2nfSEFHPUUaVmnPsn0JK//DRU279FQYO0wgu8P9zkxqMoo0QDd6AeCSHGZXZhNTiyX/pcBRnm3l+GTkpXm2nEAf88Q6Gim4mgCwddaRb2shMs2ZFx4OY1UcG7yQpRGHBBm3uwxDkjRuOPr1+qYzGB+8fFvQIDAQAB";

    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {

        String requestBodyAsString = "{\"otpData\":\"70704031235389007296\",\"amount\":10000,\"transactionId\":\"123\"}";

        PublicKey secretKey = decodePublicKey(secretKeyString);
        String requestBodyEncrypted = encrypt(requestBodyAsString, secretKey);

        System.out.println("requestBodyJsonFileAsString -> " + requestBodyEncrypted);
    }

    public static String encrypt(String content, Key pubKey) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        byte[] contentBytes = content.getBytes();
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, pubKey);
        byte[] cipherContent = cipher.doFinal(contentBytes);
        return Base64.getEncoder().encodeToString(cipherContent);
    }

    public static PublicKey decodePublicKey(String keyStr) throws NoSuchAlgorithmException, InvalidKeySpecException {
        byte[] keyBytes = Base64.getDecoder().decode(keyStr);
        X509EncodedKeySpec spec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        return keyFactory.generatePublic(spec);
    }
}
