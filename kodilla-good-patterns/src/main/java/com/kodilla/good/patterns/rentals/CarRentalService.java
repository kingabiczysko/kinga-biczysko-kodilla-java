package com.kodilla.good.patterns.rentals;

import java.time.LocalDateTime;

public class CarRentalService implements RentalService {

    public boolean rent(User user, LocalDateTime from, LocalDateTime to){
        System.out.println("rent");
        return true;
    }
}
