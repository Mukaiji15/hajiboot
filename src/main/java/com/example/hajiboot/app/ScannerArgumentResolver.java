package com.example.hajiboot.app;

import java.io.InputStream;
import java.util.Scanner;



public class ScannerArgumentResolver implements ArgumentResolver {
    @Override
    public Argument resolve(InputStreak stream){
        Scanner scanner = new Scanner(stream);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        return new Argument(a, b);
    }
}
