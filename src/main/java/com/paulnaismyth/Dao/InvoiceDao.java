package com.paulnaismyth.Dao;
import com.paulnaismyth.Entity.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class InvoiceDao {

    private static Map<Integer, Invoice> invoices;

    static {

        invoices = new HashMap<Integer, Invoice>() {
            {
                put(1, new Invoice(1, 1 / 1 / 2017,
                        2 / 1 / 2017, 100, "Paul",
                        "123 fake", "paul@email.com", "service",
                        "service", 97, 3, 100, "net 30"));

            }

        };
    }

    public Collection<Invoice> getAllInvoices(){
        return this.invoices.values();
    }

    public Invoice getInvoiceById(int invoiceNumber){
        return this.invoices.get(invoiceNumber);
    }

    public Invoice insertInvoiceToDb(Invoice invoice) {
        return this.invoices.put(invoice.getInvoiceNumber(), invoice);
    }

    @Query
    public List<Invoice> findInvoicesByUserId(int id){
        return new ArrayList(this.invoices.values());
    }


}