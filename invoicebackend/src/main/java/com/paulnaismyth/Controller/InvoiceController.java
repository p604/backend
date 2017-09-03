package com.paulnaismyth.Controller;

import com.paulnaismyth.Entity.Invoice;
import com.paulnaismyth.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Invoice> getAllInvoices(){
        return invoiceService.getAllInvoices();
    }

    @RequestMapping(value = "{invoice}", method = RequestMethod.GET)
    public Invoice getInvoiceById(@PathVariable("invoice") int invoiceNumber){
        return invoiceService.getInvoiceById(invoiceNumber);
    }
}
