package com.kodilla.good.patterns.rentals;

import java.time.LocalDateTime;

public class CarRentalRepository implements RentalRepository {
    public void createRental(User user, LocalDateTime from, LocalDateTime to){
        System.out.println("Create rental");
    }
}
