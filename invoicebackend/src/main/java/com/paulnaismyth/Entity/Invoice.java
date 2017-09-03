package com.paulnaismyth.Entity;

public class Invoice {

    private int invoiceNumber;
    private int invoiceDate;
    private int dueDate;
    private int balanceDue;
    private String customerName;
    private String customerAddress;
    private String customerEmail;
    private String item;
    private String description;
    private int cost;
    private int tax;
    private int itemTotal;
    private String terms;

    public Invoice(int invoiceNumber, int invoiceDate, int dueDate, int balanceDue, String customerName, String customerAddress, String customerEmail, String item, String description, int cost, int tax, int itemTotal, String terms) {
        this.invoiceNumber = invoiceNumber;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.balanceDue = balanceDue;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.item = item;
        this.description = description;
        this.cost = cost;
        this.tax = tax;
        this.itemTotal = itemTotal;
        this.terms = terms;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public int getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(int invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public int getBalanceDue() {
        return balanceDue;
    }

    public void setBalanceDue(int balanceDue) {
        this.balanceDue = balanceDue;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(int itemTotal) {
        this.itemTotal = itemTotal;
    }

    public String getTerms() {
        return terms;
    }

    public void setTerms(String terms) {
        this.terms = terms;
    }

}
