package com.kodilla.hibernate.manytomany.facade;

import java.util.ArrayList;
import java.util.List;

public class CompanyDto {
    private int id;
    private String name;
    private List<EmployeeDto> employees = new ArrayList<>();
}



