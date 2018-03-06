package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    private List<Company> companies;
    private Employee employee;


}
