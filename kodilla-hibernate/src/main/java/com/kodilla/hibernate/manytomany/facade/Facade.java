package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class Facade {
    @Autowired
    public EmployeeDao employeeDao;

    @Autowired
    public CompanyDao companyDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);

    public void find (final String companyDigits, final String nameDigits) {
        LOGGER.info("Starting testing the Company findings...");

        List<Company> companyList = companyDao.retrieveCompanyNameByDigits(companyDigits);
        LOGGER.info("Number of companies found: " + companyList.size());
        LOGGER.info("List presented below:");

        for (int i=0; i<companyList.size(); i++) {
            LOGGER.info(companyList.get(i).getName());
        }

        LOGGER.info("Starting testing the Employee findings...");
        List<Employee> employeeList = employeeDao.retrieveEmployeeByDigits(nameDigits);
        LOGGER.info("Number of employees found: " + employeeList.size());
        LOGGER.info("List presented below:");

        for (int i=0; i<employeeList.size(); i++) {
            LOGGER.info(employeeList.get(i).getFirstname() + " " + employeeList.get(i).getLastname());
        }
    }

}
