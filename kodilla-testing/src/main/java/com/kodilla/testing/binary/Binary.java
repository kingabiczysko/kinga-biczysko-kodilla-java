package com.kodilla.testing.binary;

public class Binary {


    public double changeIntoInt(int binary){
        String binaryString = String.valueOf(binary);
        int l = binaryString.length();
        int result = 0;
        int potega = 0;


        int [] tabelaBinary = binaryString.chars().toArray();

        for(int n=0; n<l; n++) {
            if (tabelaBinary[n] == 49) {
                tabelaBinary[n] = 1;
            } else tabelaBinary[n] = 0;
        }

        for(int i=tabelaBinary.length-1; i>=0; i--){
            if(tabelaBinary[i] == 1){
                result += (int) Math.pow(2,potega);
            }
            potega++;
        }

        return result;
    }
}
