package com.kodilla.testing.binary;

public class Binary {


    public int changeIntoInt(int binary){
        int result = 0;
        int potega = 0;


        while(true){
            if(binary==0){
                break;
            } else {
                int tmp =binary%10;
                result += tmp*Math.pow(2,potega);
                binary=binary/10;
                potega++;
            }
        }
        return result;
    }
}
