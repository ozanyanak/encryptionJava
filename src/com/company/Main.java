package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String binary="";
        String metin="";
        Scanner scanner= new Scanner(System.in);
        System.out.println("lütfen şifrelemek istediğiniz metini girin");
        metin=scanner.nextLine();
        cevirimanager cevirimanager= new cevirimanager();
        cevirimanager.cevirici(metin);    }
}
