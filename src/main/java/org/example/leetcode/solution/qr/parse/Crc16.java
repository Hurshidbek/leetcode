package org.example.leetcode.solution.qr.parse;

import java.nio.charset.StandardCharsets;

public class Crc16 {

    public static String calculate(String data) {
        int polynomial = 0x1021;
        int crc = 0xFFFF;

        byte[] bytes = data.getBytes(StandardCharsets.UTF_8);

        for (byte b : bytes) {
            crc ^= (b << 8);
            for (int i = 0; i < 8; i++) {
                if ((crc & 0x8000) != 0) {
                    crc = (crc << 1) ^ polynomial;
                } else {
                    crc <<= 1;
                }
                crc &= 0xFFFF;
            }
        }
        return String.format("%04X", crc);
    }
}
