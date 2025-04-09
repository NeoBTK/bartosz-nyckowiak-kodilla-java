package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Product1");
        Product product2 = new Product("Product2");
        Product product3 = new Product("Product3");

        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);

        Item item1 = new Item(product1, BigDecimal.valueOf(20), 3, BigDecimal.valueOf(60));
        Item item2 = new Item(product2, BigDecimal.valueOf(30), 1, BigDecimal.valueOf(30));
        Item item3 = new Item(product2, BigDecimal.valueOf(30), 4, BigDecimal.valueOf(120));
        Item item4 = new Item(product3, BigDecimal.valueOf(10), 2, BigDecimal.valueOf(20));
        Item item5 = new Item(product1, BigDecimal.valueOf(20), 5, BigDecimal.valueOf(100));
        Item item6 = new Item(product3, BigDecimal.valueOf(10), 2, BigDecimal.valueOf(20));
        Item item7 = new Item(product3, BigDecimal.valueOf(10), 1, BigDecimal.valueOf(20));
        Item item8 = new Item(product2, BigDecimal.valueOf(30), 3, BigDecimal.valueOf(90));

        List<Item> items1 = new ArrayList<>();
        List<Item> items2 = new ArrayList<>();
        List<Item> items3 = new ArrayList<>();

        items1.add(item1);
        items1.add(item6);
        items1.add(item7);
        items2.add(item2);
        items2.add(item4);
        items2.add(item5);
        items3.add(item3);
        items3.add(item8);

        Invoice invoice1 = new Invoice("Inv001", items1);
        Invoice invoice2 = new Invoice("Inv002", items2);
        Invoice invoice3 = new Invoice("Inv003", items3);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getId();
        invoiceDao.save(invoice2);
        int invoice2Id = invoice2.getId();
        invoiceDao.save(invoice3);
        int invoice3Id = invoice3.getId();

        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);
        assertNotEquals(0, invoice3Id);

        //CleanUp
        try {
            productDao.deleteById(product1.getId());
            productDao.deleteById(product2.getId());
            productDao.deleteById(product3.getId());
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
            invoiceDao.deleteById(invoice3Id);

        } catch (Exception e) {
            //do nothing
        }
    }
}
