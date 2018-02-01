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
@Autowired
ProductDao productDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given

        Product product1 = new Product("Blue Pen");
        Product product2 = new Product("Notebook");

        Item item1 = new Item(product1, new BigDecimal(5), 10, new BigDecimal(50));
        Item item2 = new Item(product2, new BigDecimal(10), 1, new BigDecimal(10));

        Invoice invoice1 = new Invoice("1/JAN/2018");

        invoice1.getItems().add(item1);
        invoice1.getItems().add(item2);

        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);

        product1.setItem(item1);
        product2.setItem(item2);

        //When

        productDao.save(product1);
        productDao.save(product2);
        itemDao.save(item1);
        itemDao.save(item2);
        invoiceDao.save(invoice1);

        int id = invoice1.getId();
        int idItem1 = item1.getId();
        int idItem2 = item2.getId();
        int idProduct1 = product1.getId();
        int idProduct2 = product2.getId();

        //Then
        Assert.assertNotEquals(0,id);

        //CleanUp
        productDao.delete(idProduct1);
        productDao.delete(idProduct2);
        itemDao.delete(idItem1);
        itemDao.delete(idItem2);
        invoiceDao.delete(id);



    }
}
