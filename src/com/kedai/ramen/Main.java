package com.kedai.ramen;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputanUser = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda :");
        String namaUser = inputanUser.nextLine();

        System.out.println("Selamat Datang " + namaUser);
    }
}
