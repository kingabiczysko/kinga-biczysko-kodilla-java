package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

@Autowired
InvoiceDao invoiceDao;
@Autowired
ItemDao itemDao;
//@Autowired
//ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given

        Product product1 = new Product("Blue Pen");
        Product product2 = new Product("Red Pen");
        Product product3 = new Product("Eraser");

        Item item1 = new Item(product1,new BigDecimal(5), 3, new BigDecimal(15));
        Item item2 = new Item(product2,new BigDecimal(20), 1, new BigDecimal(20));
        Item item3 = new Item(product3, new BigDecimal(10), 1, new BigDecimal(10));

        Invoice invoice1 = new Invoice("1/JAN/2018");
        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);
        invoice1.getItems().add(item3);

        product1.setItem(item1);
        product2.setItem(item1);
        product3.setItem(item1);

        //When
        itemDao.save(item1);
        itemDao.save(item2);
        itemDao.save(item3);
        invoiceDao.save(invoice1);

        int idInvoice = invoice1.getId();
        int idItem = item1.getId();

        //Then
        Assert.assertNotEquals(0,idInvoice);
        Assert.assertNotEquals(0, idItem);



        //CleanUp
        invoiceDao.delete(idInvoice);
    }
}
