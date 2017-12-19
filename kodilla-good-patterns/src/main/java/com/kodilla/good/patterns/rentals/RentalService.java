package com.kodilla.good.patterns.rentals;

import java.time.LocalDateTime;

interface RentalService {
    boolean rent(User user, LocalDateTime from, LocalDateTime to);
}
