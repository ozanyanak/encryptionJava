package com.company;

public class cevirimanager {
    public void cevirici(String metin) {
    String asciiString = "";
    for (int i = 0; i < metin.length(); i++) {
        if (i + 1 < metin.length()) {
            asciiString += (int) metin.charAt(i) + " ";
        } else asciiString += (int) metin.charAt(i);
    }
    byte[] bytes = asciiString.getBytes();

    StringBuilder binary = new StringBuilder();
    StringBuilder key = new StringBuilder();
    StringBuilder sif = new StringBuilder();

    for (byte b : bytes) {
        int val = b;
        int ks = b;
        int c;
        for (int j = 0; j < 8; j++) {
            int a = (val & 128) == 0 ? 0 : 1;

            if (j % 2 == 0) {
                c = 1;
            } else {
                c = 0;
            }
            if (a == (c)) {
                sif.append("0");
            } else {
                sif.append("1");
            }
            binary.append((val & 128) == 0 ? 0 : 1);
            val <<= 1;


        }
        for (int j = 0; j < 8; j++) {
            if (j % 2 == 0) {
                key.append("1");
            } else {
                key.append("0");
            }


        }
        binary.append(" ");
        key.append(" ");
        sif.append(" ");

    }
    System.out.println("asci hali :"+asciiString);

    System.out.println("binary hali:"+binary);

    System.out.println("anahtar:" + key);
    System.out.println("şifre:" + sif);



}
}
