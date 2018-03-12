package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {
    @Autowired
    private CompanyDao company;

    @Autowired
    private Employee employee;

    public List<Company> findCompany(final String arg ){

        List<Company> comp = company.retrieveCompanyNameBasedOn3MiddleDigits(arg);
        return comp;
    }

}
