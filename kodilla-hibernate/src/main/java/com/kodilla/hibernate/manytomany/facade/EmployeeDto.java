package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDto {
    private int id;
    private String firstname;
    private String lastname;
    private List<CompanyDto> companies = new ArrayList<>();
}
