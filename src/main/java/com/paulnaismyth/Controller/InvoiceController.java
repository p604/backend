package com.paulnaismyth.Controller;

import com.paulnaismyth.Entity.Invoice;
import com.paulnaismyth.Service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("/api")
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

    @RequestMapping(value = "/invoices", method = RequestMethod.POST)
    @ResponseBody
    public Invoice insertInvoiceToDb(@RequestBody final Invoice invoice) throws Exception {
         return invoiceService.insertInvoiceToDb(invoice);
    }

    @RequestMapping(value = "/users/{id}/invoices", method = RequestMethod.GET )
    public List<Invoice> findInvoicesByUserId(@PathVariable("id") int id) throws Exception{
        return invoiceService.findInvoicesByUserId(id);
    }
}
