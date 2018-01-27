package com.kodilla.rps;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class KeyXAsker {
    private final Scanner scanner;
    private final PrintStream out;

    public KeyXAsker(InputStream in, PrintStream out) {
        scanner=new Scanner(in);
        this.out = out;
    }

    public char ask(String message){
        System.out.println(message);
        return scanner.next().charAt(0);
    }
}
