package com.kodilla.testing.ciag;

public class CiagFibanaci {

    public int fibanaciCalculation(int ilosc){

        if(ilosc==0) return 0;
        else if(ilosc == 1) return 1;
        else {
            return fibanaciCalculation(ilosc-1)+fibanaciCalculation(ilosc-2);
        }

    }

}
