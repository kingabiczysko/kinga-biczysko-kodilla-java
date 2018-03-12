package com.kodilla.testing.binary;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Binary {


    public double changeIntoInt(int binary){
        String binaryString = String.valueOf(binary);
        int l = binaryString.length();
        int [] tabelaBinary = new int[l];
        int [] tabelaPotega1 = new int[l];
        int [] tabelaPotega2 = new int[l];
        int [] tabelaFinal = new int[l];


        tabelaBinary = binaryString.chars().toArray();

        for(int n=0; n<l; n++) {
            if (tabelaBinary[n] == 49) {
                tabelaBinary[n] = 1;
            } else tabelaBinary[n] = 0;
        }

        for (int n=0;n<l;n++){
            tabelaPotega1[n] = (int)Math.pow(2,n);
        }

        tabelaPotega2 = IntStream.rangeClosed(1,l).map(i->tabelaPotega1[l-i]).toArray();

        for(int n=0; n<l; n++) {
            tabelaFinal[n] = tabelaBinary[n] * tabelaPotega2[n];
        }

        return (Arrays.stream(tabelaFinal)
                .sum());

    }
}
