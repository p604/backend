package com.paulnaismyth.Service;

import com.paulnaismyth.Dao.InvoiceDao;
import com.paulnaismyth.Entity.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class InvoiceService {

    @Autowired
    private InvoiceDao invoiceDao;

    public Collection<Invoice> getAllInvoices(){
        return this.invoiceDao.getAllInvoices();
    }

    public void insertInvoiceToDb(Invoice invoice){
        this.invoiceDao.insertInvoiceToDb(invoice);
    }

    public Invoice getInvoiceById(int invoiceNumber){
        return this.invoiceDao.getInvoiceById(invoiceNumber);
    }

    public List<Invoice> findInvoicesByUserId(int id) {
        return invoiceDao.findInvoicesByUserId(id);
    }
}
